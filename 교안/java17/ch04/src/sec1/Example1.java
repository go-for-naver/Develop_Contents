package sec1;

public class Example1 {

    public static void main(String[] args) {

        // 메모리 할당 X
        int[] a;                // 선언 1 - 타입[] 배열명;
        int b[];                // 선언 2 - 타입 배열명[];
//        System.out.println("a[0] = " + a[0]);         // a는 선언만 된 상태이며, 메모리 할당이 되지 않았기 때문에 사용 불가능

        // 메모리 할당 O
        int[] c = new int[3];   // 선언 3 - 타입[] 배열명 = new 타입[개수];
        int d;
        System.out.println("c[0] = " + c[0]);           // 'c[0] = 0' 출력
//        System.out.println(d);                        // d는 primitive 타입이므로 반드시 초기화 필요


    }

}
