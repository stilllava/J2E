package J2EProject2;

import Para1.Student;

import java.util.*;
public class Ex2_2test {
    public static void main(String[] args) {
        TreeSet tree=new TreeSet(new MyCmp());
        Student s1=new Student("1001","zhou",67);
        Student s2=new Student("1002","zhou",47);
        Student s3=new Student("1003","zhou",47);
        Student s4=new Student("1004","zhou",76);
        tree.add(s1);tree.add(s2);
        tree.add(s3);tree.add(s4);
        Iterator it=tree.iterator();
        while(it.hasNext()){
            Student s=(Student)it.next();
            System.out.println(s.getSno()+","+s.getScore());
        }
    }
}
