package sec2;

public class Exam01 {
    public static void main(String[] args) {
        System.out.println("Hello~! Java~!");
        //클래스.하위객체.메소드(); -> 클래스의 안에 있는 하위객체 static : O
        //객체.하위객체.메소드(); -> 클래스의 안에 있는 하위객체 static : X
        //클래스.메소드(); -> static 메소드 : O
        //객체.메소드(); -> static 메소드 : X
        Print.out.println("신승원");

        Print prt = new Print();
        prt.out.println("김기태");

        Out.println("이슬비");
    }
}
