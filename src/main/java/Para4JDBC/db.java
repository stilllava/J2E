package Para4JDBC;

import java.sql.*;

public class db {
    public static void main(String[] args) throws Exception{
        String Driver2 = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;DatabaseName=JavaEE;encrypt=false";
        String userName = "s20211576"; // 默认用户名
        String userPwd = "s20211576"; // 密码
        Connection conn = null;
        String sql = "select * from customers";
        try {
            Class.forName(Driver2);
            conn = DriverManager.getConnection(url, userName, userPwd);
        } catch (ClassNotFoundException e0) {
            throw new RuntimeException(e0);
        } catch (SQLException e1) {
            throw new RuntimeException(e1);
        }
        int columnCount;
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int count = 0;
            while (rs.next()) {
                String id = rs.getString("customerID");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                System.out.printf("%-10s%-35s%-20s\n", id, name, phone);
            }
            rs.close();
        } catch (SQLException e2) {
            throw new RuntimeException(e2);
        } finally {
            try {
                conn.close();
            } catch (SQLException e3) {
                throw new RuntimeException(e3);
            }
        }
    }
}
