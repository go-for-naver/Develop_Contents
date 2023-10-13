package sec1;

// Consumer
@FunctionalInterface            // 하나의 메소드만 기술할 수 있음
interface MyLambda2 {
    void print(int x);
}

public class LambdaEx2 {

    public static void main(String[] args) {
        MyLambda1 lam1 = () -> {
            System.out.println("람다 예제2");
        };
        lam1.print();

        MyLambda2 lam2 = (x) -> {
            System.out.println("제곱 결과 : " + (x * x));
        };
        lam2.print(1004);
    }

}
