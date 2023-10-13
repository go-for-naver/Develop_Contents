package sec2;

public class Example4 {

    public static void main(String[] args) {
        System.out.println("[예시]");
        for (int a=1; a<=5; a++) {
            for (int b=1; b<=4; b++) {
                System.out.print(b + "\t");
            }
            System.out.println();
        }

        /* 1번)
            1   2   3   4   5   6   7
            8   9   10  11  12  13  14
           15  16   17  18  19  20  21
           22  23   24  25  26  27  28
           29  30   31
        */
        System.out.println("[1번]");
        for (int i=0; i<5; i++) {
            for (int j=1; j<=7; j++) {
                int date = 7 * i + j;
                if (date > 31) break;
                System.out.printf("%2d \t", date);
            }
            System.out.println();
        }

        /* 2번)
            *
            **
            ***
            ****
            *****
        */
        System.out.println("[2번]");
        for (int i=0; i<5; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /* 3번)
            *****
            ****
            ***
            **
            *
        */
        System.out.println("[3번]");
        for (int i=0; i<5; i++) {
            for (int j=0; j<5-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /* 4번)
            구구단
            2X1=2   3X1=3  ....... 9X1=9
            ............................
            2X9=18  3X9=27 ....... 9X9=81
        */
        System.out.println("[4번]");
        for (int i=1; i<=9; i++) {
            for (int j=2; j<=9; j++) {
                System.out.printf("%dX%d=%2d\t", j, i, (j*i));
            }
            System.out.println();
        }

    }

}
