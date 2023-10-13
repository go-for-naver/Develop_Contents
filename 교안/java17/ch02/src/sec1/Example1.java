package sec1;

public class Example1 {

    public static void main(String[] args) {

        // 연산 (Operation) : OPcode, Operend -> 명령코드, 데이터가있는메모리주소
        // 연산의 종류 : 산술연산, 대입연산, 증감연산, 관계연산, 논리연산, 비트연산, 기타연산(삼항연산자)

        // 산술연산 : +, -, *, /, %
        int a = 20;
        int b = 30;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = b / a;          // 연산 결과는 1.5지만 타입이 int이기 때문에 1이 저장됨
        int g = b % a;
        System.out.println("a + b = " + c);
        System.out.println("a - b = " + d);
        System.out.printf("a * b = %d\n", a * b);
        System.out.printf("b / a = %d\n", b / a);
        System.out.printf("b %% a = %d\n", g);

    }

}
