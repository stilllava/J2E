package J2EProject1;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args)throws Exception{
        HashSet<Integer> set=new HashSet<Integer>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        long startTime=System.nanoTime();
        for(int i=0;i<100000;i++){
            set.add(i);
        }
        long endTime=System.nanoTime();
        System.out.println(endTime-startTime);

        startTime=System.nanoTime();
        for(int i=1;i<100000;i++)
            list.add(i);
        endTime=System.nanoTime();
        System.out.println(endTime-startTime);

        startTime=System.nanoTime();
        for(int i=1;i<100000;i++)
            list.remove(100000-i);
        endTime=System.nanoTime();
        System.out.println(endTime-startTime);
    }
}
