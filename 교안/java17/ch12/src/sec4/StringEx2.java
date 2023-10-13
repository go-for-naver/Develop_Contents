package sec4;

import java.util.StringTokenizer;

public class StringEx2 {

    public static void main(String[] args) {
        String mem1 = "김이름/이이름/박이름/최이름/계이름";
        String[] m1 = mem1.split("/");
        for (String name : m1) {
            System.out.println(name);
        }

        System.out.println();

        String mem2 = "가나다&라마바,사아자,차카-타파하";
        String[] m2 = mem2.split("&|,|-");
        for (String name : m2) {
            System.out.println(name);
        }

        System.out.println();

        String mem3 = "김이이/이이이/박이이/최이이";
        StringTokenizer em3 = new StringTokenizer(mem3, "/");
        int cnt = em3.countTokens();                // 토큰에 의해 분리된 요소수
        for (int i=0; i<cnt; i++) {
            String token = em3.nextToken();
            System.out.println(token);
        }
    }

}
