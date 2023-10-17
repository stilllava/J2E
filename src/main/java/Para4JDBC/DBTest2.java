package Para4JDBC;

import java.util.List;

public class DBTest2 {
    public static void main(String[] args) throws Exception{
        CustomerDao2 cDao=new CustomerDao2();
        List<Customer> clist=cDao.queryAllCustomers();
        for(Customer cus:clist)
            System.out.println(cus.getId()+" "+cus.getName()+" "+cus.getPhone());
        SQLHelper.closeConnection();
        System.out.println("=====================================");
        cDao.deleteCustomerById("2005001");
        cDao.addCustomer("2005001","张军","1390909090");
        List<Customer> customer=cDao.queryAllCustomers();
        for (Customer cus:customer)
            System.out.println(cus.getId()+" "+cus.getName()+" "+cus.getPhone());
        SQLHelper.closeConnection();
        System.out.println("=====================================");
        cDao.deleteCustomerById("2005001");
        for (Customer cus:customer)
            System.out.println(cus.getId()+" "+cus.getName()+" "+cus.getPhone());
        SQLHelper.closeConnection();
    }
}
