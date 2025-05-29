package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;


public class signup1 extends JFrame implements ActionListener{
    JCheckBox box;
    JButton sumbit,clear,prev;
    JRadioButton r1,r2,r3,r4;
    JCheckBox s1,s2,s3,s4,s5,s6;
   
    String cardnum,pinnum,services;
    String accTypeGroup;

signup1(){

    
      ImageIcon img1 =new ImageIcon(ClassLoader.getSystemResource("icon/sgibank.png"));
      Image img2 =img1.getImage().getScaledInstance(75, 100,Image.SCALE_DEFAULT);
      ImageIcon img3=new ImageIcon(img2);
      JLabel imgbank=new JLabel(img3);
      imgbank.setBounds(1,-10,100,100);
      add(imgbank);
       
  
      getContentPane().setBackground(new Color(180,220,225));
      setLayout(null);
      setBounds(850,0,650,860);
      setVisible(true);


    JLabel head=new JLabel("ACCOUNT DETAILS");
    head.setBounds(280,10,250,100);
    head.setFont(new Font("Arial",Font.BOLD,20));
    add(head);

    JLabel actype=new JLabel("ACCOUNT TYPE:");
    actype.setBounds(20,100,180,50);
    actype.setFont(new Font("Arial",Font.BOLD,18));
    add(actype);

    r1=new JRadioButton("Saving Account");
    r1.setFont(new Font("Arial",Font.CENTER_BASELINE,15));
    r1.setBounds(50,150,150,20);
    add(r1);

    r2=new JRadioButton("Fixed Deposite Account");
    r2.setFont(new Font("Arial",Font.CENTER_BASELINE,15));
    r2.setBounds(300,150,250,20);
    r2.setVisible(true);
    add(r2);

    r3=new JRadioButton("Current Account");
    r3.setBounds(50,190,150,20);
    r3.setFont(new Font("Arial",Font.CENTER_BASELINE,15));
    add(r3);

    r4=new JRadioButton("Recurring Deposite Account");
    r4.setFont(new Font("Arial",Font.CENTER_BASELINE,15));
    r4.setBounds(300,190,250,20);
    add(r4);

    JLabel line1= new JLabel("------------------------------------------------------------------------------------------");
     line1.setBounds(0,199,1200,50);
     line1.setFont(new Font("Italic",Font.ROMAN_BASELINE,22));
     add(line1);


     JLabel c1=new JLabel("CARD NUMBER:");
     c1.setBounds(20,230,180,50);
     c1.setFont(new Font("Arial",Font.BOLD,18));
     add(c1);

     JLabel c2=new JLabel("(Your 16 digit card number)");
     c2.setBounds(22,250,250,50);
     c2.setFont(new Font("Raleway",Font.PLAIN,10));
     add(c2);


     JLabel c3=new JLabel("XXXX-XXXX-XXXX-4416");
     c3.setBounds(180,230,190,50);
     c3.setFont(new Font("Raleway",Font.BOLD,15));
     add(c3);

     JLabel c4=new JLabel("(It Would appear on atm card/Cheque book and statments.)");
     c4.setBounds(180,250,350,50);
     c4.setFont(new Font("Raleway",Font.PLAIN,10));
     add(c4);


     JLabel c5=new JLabel("CARD PIN:");
     c5.setBounds(20,290,180,50);
     c5.setFont(new Font("Arial",Font.BOLD,18));
     add(c5);

     JLabel c7=new JLabel("(4-Digit Password)");
     c7.setBounds(20,310,180,50);
     c7.setFont(new Font("Raleway",Font.PLAIN,10));
     add(c7);

     JLabel c6=new JLabel("XXXX");
     c6.setBounds(180,290,50,50);
     c6.setFont(new Font("Raleway",Font.BOLD,15));
     add(c6);

     JLabel line2= new JLabel("------------------------------------------------------------------------------------------");
     line2.setBounds(0,335,1200,50);
     line2.setFont(new Font("Italic",Font.ROMAN_BASELINE,22));
     add(line2);


     JLabel c8=new JLabel("SERVICES REQUIRED:");
     c8.setBounds(20,365,280,50);
     c8.setFont(new Font("Arial",Font.BOLD,17));
     add(c8);


     s1=new JCheckBox("Atm Card");
     s1.setBounds(50,420,150,20);
     s1.setFont(new Font("Arial",Font.BOLD,15));
     add(s1);

     s2=new JCheckBox("Internet Banking");
     s2.setBounds(300,420,150,20);
     s2.setFont(new Font("Arial",Font.BOLD,15));
     add(s2);

     s3=new JCheckBox("Mobile Banking");
     s3.setBounds(50,470,150,20);
     s3.setFont(new Font("Arial",Font.BOLD,15));
     add(s3);

     s4=new JCheckBox("Email Alerts");
     s4.setBounds(300,470,150,20);
     s4.setFont(new Font("Arial",Font.BOLD,15));
     add(s4);

     s5=new JCheckBox("Cheque Book");
     s5.setBounds(50,520,150,20);
     s5.setFont(new Font("Arial",Font.BOLD,15));
     add(s5);

     s6=new JCheckBox("E-Statement");
     s6.setBounds(300,520,150,20);
     s6.setFont(new Font("Arial",Font.BOLD,15));
     add(s6);




     JLabel terms=new JLabel("By completing this account registration form, you agree to the terms and conditions that govern your"
                  );
     terms.setBounds(40,610,1500,50);
     terms.setFont(new Font("Arial",Font.PLAIN,12));
     add(terms);
    
     JLabel terms1= new JLabel(" account and your relationship with the bank.");
     terms1.setBounds(40,625,1500,50);
     terms1.setFont(new Font("Arial",Font.PLAIN,12));
     add(terms1);

     JLabel terms2= new JLabel(" Please check the box below to confirm the agreement before sending the bank account registration information. ");
     terms2.setBounds(40,643,1500,50);
     terms2.setFont(new Font("Arial",Font.PLAIN,12));
     add(terms2);

     box=new JCheckBox("I agree to the terms of service.");
     box.setBounds(45,700,199,15);
     add(box);

     
    sumbit=new JButton("Sumbit");
    sumbit.setBounds(100,750,80,30);
    sumbit.setBackground(Color.BLACK);
    sumbit.setForeground(Color.WHITE);
    sumbit.setFont(new Font("Arial",Font.BOLD,10));
    sumbit.addActionListener(this);
    add(sumbit);


    clear=new JButton("Clear");
    clear.setBounds(460,750,80,30);
    clear.setBackground(Color.BLACK);
    clear.setForeground(Color.WHITE);
    clear.setFont(new Font("Arial",Font.BOLD,10));
    clear.addActionListener(this);
    add(clear);


    prev=new JButton("Previous");
    prev.setBounds(290,750,80,30);
    prev.setBackground(Color.BLACK);
    prev.setForeground(Color.WHITE);
    prev.setFont(new Font("Arial",Font.BOLD,10));
    prev.addActionListener(this);
    add(prev);

}

public void actionPerformed(ActionEvent e){
    String atype=null;
    
    if (r1.isSelected()) {
        atype="Saving Account";
        
    }else if (r2.isSelected()) {
         atype="Fixed Deposite Account";
    }
    else if (r3.isSelected()) {

        atype="Current Account";
        
    }
      else{
        atype="Recurring Deposite Account";
    }


    Random ran=new Random();
    long first7=(ran.nextLong()% 90000000L)+ 9211011000000000L;
    cardnum=""+ Math.abs(first7);

    long first2=(ran.nextInt()% 9000)+1200;
     pinnum="" + Math.abs(first2);
    

     services=null;

    if (s1.isSelected()) {

        services="Atm Card";
        
    } else if (s2.isSelected()) {

        services="Internet Banking";
        
    }else if (s3.isSelected()) {
        services="Mobile Banking";
        
    }else if (s4.isSelected()) {

        services="Email Alerts";
        
    }else if (s5.isSelected()) {

        services="Cheque Book";
    }else{


        services="E-Statement";
    }

    if (e.getSource() == clear) {
        
        s1.setSelected(false); s2.setSelected(false);
        s3.setSelected(false); s4.setSelected(false);
        s5.setSelected(false); s6.setSelected(false);
        box.setSelected(false);
    }
    

    try{
     
        if (e.getSource()==sumbit) {
            if (atype.equals("")) {
                JOptionPane.showMessageDialog(null,"Please select account type");
                
            }
            else{

             conn con1=new conn();

            String q1="INSERT INTO signup1 values('"+atype+"', '"+cardnum+"', '"+pinnum+"', '"+services+"')";
            String q2= "INSERT INTO login values('"+cardnum+"', '"+pinnum+"')";

            con1.statement.executeUpdate(q1);
            con1.statement.executeUpdate(q2);
            JOptionPane.showMessageDialog(null, "Card Number : "+cardnum+"\n Pin :"+pinnum);
            new Login(pinnum);
            setVisible(false);
            
            }
          
            
        }
    }
         catch (Exception E) {
            E.printStackTrace();
    }



}
public static void main(String[] args) {
    new signup1();
}

}
