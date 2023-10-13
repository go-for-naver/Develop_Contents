package sec1;

public class Example2 {

    public static void main(String[] args) {

        boolean a = true;                       // 논리형 변수                   - 1byte
        byte b = 127;                           // 바이트 변수 : -128~127        - 1byte
        char c = 'k';                           // 문자 변수                     - 2byte
        short d = 32767;                        // 반정도 정수 : -32768~32767    - 2byte
        int e = 785367800;                      // 단정도 정수 : 4byte
        long f = 7853678000L;                   // 배정도 정수 : 4byte -> 8byte
        float g = 3.141592f;                    // 단정도 실수 : 4byte
        double h = 3.141592;                    // 배정도 실수 : 8byte
        double i = 3.141592000000000008d;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);

        // 프리미티브 타입은 표현 범위가 있으며 벗어나면 오류가 발생한다.
        // 반드시 초기화가 필요하다.
        // 참조 타입은 초기화가 필요하지 않다.

    }

}
