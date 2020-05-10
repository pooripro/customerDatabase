
package dataaccess;

import Database.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import model.Customer;


public class customerAccess {
    public Customer cus;
    
    public static void main(String[] args) {
        insert();
    }
    
    public static void insert(){
        String sql = "INSER INTO CUSTOMERS (DROP TABLE CUSTOMERS VALUES('PUWA', 'TERMNUPHAN))";
        try(Connection conn = DBConnection.connectDB();
                Statement stm = conn.createStatement();){
                stm.execute(sql);
        }catch(SQLException ex){
            System.err.println(ex);
        }
    }
}
