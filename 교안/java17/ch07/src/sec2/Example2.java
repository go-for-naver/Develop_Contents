package sec2;

// import sec1.Dbl;         // Dbl 클래스는 default 접근 제한자를 가지고 있기 때문에 다른 패키지에서는 접근 불가능
import sec1.Outer;
import sec1.Outer.*;

public class Example2 {

    public static void main(String[] args) {

        Outer out1 = new Outer();
        out1.setItem1(100);
        out1.setItem2("신예은");
        out1.method1();

        // 외부클래스.내부클래스 인스턴스명 = 외부인스턴스.new 내부클래스 생성자();
        System.out.println("-----------------------------------");
        Outer.Inner in1 = out1.new Inner();
        in1.setItem3(200);
        in1.setItem4("천재");
        in1.method2();

        // 이중 클래스인 Outer.java 안에 있는 Dbl 클래스의 객체를 생성하는 방법
        // out1.db         => Dbl 클래스 타입의 멤버필드
        // out1.getDbl();  => 메소드 호출에 의한 생성

    }

}
