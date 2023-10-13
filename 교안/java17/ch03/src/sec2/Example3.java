package sec2;

public class Example3 {

    public static void main(String[] args) {

        /*
        int 카운트변수 = 0;
        do {
            증감식;
            반복실행할 문장;
        } while(조건);
        */
        // 실행 후에 조건판단을 하므로 무조건 1회 이상 실행 보장

        int i = 0;
        int tot = 0;
        do {
            i += 3;
            tot += i;
        } while (i >= 100);
        System.out.println("tot = " + tot);

        i = 0;
        tot = 0;
        while (i >= 100) {
            i += 3;
            tot += i;
        }
        System.out.println("tot2 = " + tot);

    }

}
