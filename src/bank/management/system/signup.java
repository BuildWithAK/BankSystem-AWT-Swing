package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


import com.toedter.calendar.JDateChooser;
 
public class signup extends JFrame implements ActionListener{
    String marriedSta;
    JTextField first,mid,last,mob,emai,add,city1,state1;
    JButton sumbit,clear;
    JRadioButton  male,female,sin,dou;
    JDateChooser choosedob;
    JCheckBox box;
 signup(){


     ImageIcon img1 =new ImageIcon(ClassLoader.getSystemResource("icon/sgibank.png"));
      Image img2 =img1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
      ImageIcon img3=new ImageIcon(img2);
      JLabel imgbank=new JLabel(img3);
      imgbank.setBounds(10,-10,100,100);
      add(imgbank);
      

      
      JLabel signupform=new JLabel("SignUP Application Form No 1");
      signupform.setBounds(240, 30, 500, 50);
      signupform.setForeground(Color.BLACK);
      signupform.setFont(new Font("",Font.BOLD,20));
      add(signupform);


     JLabel personalDeatails= new JLabel("Personal Details");
     personalDeatails.setBounds(290,100,250,50);
     personalDeatails.setFont(new Font("Arial",Font.TYPE1_FONT,15));
     personalDeatails.setForeground(Color.black);
     add(personalDeatails);


     JLabel name= new JLabel("NAME ");
     name.setBounds(50, 150, 200,50);
     name.setFont(new Font("Arial",Font.BOLD,18));
     add(name);
    
    JLabel fname=new JLabel("First");
    fname.setBounds(50,175,50,50);
    fname.setFont(new Font("Italic",Font.ITALIC,12));
    add(fname);


     first=new JTextField(12);
     first.setBounds(40,210,120,20);
     first.setFont(new Font("Arial",Font.PLAIN,14));
     add(first);


     JLabel mname=new JLabel("Middle ");
     mname.setBounds(260,175,50,50);
     mname.setFont(new Font("Italic",Font.ITALIC,12));
     add(mname);

     mid=new JTextField();
     mid.setBounds(250,210,120,20);
     mid.setFont(new Font("Arial",Font.PLAIN,14));
     add(mid);

     JLabel lname=new JLabel("Last ");
     lname.setBounds(460,175,50,50);
     lname.setFont(new Font("Italic",Font.ITALIC,12));
     add(lname);


     last=new JTextField();
     last.setBounds(450,210,120,20);
     last.setFont(new Font("Arial",Font.PLAIN,14));
     add(last);


//Line//
    JLabel line= new JLabel("------------------------------------------------------------------------------------------");
     line.setBounds(0,221,1500,50);
     line.setFont(new Font("Italic",Font.ROMAN_BASELINE,22));
     add(line);

     JLabel mobile=new JLabel("MOBILE NO");
     mobile.setBounds(50,245,200,50);
     mobile.setFont(new Font("Arial",Font.BOLD,17));
     add(mobile);


     mob=new JTextField();
     mob.setBounds(40,300,180,22);
     mob.setFont(new Font("Arial",Font.PLAIN,14));
     add(mob);


    

     JLabel email=new JLabel("EMAIL");
     email.setBounds(410,245,200,50);
     email.setFont(new Font("Arial",Font.BOLD,17));
     add(email);

     emai=new JTextField();
     emai.setBounds(390,300,180,22);
     emai.setFont(new Font("Arial",Font.PLAIN,14));
     add(emai);


     JLabel line1= new JLabel("------------------------------------------------------------------------------------------");
     line1.setBounds(0,321,1500,50);
     line1.setFont(new Font("Italic",Font.ROMAN_BASELINE,22));
     add(line1);

     JLabel dob=new JLabel("DOB");
     dob.setBounds(50,345,200,50);
     dob.setFont(new Font("Arial",Font.BOLD,17));
     add(dob);

     choosedob=new JDateChooser();
     choosedob.setBounds(40,390,180,22);
     choosedob.setForeground(Color.red);
     add(choosedob);


     JLabel married=new JLabel("GENDER");
     married.setBounds(410,345,200,50);
     married.setFont(new Font("Arial",Font.BOLD,17));
     add(married);

     male= new JRadioButton("Male");
     male.setBounds(350,380,80,50);
     add(male);

     female= new JRadioButton("Female");
     female.setBounds(480,380,100,50);
     add(female);


     JLabel married1=new JLabel("MARRIED STATUS");
     married1.setBounds(228,418,200,50);
     married1.setFont(new Font("Arial",Font.BOLD,17));
     add(married1);

     sin= new JRadioButton("Married");
     sin.setBounds(190,455,80,50);
     add(sin);

     dou= new JRadioButton("Unmarried");
     dou.setBounds(305,455,100,50);
     add(dou);

    



     JLabel line2= new JLabel("------------------------------------------------------------------------------------------");
     line2.setBounds(0,479,1500,50);
     line2.setFont(new Font("Italic",Font.ROMAN_BASELINE,22));
     add(line2);


     JLabel address=new JLabel("ADDRESS");
     address.setBounds(50,512,200,50);
     address.setFont(new Font("Arial",Font.BOLD,17));
     add(address);

     add= new JTextField();
     add.setBounds(40,555,580,31);
     add.setFont(new Font("Arial",Font.PLAIN,15));
     add(add);

     JLabel state=new JLabel("STATE");
     state.setBounds(50,590,200,50);
     state.setFont(new Font("Arial",Font.BOLD,17));
     add(state);

     state1=new JTextField();
     state1.setBounds(40,630,180,22);
     state1.setFont(new Font("Arial",Font.PLAIN,14));
     add(state1);


     JLabel city=new JLabel("CITY");
     city.setBounds(410,590,200,50);
     city.setFont(new Font("Arial",Font.BOLD,17));
     add(city);
     
     city1=new JTextField();
     city1.setBounds(390,630,180,22);
     city1.setFont(new Font("Arial",Font.PLAIN,14));
     add(city1);


     JLabel line3= new JLabel("------------------------------------------------------------------------------------------");
     line3.setBounds(0,655,1500,50);
     line3.setFont(new Font("Italic",Font.ROMAN_BASELINE,22));
     add(line3);


    JLabel mandatory=new JLabel("*");
    mandatory.setBounds(218,418,200,50);
    mandatory.setForeground(Color.RED);
    mandatory.setFont(new Font("Arial",Font.BOLD,15));
    add(mandatory);

    JLabel mandatory1=new JLabel("*");
    mandatory1.setBounds(39,148,200,50);
    mandatory1.setForeground(Color.RED);
    mandatory1.setFont(new Font("Arial",Font.BOLD,15));
    add(mandatory1);

    JLabel mandatory2=new JLabel("*");
    mandatory2.setBounds(39,505,200,50);
    mandatory2.setForeground(Color.RED);
    mandatory2.setFont(new Font("Arial",Font.BOLD,15));
    add(mandatory2);

    JLabel mandatory3=new JLabel("*");
    mandatory3.setBounds(401,245,200,50);
    mandatory3.setForeground(Color.RED);
    mandatory3.setFont(new Font("Arial",Font.BOLD,15));
    add(mandatory3);

    
    JLabel mandatory4=new JLabel("*");
    mandatory4.setBounds(39,345,200,50);
    mandatory4.setForeground(Color.RED);
    mandatory4.setFont(new Font("Arial",Font.BOLD,15));
    add(mandatory4);

    JLabel mandatory5=new JLabel("*");
    mandatory5.setBounds(401,345,200,50);
    mandatory5.setForeground(Color.RED);
    mandatory5.setFont(new Font("Arial",Font.BOLD,15));
    add(mandatory5);

    JLabel mandatory6=new JLabel("*");
    mandatory6.setBounds(41,590,200,50);
    mandatory6.setForeground(Color.RED);
    mandatory6.setFont(new Font("Arial",Font.BOLD,15));
    add(mandatory6);

    
    JLabel mandatory7=new JLabel("*");
    mandatory7.setBounds(400,590,200,50);
    mandatory7.setForeground(Color.RED);
    mandatory7.setFont(new Font("Arial",Font.BOLD,15));
    add(mandatory7);

    JLabel mandatory8=new JLabel("*");
    mandatory8.setBounds(41,250,200,50);
    mandatory8.setForeground(Color.RED);
    mandatory8.setFont(new Font("Arial",Font.BOLD,15));
    add(mandatory8);



    sumbit=new JButton("Next");
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


 


     setLayout(null);
      setBounds(850,0,650,850);
      setVisible(true);
      setTitle("Signup Page"); 
 }
 



    public void actionPerformed(ActionEvent ea){

        if (ea.getSource() == clear) {
            first.setText("");
            mid.setText("");
            last.setText("");
            add.setText("");
            emai.setText("");
            city1.setText("");
            state1.setText("");
            mob.setText("");
           
          

        }
       
        String fname=first.getText();
        String mname=mid.getText();
        String lname=last.getText();
        String mobile=mob.getText();
        String email=emai.getText();
        String dob=((JTextField) choosedob.getDateEditor().getUiComponent()).getText();
        String gender=null;
        

        if (male.isSelected()) {

            gender="Male";
            
        } else {
            
    
            gender="Female";
        }

        marriedSta=null;
       
        if (sin.isSelected()) {

            marriedSta="Married";
            
        }
        else{

         marriedSta="Unmarried";

        }
        String address=add.getText();
        String state=state1.getText();
        String city=city1.getText();

        try {
            if (fname.equals("")) {

                JOptionPane.showMessageDialog(null,"Please Enter First Name.");     
            }  else if (mname.equals("")) {
                JOptionPane.showMessageDialog(null,"Please Enter Middle Name.");  
                
            }
            else if (lname.equals("")) {
                JOptionPane.showMessageDialog(null,"Please Enter Last Name.");  
                
            }

            else if (mobile.equals("")) {
                JOptionPane.showMessageDialog(null,"Please Enter Mobile N0.");  
                
            }

            else if (email.equals("")) {
                JOptionPane.showMessageDialog(null,"Please Enter Your Email.");  
                
            }

            else if (dob.equals("")) {
                JOptionPane.showMessageDialog(null,"Please Enter Your DOB.");  
                
            }

            else if (gender.equals("")) {
                JOptionPane.showMessageDialog(null,"Please Select Your Gender.");  
                
            }

            else if (address.equals("")) {
                JOptionPane.showMessageDialog(null,"Please Enter Your Address.");  
                
            }

            else if (city.equals("")) {
                JOptionPane.showMessageDialog(null,"Please Enter Your City.");  
                
            }

            else if (state.equals("")) {
                JOptionPane.showMessageDialog(null,"Please Enter Your State.");  
                
            }
            else if (marriedSta.equals("")) {
                JOptionPane.showMessageDialog(null,"Please Select Your Status.");  
                
            }
           
            else{

                conn con=new conn();
                String qeury= "INSERT INTO signup values('"+fname+"', '"+mname+"', '"+lname+"','"+mobile+"', '"+email+"', '"+dob+"','"+gender+"','"+address+"','"+state+"','"+city+"','"+marriedSta+"')";
                con.statement.executeUpdate(qeury);
               new signup1();
               setVisible(false);
                
            
              
            }



        } catch(Exception E){

            E.printStackTrace();
        }
     
 
        }

    




 
  public static void main(String []args){
      new signup();
      
  

}
}
