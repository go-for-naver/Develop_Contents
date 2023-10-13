package sec1;

class Sehun {               // getter와 setter에 의한 접근
    private int no;
    private String data;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

class Chanwon {             // 생성자에 의한 접근
    private int seq;
    private int data;

    public Chanwon() {
        this(1);
    }

    public Chanwon(int seq) {
        this(seq, 100);
    }

    public Chanwon(int seq, int data) {
        this.seq = seq;
        this.data = data;
    }
}

public class Chunjae {
    
    // 멤버필드 = 변수, 상수
    private int no;
    protected int point;
    int partNo;                                         // default
    public String name;
    public final static double PI = 3.141592;           // 상수

    public void setValue(int no) {
        this.no = no;
    }
    
}
