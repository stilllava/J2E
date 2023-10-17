package Para4JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao2 {
    public int deleteCustomerById(String id) throws SQLException {
        String sql = "delete from customers where customerID='"+id+"'";
        System.out.println(sql);
        return SQLHelper.executeUpdate(sql);
    }
    public int addCustomer(String id, String name, String phone) throws SQLException {
        String sql = "insert into customers values('" + id + "','" + name + "','" + phone + "')";
        System.out.println(sql);
        return SQLHelper.executeUpdate(sql);
    }

    public List<Customer> queryAllCustomers() {
        List<Customer> clist = new ArrayList<Customer>();
        try {
            String sql = "select * from customers";
            ResultSet rs = SQLHelper.executeQuery(sql);
            while (rs.next()) {
                Customer cus=new Customer();
                cus.setId(rs.getString(1));
                cus.setName(rs.getString(2));
                cus.setPhone(rs.getString(3));
                clist.add(cus);
            }
            SQLHelper.closeConnection();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return clist;
    }
}
