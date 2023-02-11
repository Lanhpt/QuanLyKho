
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


    public class MyConnection {
    
        
    
   public static Connection getConnection ()
   {
       Connection con = null;
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlykho", "root", "");
           
       } catch (Exception ex) {
           ex.printStackTrace();
           System.out.println("connect failure!");
       }
      
      return con;
   }

    
}

