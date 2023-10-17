package J2EProject1;

public class Construct {
    public static void main(String[] args){
        String s1="java";
        String s2=new String("java");
        System.out.println("============================");
        if(s1==s2){
            System.out.println("s1==s2?:true");
        }
        else{
            System.out.println("s1==s2?:false");
        }
        System.out.println("============================");
        System.out.print("s1 equals s2?:");
        if(s1.equals(s2))
            System.out.println(true);
        else
            System.out.println(false);
        System.out.println("============================");
        boolean bool;
        bool = s1.compareTo(s2)==1?true:false;
        System.out.println("s1 compareTo s2?:"+bool);
        System.out.println("============================");
        String s3="hello java";
        s3.substring(0,3);
        String s4=s3.substring(6,10);
        System.out.println(s4);
        System.out.println("============================");
        String s5="C++,Java,VB";
        String[] str=s5.split(",");
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
        System.out.println("============================");
        String s6="C++,Java,VB Dotnet";
        String[] str2=s2.split("\\,| ");
        for(int i=0;i<str2.length;i++){
            System.out.println(str2[i]);
        }
    }

}
