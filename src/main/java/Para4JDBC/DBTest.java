package Para4JDBC;

import java.util.List;

public class DBTest {
    public static void main(String[] args) throws Exception{
        CustomerDao cDao=new CustomerDao();
        List<String[]> clist=cDao.queryAllCustomers();
        for(String[] arr:clist)
            System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
        System.out.println("=====================================");
        cDao.addCustomer("2005001","张军","1390909090");
        List<Customer> customer=cDao.queryAllCustomer();
        for (Customer cus:customer)
            System.out.println(cus.getId()+" "+cus.getName()+" "+cus.getPhone());
    }
}
