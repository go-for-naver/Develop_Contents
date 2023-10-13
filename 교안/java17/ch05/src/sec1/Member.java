package sec1;

public class Member {

    private String id;
    private String password;
    private String name;
    private String birth;
    private String tel;
    private int point;

    public Member() {               // 기본 생성자에서 멤버 변수의 초기값을 줄 수 있음
        this("kim");
    }

    public Member(String id) {
        this(id, "1234");
    }

    public Member(String id, String password) {
        this(id, password, "name");
    }

    public Member(String id, String password, String name) {
        this(id, password, name, "2001-01-01");
    }

    public Member(String id, String password, String name, String birth) {
        this(id, password, name, birth, "010-1234-5678");
    }

    public Member(String id, String password, String name, String birth, String tel) {
        this(id, password, name, birth, tel, 100);
    }

    public Member(String id, String password, String name, String birth, String tel, int point) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.birth = birth;
        this.tel = tel;
        this.point = point;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

}
