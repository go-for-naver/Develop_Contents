package sec1;

@FunctionalInterface
interface MyLambda4 {
    String print(int a);
}

public class LambdaEx4 {

    public static void main(String[] args) {
        MyLambda4 lam4 = (a) -> {
            return a + "가 입력되었습니다.";
        };

        System.out.println(lam4.print(1004));
    }

}
