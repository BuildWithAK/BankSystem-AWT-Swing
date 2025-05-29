package bank.management.system;

import java.awt.event.*;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mainfile extends JFrame implements ActionListener {



    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    String pinnum;
    public mainfile(String pinnum){
        this.pinnum=pinnum;


        ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.jpg"));
        Image i1=ii1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(i1);
        JLabel l3=new JLabel(i2);
        l3.setBounds(0,0,1550,830);
        add(l3);


        JLabel label = new JLabel("Please Select Your Transaction");
        label.setBounds(600,12,700,35);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Arial",Font.BOLD,28));
        l3.add(label);

        b1 = new JButton("DEPOSIT");
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.magenta);
        b1.setBounds(330,85,150,35);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("CASH WITHDRAWL");
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        b2.setBounds(600,85,150,35);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("FAST CASH");
        b3.setForeground(Color.white);
        b3.setBackground(Color.magenta);
        b3.setBounds(464,140,150,35);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("MINI STATEMENT");
        b4.setForeground(Color.WHITE);
        b4.setBackground(Color.BLACK);
        b4.setBounds(1000,85,150,35);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("PIN CHANGE");
        b5.setForeground(Color.WHITE);
        b5.setBackground(Color.magenta);
        b5.setBounds(1129,140,150,35);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("BALANCE ENQUIRY");
        b6.setForeground(Color.WHITE);
        b6.setBackground(Color.magenta);
        b6.setBounds(1260,85,150,35);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("EXIT");
        b7.setForeground(Color.WHITE);
        b7.setBackground(Color.RED);
        b7.setBounds(804,140,150,35);
        b7.addActionListener(this);
        l3.add(b7);

        b8 = new JButton("BACK");
        b8.setForeground(Color.WHITE);
        b8.setBackground(Color.BLUE);
        b8.setBounds(804,85,150,35);
        b8.addActionListener(this);
        l3.add(b8);

        b9 = new JButton("SIGN IN");
        b9.setFont(new Font("Arial",Font.BOLD,25));
        b9.setForeground(Color.WHITE);
        b9.setBackground(Color.BLUE);
        b9.setBounds(154,508,215,55);
        b9.addActionListener(this);
        l3.add(b9);

setLayout(null);
setVisible(true);
setBounds(0,0,1750,900);




    }


    
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==b1){
            new Deposite(pinnum);
             setVisible(false);

         }else if (e.getSource()==b7){
             System.exit(0);

         }else if (e.getSource()==b2) {
             new Withdrawl(pinnum);
             setVisible(false);

         } else if (e.getSource()==b6) {
             new Bal(pinnum);
             setVisible(false);

         }else if (e.getSource()==b3) {
             new fastcash(pinnum);
             setVisible(false);

         } else if (e.getSource()==b4) {
             new mini(pinnum);
         } else if (e.getSource()==b5) {
            new Pin(pinnum);

            setVisible(false);
        }else{

            new Login(pinnum);
            setVisible(false);
        }
     }
 




    public static void main(String[] args) {
        
        new mainfile("");
    }

}