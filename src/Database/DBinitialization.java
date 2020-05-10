package Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBinitialization {

    public static void main(String[] args) {
        createTables();
        insert();
    }

    public static void createTables() {
//        ถามโบ้ทเรืองการจัดเรียงโค้ดว่าต้องดรอป table ตอนไหน
        String sql = "CREATE TABLE CUSTOMERS (FIRSTNAME VARCHAR(20), LASTNAME VARCHAR(20))";
        try (Connection conn = DBConnection.connectDB();
                Statement stm = conn.createStatement();) {
            stm.executeUpdate(sql);

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void insert() {
        String sql = "INSERT INTO CUSTOMERS VALUES('PUWA', 'TERMNUPHAN')";
        try (Connection conn = DBConnection.connectDB();
                Statement stm = conn.createStatement();) {
            stm.execute(sql);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
}
