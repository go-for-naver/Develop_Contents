package sec2;

import sec1.Qna;

public class Example4 {

    public static void main(String[] args) {

        Qna q1 = new Qna();
        q1.setTitle(Qna.DUMMY);                 // 상수는 인스턴스를 생성하지 않고도 사용할 수 있음
        System.out.println(q1.getTitle());

        Qna q2 = new Qna();
        q2.setTitle(Qna.DUMMY);

        q1.method1();
        q1.method2();
        q1.method3();


    }

}
