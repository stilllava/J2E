package Para1;

import java.util.ArrayList;
import java.util.*;

public class Demo2 {
    public static int[] functionByArray(int n){
        int[] array = null;
        int count = 0;
        for(int i = 0;i<n;i++){
            if(i%5==0)
                count++;
        }
        array = new int[count];
        for(int i = 0;i<n;i++){
            if(i%5==0)
                array[count++]=i;
        }
        return array;
    }
    public static ArrayList<Integer> functionByList(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1;i<=n;i++){
            if(i%5==0){
                list.add(i);
            }
        }
        return list;
    }
    public static ArrayList<String> functionNameByList(ArrayList<String> str){
        ArrayList<String> destiStr = new ArrayList<String>();
        for(String name:str){
            destiStr.add(name);
        }
        return destiStr;
    }
    public static void main(String[] args) throws Exception{
        ArrayList<Integer> list = functionByList(1000);
        ArrayList<String> str = new ArrayList<String>();
        str.add("Java EE");
        str.add("计算机网络");
        str.add("软件工程");
        str.add("数据挖掘");
        ArrayList<String> desti = functionNameByList(str);
        for(String name:desti){
            System.out.print(name+",");
        }
    }
}
