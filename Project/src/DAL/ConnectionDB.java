package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionDB {

   private static String username = "sa";
    private static String password = "123456";
    private static String url = "jdbc:sqlserver://localhost:1433;databaseName=QLKS_PTTK;";
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    protected static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, username, password);
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Ket noi khong thanh cong!");
        }
        return null;
    }

    public static void getClose() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        ConnectionDB.getConnection();
    }

}
