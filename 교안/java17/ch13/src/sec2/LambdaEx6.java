package sec2;

@FunctionalInterface
interface MyLambda6<T, Q> {            // 어떤 타입이 들어올지 모르므로 제네릭 T 사용
    // T : 매개변수 타입, Q : 리턴 타입
    Q calc(T x, T y);
}

public class LambdaEx6 {

    public static void main(String[] args) {

        // 더하기 & 빼기 & 곱하기 & 나누기 구현체 작성
        MyLambda6<Integer, Integer> plus = (x, y) -> {
            return x + y;
        };
        MyLambda6<Integer, Integer> minus = (x, y) -> {
            return x - y;
        };
        MyLambda6<Integer, Long> mul = (x, y) -> {
            return (long) x * y;
        };
        MyLambda6<Integer, Double> div = (x, y) -> {
            return (double) x / y;
        };
        MyLambda6<Integer, Integer> mod = (x, y) -> {
            return x % y;
        };

        System.out.println("더한 결과 : " + plus.calc(30, 60));
        System.out.println("뺀 결과 : " + minus.calc(90, 27));
        System.out.println("곱한 결과 : " + mul.calc(30, 60));
        System.out.println("나눈 결과 : " + div.calc(60, 30));
        System.out.println("나눈 나머지 결과 : " + mod.calc(90, 27));

    }

}
