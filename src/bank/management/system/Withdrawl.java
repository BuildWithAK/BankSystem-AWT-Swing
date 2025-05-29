package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {

    String pin;
    TextField textField;

    JButton b1, b2;
    Withdrawl(String pin){
        this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bg.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("System", Font.BOLD, 30));
        label1.setBounds(578,210,700,35);
        l3.add(label1);

        


        textField = new TextField();
        textField.setBackground(Color.WHITE);
        textField.setForeground(Color.BLACK);
        textField.setBounds(642,290,360,25);
        textField.setFont(new Font("Raleway", Font.BOLD,22));
        l3.add(textField);

        b1 = new JButton("WITHDRAW");
        b1.setBounds(900,450,150,35);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(600,450,150,35);
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to withdraw");
                } else {
                    conn c = new conn();
                    ResultSet resultSet = c.statement.executeQuery("select * from bankd where pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insuffient Balance");
                      
                    }
              
                
                        c.statement.executeUpdate("insert into bankd values('" + pin + "', '" + date + "', 'Withdrawl', '" + amount + "' )");
                        JOptionPane.showMessageDialog(null, "Rs. " + amount + " Withdrawal Successfully");
                        setVisible(false);
                        new mainfile(pin);
                 }  
            }
                
                    
                     

                
             catch (Exception E) {

            }
        } else if (e.getSource()==b2) {
            setVisible(false);
            new mainfile(pin);
        }
    }

    public static void main(String[] args) {
        new Withdrawl("");
    }
}
