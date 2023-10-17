package J2EProject2;

import Para1.Student;

import java.util.Comparator;

public class Ex2_2 implements Comparator {
    public int compare(Object obj1, Object obj2) {
        int x = 0;
        Student s1=(Student)obj1;
        Student s2=(Student)obj2;
        if(s1.getScore()>s2.getScore()) 		x=-1;
        else if(s1.getScore()<s2.getScore()) 	x=1;
        else
            x=s1.getSno().compareTo(s2.getSno());
        return x;
    }
}
