package J2EProject1;

public class SplitTest1 {
    public static void main(String[] args)throws Exception{
        String str="Solutions,to selected,exercises can be found in the," +
                "electronic document The,Thinking in Java Annotated,Solution," +
                "Guide,available for,a small fee from BruceEckel";
        String[] strings=str.split(" |,");
        for(int i=0;i<strings.length;i++){
            System.out.print(strings[i]+" ");
        }
    }
}
