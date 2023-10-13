package sec1;

import java.util.Date;      // java 패키지 -> util 패키지 -> Date 클래스

public class Example5 {

    public static void main(String[] args) {

        Date birth1 = new Date();            // 오늘 날짜
        String birth2 = "2023-07-07";

        System.out.println(birth1);
        System.out.println("확인1 : " + (birth1 instanceof Date));        // birth1이 Date로부터 만들어진 인스턴트인지 확인 (=타입 확인)
//        System.out.println("확인2 : " + (birth2 instanceof Date));      // birth2가 Date로부터 얻어진 게 아니므로 오류 발생

        // 삼항 연산자 : 조건 ? 참 : 거짓
        int point = 84;
        String pan = point >= 80 ? "합격" : "불합격";                      // 항이 3개이기 때문에 삼항 연산자
        System.out.println("판정 : " + pan);

    }

}
