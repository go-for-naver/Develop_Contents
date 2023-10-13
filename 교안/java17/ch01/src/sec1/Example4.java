package sec1;

public class Example4 {

    public static void main(String[] args) {

        // 각 프리미티브 변수의 최소값과 최대값 출력 
        // 프리미티브의 변수 속성을 출력하려면 해당 변수 타입의 참조형 변수를 활용해야 함

        // Boolean은 MIN_VALUE, MAX_VALUE 없음
        System.out.println(Character.MIN_VALUE + " ~ " + Character.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
        System.out.println(Float.MIN_VALUE  + " ~ " + Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);

    }

}
