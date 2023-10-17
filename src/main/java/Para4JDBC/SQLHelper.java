package Para4JDBC;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.*;

public class SQLHelper{
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String url = "jdbc:sqlserver://localhost:1433;DatabaseName=JavaEE;encrypt=false";
    private static String userName = "s20211576"; // 默认用户名
    private static String userPwd = "s20211576"; // 密码
    private static Connection conn = null;
    static{
        try{
            Class.forName(driver);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    public static int executeUpdate(String sql) throws SQLException {
        int r=0;
        try{
            Connection conn = DriverManager.getConnection(url, userName, userPwd);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            throw new SQLException(e);
        }
        return r;
    }
    public static void closeConnection() {
        try {
            if(conn!=null && !conn.isClosed()) {
                conn.close();
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static ResultSet executeQuery(String sql) {
        ResultSet rs=null;
        try {
            conn = DriverManager.getConnection(url, userName, userPwd);
            Statement cmd = conn.createStatement();
            rs=cmd.executeQuery(sql);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return rs;
    }
}
