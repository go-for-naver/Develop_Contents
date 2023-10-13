package sec1;

public class Middle extends Score {

    private int history;

    public Middle() { super(); }                    // super() : 부모 클래스의 생성자

    public Middle(int history) {
        this.history = history;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public void prtPoint() {
        System.out.println(super.getEng());         // super : 부모 클래스를 의미
        System.out.println(this.getEng());
    }

}
