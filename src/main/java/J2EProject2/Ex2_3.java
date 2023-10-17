package J2EProject2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
public class Ex2_3 {
    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<Integer>();
        LinkedList<Integer> llist = new LinkedList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        long Starttime,Endtime;
        Starttime = System.nanoTime();
        for(int i=1;i<=100000;i++)
            alist.add(new Integer(i));
        Endtime = System.nanoTime();
        System.out.println(Endtime-Starttime);
        Starttime = System.nanoTime();
        for(int i=1;i<=100000;i++)
            llist.add(new Integer(i));
        Endtime = System.nanoTime();
        System.out.println(Endtime-Starttime);
        Starttime = System.nanoTime();
        for(int i=1;i<=100000;i++)
            set.add(new Integer(i));
        Endtime = System.nanoTime();
        System.out.println(Endtime-Starttime);
        Starttime = System.nanoTime();
        for(int i=1;i<=100000;i++)
            alist.remove(100000-i);
        Endtime = System.nanoTime();
        System.out.println(Endtime-Starttime);
        Starttime = System.nanoTime();
        for(int i=1;i<=100000;i++)
            llist.remove(100000-i);
        Endtime = System.nanoTime();
        System.out.println(Endtime-Starttime);
        Starttime = System.nanoTime();
        for(int i=1;i<=100000;i++)
            set.remove(100000-i);
        Endtime = System.nanoTime();
        System.out.println(Endtime-Starttime);
    }
}
