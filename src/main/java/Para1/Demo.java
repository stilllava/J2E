package Para1;

import java.util.Calendar;
import java.util.Scanner;

public class Demo {
    private int year,moonth,day;

    public static void printMonthDay(int year,int month){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,year);
        cal.set(Calendar.MONTH,month-1);
        cal.set(Calendar.DAY_OF_MONTH,1);
        int firstWeekDayOfMonth = cal.get(Calendar.DAY_OF_WEEK);
        int monthTotalDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public static void main(String[] args) throws Exception {
        Calendar cal = Calendar.getInstance();
        System.out.println("输入你想输出月历的年份和月份:");
        Scanner scan =new Scanner(System.in);

        cal.set(Calendar.YEAR,2023);
        cal.set(Calendar.MONTH,10);
        cal.set(Calendar.DAY_OF_MONTH,1);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    }
}
