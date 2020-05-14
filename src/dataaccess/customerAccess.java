
package dataaccess;

import Database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Customer;


public class customerAccess {
    
    public static void delete(Customer obj){
        String sql = "DELETE customers WHERE FIRSTNAME = ?";
        try(Connection conn = DBConnection.connectDB();
                PreparedStatement pstm = conn.prepareStatement(sql)){
            pstm.setString(1, obj.getFirstName());
            pstm.close();
        }catch(SQLException ex){
            System.err.println(ex);
        }
    }
    
    public static void findByName(String name){
        String sql = "SELECT * FROM customers WHERE FIRSTNAME = ? ";
        try(Connection conn = DBConnection.connectDB();
                PreparedStatement pstm = conn.prepareStatement(sql)){
            pstm.setString(1, name);
            pstm.close();
        }catch(SQLException ex){
            System.err.println(ex);
        }
    }
    
    public static void insert(Customer obj){
        String sql = "INSERT INTO CUSTOMERS VALUES(?,?)";
        try(Connection conn = DBConnection.connectDB();
                PreparedStatement pstm = conn.prepareStatement(sql);) {
                pstm.setString(1, obj.getFirstName());
                pstm.setString(2, obj.getLastName());
                pstm.executeUpdate();
                
        }catch(SQLException ex){
            System.err.println(ex);
        }
    }
    
    public static void list(){
        try(Connection conn = DBConnection.connectDB();
                Statement stm = conn.createStatement();){
            ResultSet rs = stm.executeQuery("SELECT * FROM CUSTOMERS");
            while(rs.next()){
                System.out.println(rs.getString(1) + "  " +rs.getString(2));
            }
        }catch(SQLException ex){
            System.err.println(ex);
        }
    }
    
    public static Customer selectCustomer(String firstName){
        Customer cust = null;
        try(Connection conn = DBConnection.connectDB();
                Statement stm = conn.createStatement();){
                ResultSet rs = stm.executeQuery("SELECT * FROM CUSTOMERS WHERE FIRSTNAME = '" + firstName +"'");
                if(rs.next()){
                    return new Customer(rs.getString("FIRSTNAME"), rs.getString("LASTNAME"));
                }
        }catch(SQLException ex){
            System.err.println(ex);
        }
        return cust;
    }
    
}
    

