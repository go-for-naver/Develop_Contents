package sec2;

import java.util.Arrays;

public class Example1 {

    public static void main(String[] args) {

        int a = 0;
        int[] intArr = new int[3];
        double[] doubleArr = new double[3];
        boolean[] boolArr = new boolean[3];
        String[] strArr = new String[3];

        System.out.println("a = " + a);
        System.out.println("intArr = " + intArr);       // intArr 3개가 들어있는 주소가 출력됨
        for (int b : intArr) {
            System.out.println(b);                      // intArr 안에 들어있는 요소(0)가 출력됨
        }

        System.out.println("------------------------------------");
        System.out.println(Arrays.toString(intArr));    // 배열을 순회하지 않고 안에 들어있는 요소가 출력됨
        System.out.println(Arrays.toString(doubleArr));
        System.out.println(Arrays.toString(boolArr));
        System.out.println(Arrays.toString(strArr));

    }

}
