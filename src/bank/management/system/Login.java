
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener {

    JTextField t1;
    JPasswordField t2;
    JButton login,signup,clear;
   


String pinnum;

    public Login(String pinnum){

         this.pinnum=pinnum;


        setTitle("Bank Management System ");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2= i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image1= new JLabel(i3);
        image1.setBounds(490,40,100,100);
        add(image1);




        ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2=ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3= new ImageIcon(ii2);
        JLabel image2=new JLabel(ii3);
        image2.setBounds(850,425,100,100);
        add(image2);

        JLabel label1=new JLabel("Welcome To SGI Bank");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("Arial",Font.BOLD,20));
        label1.setBounds(430,90,500,150);
        add(label1);

        JLabel label2=new JLabel("Enter Login ID:");
        label2.setBounds(350,150,150,150);
        label2.setFont(new Font("Raleway ",Font.BOLD,15));
        label2.setForeground(Color.BLACK);
        add(label2);

        t1=new JTextField(12);
        t1.setBounds(490,215,160,18);
        t1.setFont(new Font("Arial",Font.ROMAN_BASELINE,14));
        add(t1);

        JLabel label3=new JLabel("Enter Password:");
        label3.setBounds(350,205,150,150);
        label3.setFont(new Font("Raleway",Font.BOLD,15));
        label3.setForeground(Color.black);
        add(label3);

        t2= new JPasswordField(8);
        t2.setBounds(490,271,160,18);
        t2.setEchoChar('*');
        t2.setFont (new Font("Arial",Font.ROMAN_BASELINE,20));
        add(t2);





        ImageIcon iii1= new ImageIcon(ClassLoader.getSystemResource(""));//image url//
        Image iii2= iii1.getImage().getScaledInstance(1050,850,Image.SCALE_DEFAULT);
        ImageIcon iii3=new ImageIcon(iii2);
        JLabel image3= new JLabel(iii3);
        image3.setBounds(0,0,1050,850);
        add(image3);


         signup=new JButton("Sign Up");
         signup.setBounds(410, 360, 90, 27);
         signup.setBackground(Color.black);
         signup.setForeground(Color.WHITE);
         signup.setFont(new Font("Arial",Font.BOLD,14));
         signup.addActionListener(this);
         add(signup);

         clear=new JButton("Clear");
         clear.setBounds(580,360,90,27);
         clear.setBackground(Color.BLACK);
         clear.setForeground(Color.WHITE);
         clear.setFont(new Font("Arial",Font.BOLD,14));
         clear.setVisible(true);
         clear.addActionListener(this);
         add(clear);


         login=new JButton("Sign In");
         login.setBounds(496,430,90,27);
         login.setBackground(Color.BLACK);
         login.setForeground(Color.WHITE);
         login.setFont(new Font("Arial",Font.BOLD,14));
         login.addActionListener(this);
         add(login);

        

        setLayout(null);
        setSize(1050,550);
        setVisible(true);
        setLocation(450,200);
        setBackground(Color.LIGHT_GRAY);


    }

    public void actionPerformed(ActionEvent e){

        String id=t1.getText();
        String pass=t2.getText();
        try{
           
            if (e.getSource()==login){
                conn c = new conn();
                String cardnum = t1.getText();
                String pin = t2.getText();
                String q = "select * from login where card_number = '"+cardnum+"' and  pin = '"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new mainfile(pin);
                }
            
                else if (id.equals("")) {
                        JOptionPane.showMessageDialog(null,"Please Enter Your Card Number.");  
                        
                    }
                    else if (pass.equals("")) {

                        JOptionPane.showMessageDialog(null,"Please Enter Your PIN.");  
                    }
                   
                  else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                }


            }else if (e.getSource() == clear){
                t1.setText("");
                t2.setText("");


            }
                
           
            
            else if (e.getSource() == signup){
                new signup();
                setVisible(false);
            }
        }

       
    catch(Exception ea){
        ea.printStackTrace();
    }


}


    public static void main(String[] args) {
        new Login("");
    }
}

