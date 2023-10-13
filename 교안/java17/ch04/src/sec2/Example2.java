package sec2;

public class Example2 {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30};
        int[][] arr2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}, {20, 40, 60}};
        int[][][] arr3 = {{{10, 20},{30, 40},{50, 60}},{{10, 20},{30, 40},{50, 60}}};

        System.out.println("2차원 배열");
        for (int i=0; i<arr2.length; i++) {                 // 줄
            for (int j=0; j<arr2[i].length; j++) {          // 칸
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n3차원 배열");
        for (int i=0; i<arr3.length; i++) {
            for (int j=0; j<arr3[i].length; j++) {
                for (int k=0; k<arr3[i][j].length; k++) {
                    System.out.print(arr3[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println("----------------");
        }

    }

}
