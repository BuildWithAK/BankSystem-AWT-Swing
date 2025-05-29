package bank.management.system;
import java.sql.*;



public class conn {

  

        Connection conn;
        Statement statement;
        
        public conn(){

        String url = "jdbc:mysql://localhost:3366/bankmanagmentsystem";
        String user = "root"; 
        String password = "Avinash@2005"; 

        
        try{
            conn = DriverManager.getConnection(url,user,password);
          
           statement=conn.createStatement();

        
           

        } catch (Exception e) {
          
            e.printStackTrace();
        }
    }
}

