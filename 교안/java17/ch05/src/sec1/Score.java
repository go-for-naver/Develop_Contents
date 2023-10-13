package sec1;

public class Score {            // 클래스명은 단어 하나로 만드는 것이 관례

    private int num;            // 전역변수
    private String name;
    private int kor;
    private int eng;
    private int mat;

    public Score() {}
    public Score(int num) {
        this.num = num;
    }

    // alt+Insert > Constructor > 멤버변수 선택
    public Score(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public Score(int num, String name, int kor) {
        this.num = num;
        this.name = name;
        this.kor = kor;
    }

    public Score(int num, String name, int kor, int eng) {
        this.num = num;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
    }

    public Score(int num, String name, int kor, int eng, int mat) {
        this.num = num;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    // alt+Insert > getter and setter
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public void prtNum(int num) {           // num => 매개변수
        int k = 1004;                       // k => 지역변수
        System.out.println("학번 : " + num);
    }

    public void prtNum(String num) {
        this.setNum(1004);
        System.out.println("학번 : " + num);     // 전역변수 name과 지역변수 name 중 지역변수가 출력됨

        // String name = "예은";                     // 매개변수와 지역변수는 중복될 수 없음
        // System.out.println("이름 : " + name);     // 전역변수 name과 지역변수 name 중 지역변수가 출력됨
    }

}
