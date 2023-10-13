package sec2;

import sec1.Middle;
import sec1.Score;

public class Example2 {

    public static void main(String[] args) {

        // alt+Enter : import 단축키
        Score el1 = new Score();

        el1.setNum(1001);
        el1.setName("예은");

        System.out.println("번호 : " + el1.getNum());         // 호출해서 실행되어야 출력이 가능하므로 [main, 함수, 메서드 안]에서만 프린트 가능
        System.out.println("이름 : " + el1.getName());

        Middle st1 = new Middle();


    }

}
