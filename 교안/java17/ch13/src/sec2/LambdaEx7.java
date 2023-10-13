package sec2;

// Predicate
@FunctionalInterface
interface MyLambda7<T, Q> {
    boolean compare(T t, Q q);
}

public class LambdaEx7 {

    public static void main(String[] args) {
        MyLambda7<Integer, Integer> comp1 = (a, b) -> {
            return (a == b ? true : false);
        };
        MyLambda7<String, String> comp2 = (a, b) -> {
            return (a.equals(b) ? true : false);
        };
        
        System.out.println("비교 결과1 : " + comp1.compare(10, 30));
        System.out.println("비교 결과2 : " + comp2.compare("안녕", "안녕"));
    }

}
