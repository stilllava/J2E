package J2EProject2;

import java.util.Iterator;
import java.util.TreeSet;
public class Ex2_1 {
    public static void main(String[] args) {
        TreeSet tree=new TreeSet();
        tree.add("d");
        tree.add("c");
        tree.add("a");
        tree.add("b");
        Iterator it=tree.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
