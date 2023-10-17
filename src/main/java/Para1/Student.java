package Para1;

public class Student implements Comparable<Student>{
    private String sno,sname;
    private int score;

    public Student(){

    }

    public Student(String sno, String sname, int score) {
        super();
        this.sno=sno;
        this.sname=sname;
        this.score=score;
    }


    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    @Override
    public int compareTo(Student s) {
        //System.out.println();
        int diffscore=s.getScore()-this.getScore();
        if(diffscore==0){//成绩相等时比较学号
            return this.getSno().compareTo(s.getSno());
        }
        return diffscore;
    }
}
