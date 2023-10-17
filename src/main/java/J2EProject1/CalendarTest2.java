package J2EProject1;

import java.util.Calendar;

public class CalendarTest2 {
    public static void main(String[] args)throws Exception{
        Calendar c1= Calendar.getInstance();
        //第一部分
        int YEAR = 1;
        int MONTH = 2;
        int DATE = 5;
        int HOUR = 10;
        int MINUTE = 12;
        int SECOND = 13;
        //第二部分
        int year=c1.get(Calendar.YEAR);
        int dayOfYear=c1.get(Calendar.DAY_OF_YEAR);
        int day=c1.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek=c1.get(Calendar.DAY_OF_WEEK);
        int month= c1.get(Calendar.MONTH)+1;
        int hour=c1.get(Calendar.HOUR_OF_DAY);
        String apm=hour>12?(hour==24?"midnight":"pm"):(hour==12?"noon":"am");
        int minute=c1.get(Calendar.MINUTE);
        int second=c1.get(Calendar.SECOND);
        System.out.println(year+"/"+month+"/"+day+" "+apm+" "+hour+":"+minute+":"+second);
        //第三部分
        Calendar c2= Calendar.getInstance();
        c2.set(Calendar.YEAR,2024);
        c2.set(Calendar.MONTH,11);
        c2.set(Calendar.DAY_OF_MONTH,11);
        c2.set(Calendar.HOUR,11);
        int year2=c2.get(Calendar.YEAR);
        int day2=c2.get(Calendar.DAY_OF_MONTH);
        int month2= c2.get(Calendar.MONTH)+1;
        int apm2=c2.get(Calendar.AM_PM);
        System.out.println(apm2);
        int hour2=c2.get(Calendar.HOUR);
        System.out.println(year2+"/"+month2+"/"+day2+" "+hour2+":"+minute+":"+second);

    }
}
