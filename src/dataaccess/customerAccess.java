
package dataaccess;

import Database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import model.Customer;


public class customerAccess {
    public Customer cus;
    
    public static void insert(Customer obj){
        String sql = "INSER INTO CUSTOMERS VALUES(?,?)";
        try(Connection conn = DBConnection.connectDB();
                PreparedStatement pstm = conn.prepareStatement(sql);) {
                pstm.setString(1, obj.getFirstName());
                pstm.setString(2, obj.getLastName());
                pstm.executeUpdate();
                
        }catch(SQLException ex){
            System.err.println(ex);
        }
    }
}
