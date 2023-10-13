package sec2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CollectionsEx1 {

    public static void main(String[] args) {

        // Date d1 = new Date();
        Calendar c1 = Calendar.getInstance();

        System.out.println("년 : " + c1.get(Calendar.YEAR));
        System.out.println("월 : " + (c1.get(Calendar.MONTH) + 1));
        System.out.println("일 : " + c1.get(Calendar.DATE));
        System.out.println();
        System.out.println("년도의 몇 번째 날? : " + c1.get(Calendar.DAY_OF_YEAR));
        System.out.println("월의 몇 번째 날? : " + c1.get(Calendar.DAY_OF_MONTH));
        System.out.println("요일의 몇 번째 날? : " + c1.get(Calendar.DAY_OF_WEEK));
        System.out.println("이번 달의 몇 번째 월요일? : " + c1.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("년의 몇 번째 주? : " + c1.get(Calendar.WEEK_OF_YEAR));
        System.out.println("이번 달의 몇 번째 주? : " + c1.get(Calendar.WEEK_OF_MONTH));
        System.out.println();
        System.out.println("시(12시간제) : " + c1.get(Calendar.HOUR));
        System.out.println("하루에서 몇 번째 시(24시간제)? : " + c1.get(Calendar.HOUR_OF_DAY));
        System.out.println("분 : " + c1.get(Calendar.MINUTE));
        System.out.println("초 : " + c1.get(Calendar.SECOND));
        System.out.println("밀리초 : " + c1.get(Calendar.MILLISECOND));
        System.out.println("오전(0)/오후(1) : " + c1.get(Calendar.AM_PM));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 aa HH시 mm분 ss초");
        System.out.println(sdf.format(c1.getTime()));
        c1.clear();             //1970년 01월 01일부터 초기화
        System.out.println(sdf.format(c1.getTime()));
        c1.set(2020, 12, 25, 15, 28, 38);
        System.out.println(sdf.format(c1.getTime()));

        // 각 필요한 필드 설정
        c1.set(Calendar.YEAR, 2023);
        c1.set(Calendar.MONTH, 7);
        c1.set(Calendar.DATE, 3);
        c1.set(Calendar.HOUR_OF_DAY, 14);
        c1.set(Calendar.MINUTE, 45);
        c1.set(Calendar.SECOND, 15);
        System.out.println(sdf.format(c1.getTime()));

        // 현재와 본인 생년월일
        Calendar now = Calendar.getInstance();
        Calendar birth = Calendar.getInstance();
        birth.clear();
        birth.set(2001, 0,3,10,50, 0);
        long lifeDay = (now.getTimeInMillis() - birth.getTimeInMillis()) / (60 * 60 * 1000 * 24);

        System.out.println(sdf.format(birth.getTime()));
        System.out.println("살아온 날 수 : " + lifeDay);
        System.out.println("끼니 수 : " + (lifeDay * 3));

    }

}
