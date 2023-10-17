package Para1;

import java.util.*;

public class DemoStudent {
    public static void main(String[] args)throws Exception{
        TreeSet<Student> ts=new TreeSet<Student>();
        ts.add(new Student("2022001","测试1",88));
        ts.add(new Student("2022002","测试2",78));
        ts.add(new Student("2022003","测试3",48));
        ts.add(new Student("2022004","测试4",98));
        ts.add(new Student("2022005","测试5",58));
        ts.add(new Student("2022006","测试6",58));
        for(Student s:ts){
            System.out.println(s.getSno()+" "+s.getSname()+" "+s.getScore());
        }
    }

}
