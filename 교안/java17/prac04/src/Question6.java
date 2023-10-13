public class Question6 {

    public static void main(String[] args) {

        for (int i=0; i<10; i++) {
            for (int j=0; j<5; j++) {
                System.out.printf("i = %d, j = %d\n", i, j);
                if (i == 3 && j == 2) {
                    i = 11;
                    break;
                }
            }
        }

    }

}
