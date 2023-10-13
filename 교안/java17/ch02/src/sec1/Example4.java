package sec1;

public class Example4 {

    public static void main(String[] args) {

        int a = 20;                 // 10100
        int b = 14;                 // 01110

        // 비트연산 (2진연산)
        System.out.println("a & b : " + (a & b));               // 00100 => 4
        System.out.println("a | b : " + (a | b));               // 11110 => 30
        System.out.println("~a : " + (~a));                     // -21
        System.out.println("a ^ b : " + (a ^ b));               // 11010 => 26
        // << 연산은 *2의 효과
        System.out.println("a << 2 : " + (a << 2));
        // >> 연산은 /2의 효과
        System.out.println("a >> 2 : " + (a >> 2));             // 00101
        System.out.println("a >>> 2 : " + (a >>> 2));           // 결과는 같음
        // System.out.println("a <<< 2 : " + (a <<< 2));        // 얘는 없음

    }

}
