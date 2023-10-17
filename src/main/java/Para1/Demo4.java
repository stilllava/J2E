package Para1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo4 {
    public static void main(String[] args){
        //HashMap可能输出顺序和原来不太一样
        HashMap<Integer,String> hm = new HashMap<Integer, String>();
        hm.put(20211572,"王五");
        hm.put(20211574,"李四");
        hm.put(20211576,"刘二");
        hm.put(20211577,"李四");
        hm.put(20211576,"张三");
        hm.put(20220101,"六六");
        //将HashMap中所有键提取出来，并存储到一个Set类型的变量keys中
        Set<Integer> keys=hm.keySet();
        //创建一个迭代器对象it,用于遍历Set中的元素
        Iterator<Integer> it=keys.iterator();
        while(it.hasNext()){
            Integer key=it.next();
            String value=hm.get(key);
            System.out.println("<"+key+","+value+">");
        }
        System.out.println("========================================");
        boolean bool=keys.contains(20211578);
        boolean bool2=keys.contains(20211576);
        System.out.println("bool(20211578):"+(bool==true?"存在该学号":"不存在该学号")+"\n"+"bool2(20211576):"+(bool2==true?"存在该学号":"不存在该学号"));
        System.out.println("========================================");
        for(Integer key:keys){
            String value=hm.get(key);
            System.out.println("<"+key+","+value+">");
        }
        System.out.println("========================================");
    }

}
