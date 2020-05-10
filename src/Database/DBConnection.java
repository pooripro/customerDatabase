package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    static String URI = "jdbc:derby://localhost:1527/learn";
    static String username = "pooripro";
    static String password = "Puwa@99236487";
    static String driver = "org.apache.derby.jdbc.ClientDriver";

    public static void main(String[] args) {
        connectDB();
    }

    public static Connection connectDB() {
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(URI, username, password);
            return conn;
            
        } catch (SQLException ex) {
            System.err.println(ex);
            
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
            
        }
        return null;
    }
    
  
   

}
