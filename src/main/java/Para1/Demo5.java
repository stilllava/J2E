package Para1;

import java.util.*;

public class Demo5 {
    public static void main(String[] args) throws Exception{
        TreeSet<String> ts=new TreeSet<String>();
        ts.add("Java");
        ts.add("C#");
        ts.add("VB.NET");
        ts.add("Python");
        ts.add("GoLang");
        ts.add("Java");
        for(String value:ts){
            System.out.println(value);
        }
    }
}
