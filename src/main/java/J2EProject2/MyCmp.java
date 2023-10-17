package J2EProject2;

import java.util.Comparator;
class MyCmp implements Comparator{
    public int compare(Object obj1,Object obj2){
        int x=0;
        x=obj1.toString().compareTo(obj2.toString());
        return x;
    }
}
