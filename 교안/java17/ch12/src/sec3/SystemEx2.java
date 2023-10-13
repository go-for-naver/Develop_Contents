package sec3;

class Student {
    public int no;
    public String name;
    
    public Student() {  }
    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }
}
public class SystemEx2 {

    public static void main(String[] args) {
        Student st1;
        st1 = new Student(1, "김이름");
        st1 = null;                                 // 쓰레기 값(초기값)이 들어감
        st1 = new Student();                        // 쓰레기 값(초기값)이 들어감
        System.out.println(st1.no + "\t" + st1.name);

        System.gc();                                // 가비지 컬렉션(Garbage Collection) : 더 이상 사용하지 않는 메모리 공간을 모아서 사용 가능한 공간으로 변경
    }

}
