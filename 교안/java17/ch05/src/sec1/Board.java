package sec1;

public class Board {

    private int no;
    private String title;
    private String content;
    private String name;
    private String resDate;
    private int viewCount;

    public Board() { }
    public Board(int no) {
        this.no = no;
    }
    public Board(int no, String title) {
        this.no = no;
        this.title = title;
    }
    public Board(int no, String title, String content) {
        this.no = no;
        this.title = title;
        this.content = content;
    }
    public Board(int no, String title, String content, String name) {
        this.no = no;
        this.title = title;
        this.content = content;
        this.name = name;
    }
    public Board(int no, String title, String content, String name, String resDate) {
        this.no = no;
        this.title = title;
        this.content = content;
        this.name = name;
        this.resDate = resDate;
    }
    public Board(int no, String title, String content, String name, String resDate, int viewCount) {
        this.no = no;
        this.title = title;
        this.content = content;
        this.name = name;
        this.resDate = resDate;
        this.viewCount = viewCount;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResDate() {
        return resDate;
    }

    public void setResDate(String resDate) {
        this.resDate = resDate;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public final static void method1() {                        // 오버라이딩 불가능 (상속해주기 싫은 메서드인 경우 final 붙이기)
        System.out.println("여기는 final static Board입니다.");
    }

    public void method2() {
        System.out.println("여기는 Board입니다.");
    }

    public static void method3() {                              // 상속은 되지만 오버라이딩은 할 수 없음
        System.out.println("여기는 static Board입니다.");
    }

}
