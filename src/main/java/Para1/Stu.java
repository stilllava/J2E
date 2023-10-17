package Para1;

public class Stu {
    private String sno,sname;
    private int score;

    public Stu(){

    }

    public Stu(String sno, String sname, int score) {
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
}
