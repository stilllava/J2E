package Para4JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {
    String Driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url = "jdbc:sqlserver://localhost:1433;DatabaseName=JavaEE;encrypt=false";
    String userName = "s20211576"; // 默认用户名
    String userPwd = "s20211576"; // 密码
    String sql="select * from customers";
    public List<String[]> queryAllCustomers() throws Exception {
        List<String[]> clist=new ArrayList<String[]>();
        try{
            Class.forName(Driver);
            Connection conn = DriverManager.getConnection(url, userName, userPwd);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                String[] arr=new String[3];
                for (int i=0;i<3;i++)
                    arr[i]=rs.getString(i+1);
                clist.add(arr);
            }
        }catch(Exception e){
            throw new Exception(e);
        }
        return clist;
    }
    public int addCustomer(String id, String name, String phone) {
        int r = 0;
        try {
            Class.forName(Driver);
            Connection conn = DriverManager.getConnection(url, userName, userPwd);
            Statement cmd = conn.createStatement();
            String sql = "insert into customers values('" + id + "','" + name + "','" + phone + "')";
            r = cmd.executeUpdate(sql);
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return r;
    }
    public List<Customer> queryAllCustomer() throws Exception{
        List<Customer> customer=new ArrayList<Customer>();
        try{
            Class.forName(Driver);
            Connection conn = DriverManager.getConnection(url, userName, userPwd);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Customer cus=new Customer();
                cus.setId(rs.getString(1));
                cus.setName(rs.getString(2));
                cus.setPhone(rs.getString(3));
                customer.add(cus);
            }
        }catch(Exception e){
            throw new Exception(e);
        }
        return customer;
    }
}
