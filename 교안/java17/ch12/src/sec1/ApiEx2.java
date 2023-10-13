package sec1;

import java.text.SimpleDateFormat;            // 표시형식
import java.util.Calendar;
import java.util.Date;

public class ApiEx2 {

    public static void main(String[] args) {
        /*
        java.util 패키지 : java.lang 패키지의 추가 기능판으로 대부분 import가 필요한 클래스로 구성됨

        Arrays : 배열을 효율적으로 다루기 위한 클래스
        Calendar : 날짜(달력)와 관련된 데이터를 다루기 위한 클래스 => 복수형
        Date : 날짜와 관련된 데이터를 다루기 위한 클래스 => 단일형
        Objects : 여러 객체를 한 번에 다루기 위한 클래스
        StringTokenizer : 문자열 객체들을 다루기 위한 클래스
        Random : 난수들을 다루기 위한 클래스
        Collection : List, Map, Set, Stack, Queue, Deque...
        */

        Date now = new Date();                      // 현재 날짜와 시간
        System.out.println(now);

        String strNow = now.toString();             // 날짜를 String으로 변환
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
        // String today1 = sdf.format(strNow);      // JAVA 1.8 미만은 이 형식으로 지정해야 함
        String today2 = sdf.format(now);            // JAVA 1.8부터 이 형식도 가능해짐
        System.out.println("날짜에 표시형식 날짜로 표시 : " + today2);

        int y = now.getYear() + 1900;               // 1900년도를 기준으로 되어 있기 때문에 +1900을 해줘야 함
        int M = now.getMonth() + 1;                 // 0부터 시작하기 때문에 +1을 해줘야 함
        int d = now.getDate();
        int w = now.getDay();                       // 요일
        int h = now.getHours();
        int m = now.getMinutes();
        int s = now.getSeconds();

        System.out.printf("%d년 %d월 %d일\n", y, M, d);
        System.out.printf("%d시 %d분 %d초\n", h, m, s);        // 계속해서 Thread로 돌리면 초시계가 됨

        // Calendar cal = new Calendar();           // 자바8 이상은 Calendar가 추상체와 정적 구조로 구성되어 있으므로 별도의 객체를 생성하지 않음
        Calendar n = Calendar.getInstance();
        
        // 자바8 이상은 LocaleDate을 활용하여 시간대나 지역의 지역성을 나타냄

    }

}
