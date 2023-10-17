package Para1;

public class MyCalendar {
    private int year,month,day;
    public static MyCalendar getInstance(){
        return new MyCalendar();
    }
    public MyCalendar(){

    }
    public MyCalendar(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day = day;
    }
}
