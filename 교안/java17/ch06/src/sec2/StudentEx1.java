package sec2;

import sec1.Student;

public class StudentEx1 {

    public static void main(String[] args) {

        Student st1 = new Student();

        // 메서드1의 활용(리턴X, 매개변수X)
        st1.method1();
        // 메서드2의 활용(리턴O, 매개변수X)
        int a = st1.method2();
        System.out.println(a);
        System.out.println(st1.method2());
        // 메서드3의 활용(리턴X, 매개변수O)
        st1.method3(1004);
        // 메서드4의 활용(리턴O, 매개변수O)
        int b = st1.method4(1004);
        System.out.println(b);
        System.out.println(st1.method4(50));

    }

}
