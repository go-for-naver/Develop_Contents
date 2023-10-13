package sec5;

import java.util.Arrays;

public class ArraysEx1 {
    public static void main(String[] args) {
        char[] arr1 = {'k', 'i', 'm', 'j', 'a', 'v', 'a'};
        System.out.println(arr1);
        char[] arr2 = arr1;                     // 얕은 복제: 다른 곳(기억장소)에 같은 데이터를 복제하는 것이 아니라 이미 저장되어 있는 데이터의 주소만을 다른 변수에 저장 (실제 기억된 데이터는 1개만 존재함)
        System.out.println(arr2);
        System.out.println(arr1.hashCode());
        System.out.println(arr2.hashCode());
        System.out.println(arr1 == arr2);

        char[] arr3 = Arrays.copyOf(arr1, arr1.length);     // 모든 요소 복제 (깊은 복제)
        System.out.println(arr3);
        System.out.println(arr3.hashCode());
        System.out.println(arr1 == arr3);                   // 배열은 주소로 비교하게 됨
        System.out.println(Arrays.equals(arr1, arr3));      // 배열의 값을 비교하려면 Arrays.equals() 사용

        System.out.println("정렬 전");
        int[] points = {90, 100, 80, 70, 95, 85, 75};
        for (int p : points) {
            System.out.print(p + "\t");
        }
        Arrays.sort(points);                                // 정렬
        System.out.println("\n정렬 후");
        for (int p : points) {
            System.out.print(p + "\t");
        }

        System.out.println("\n80은 어디에? " + Arrays.binarySearch(points, 80));            // 이진 검색

    }

}
