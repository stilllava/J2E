package Para1;

import java.util.*;

public class DemoStu {
    public static void main(String[] args)throws Exception{
        TreeSet<Stu> ts=new TreeSet<Stu>(
                //未命名类|匿名类
                new Comparator<Stu>() {
                    @Override
                    public int compare(Stu o1, Stu o2) {
                        int diff=o2.getScore()-o1.getScore();
                        if(diff==0){
                            diff=o1.getSno().compareTo(o2.getSno());
                        }
                        return diff;
                    }
                }
        );
        ts.add(new Stu("2022001","测试1",88));
        ts.add(new Stu("2022002","测试2",78));
        ts.add(new Stu("2022003","测试3",48));
        ts.add(new Stu("2022004","测试4",98));
        ts.add(new Stu("2022005","测试5",58));
        ts.add(new Stu("2022006","测试6",58));
        for(Stu s:ts){
            System.out.println(s.getSno()+" "+s.getSname()+" "+s.getScore());
        }
    }
}
