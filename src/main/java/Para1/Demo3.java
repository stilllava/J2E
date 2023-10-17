package Para1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo3 {
    public static void main(String[] args){
        List<String> courseNames = new ArrayList<String>();
        courseNames.add("Java EE");
        courseNames.add("算法分析与设计");
        courseNames.add("数据挖掘");
        courseNames.add("数据结构");

        /*使用类似于foreach遍历读取集合中的元素*/
        //遍历
        for(String name:courseNames){
            System.out.print(name+",");
        }
        System.out.println();

        //数组
        /*使用类似于读取数组按照索引读取集合中的元素*/
        for(int i = 0;i<courseNames.size();i++){
            System.out.print(courseNames.get(i)+",");
        }
        System.out.println();

        //迭代器(迭代算法)
        /*使用迭代器Iterator读取集合中的元素*/
        Iterator<String> it = courseNames.iterator();
        while(it.hasNext()){
            String name = it.next();//next作用:1、移动节点;2、取出当前值;
            System.out.print(name+",");
        }

    }
}
