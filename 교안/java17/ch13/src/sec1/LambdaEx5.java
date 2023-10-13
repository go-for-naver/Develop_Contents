package sec1;

// Function
@FunctionalInterface
interface MyLambda5 {
    int print(String a);
}

public class LambdaEx5 {

    public static void main(String[] args) {
        MyLambda5 lam5 = (a) -> {
            return Integer.parseInt(a);
        };

        String q1 = "998";
        String q2 = "6";
        System.out.println("더한 결과 : " + (lam5.print(q1) + lam5.print(q2)));
    }

}
