package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;



public class Deposite extends JFrame implements ActionListener{
     
    static String pinnum;

    TextField t1;
    JButton b1,b2;
    Deposite(String pinnum){
      
        Deposite.pinnum=pinnum;



        
      ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bg.jpg"));
      Image i2=i1.getImage().getScaledInstance(1500, 835,Image.SCALE_DEFAULT);
      ImageIcon i3=new ImageIcon(i2);
      JLabel l3=new JLabel(i3);
      l3.setBounds(0,0,1500,835);
      add(l3);
    


      JLabel l1=new JLabel("ENTER AMOUNT YOU WANT TO DIPOSITE.");
      l1.setBounds(560,180,700,35);
      l1.setFont(new Font("Arial",Font.BOLD,23));
      l1.setForeground(Color.BLACK);
      l3.add(l1);

      t1 = new TextField();
      t1.setBackground(Color.WHITE);
      t1.setForeground(Color.BLACK);
      t1.setBounds(642,290,360,25);
      t1.setFont(new Font("Raleway", Font.BOLD,22));
      l3.add(t1);

      b1 = new JButton("DEPOSIT");
      b1.setBounds(900,450,150,35);
      b1.setBackground(Color.BLUE);
      b1.setForeground(Color.WHITE);
      b1.addActionListener(this);
      l3.add(b1);

      b2 = new JButton("BACK");
      b2.setBounds(600,450,150,35);
      b2.setBackground(Color.RED);
      b2.setForeground(Color.WHITE);
      b2.addActionListener(this);
      l3.add(b2);




       setLayout(null);
       setBounds(0,0,1750,900);
       setVisible(true);
       setTitle("Deposite Form");
    }


    public void actionPerformed(ActionEvent e) {
        try {
            String amount = t1.getText();
            Date date = new Date();
            if (e.getSource()==b1){
                if (t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the Amount you want to Deposit");
                }else {
                    conn c1 = new conn();
                    String qu="INSERT INTO bankd values('"+pinnum+"', '"+date+"','Deposit', '"+amount+"')";
                    c1.statement.executeUpdate(qu);
                    JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposited Successfully");
                    setVisible(false);
                   new mainfile(pinnum);
                    
                }
            }else if (e.getSource()==b2){
                setVisible(false);
                new mainfile(pinnum);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Deposite(pinnum);
    }
}
