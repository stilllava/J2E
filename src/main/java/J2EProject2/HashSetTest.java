package J2EProject2;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(new String("Java EE"));
        hs.add(new String("软件工程"));
        hs.add(new String("计算机网络"));
        hs.add(new String("编译原理"));
        hs.add(new String("操作系统"));
        Iterator it = hs.iterator();
        while(it.hasNext()) {
            Object obj=it.next();
            System.out.println(obj);
        }
    }
}
