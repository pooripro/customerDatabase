package Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBinitialization {

    public static void createTables() {
//        ถามโบ้ทเรืองการจัดเรียงโค้ดว่าต้องดรอป table ตอนไหน
        try (Connection conn = DBConnection.connectDB();
                Statement stm = conn.createStatement();) {
            try {
                stm.executeUpdate("DROP TABLE CUSTOMERS");
            } catch (SQLException ex) {
                System.err.println(ex);
            }
            stm.executeUpdate("CREATE TABLE CUSTOMERS (FIRSTNAME VARCAHR(20), LASTNAME VARCHAR(20))");
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
}
