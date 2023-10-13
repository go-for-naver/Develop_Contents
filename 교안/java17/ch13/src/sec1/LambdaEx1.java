package sec1;

// 람다의 추상체는 기능적 인터페이스로 람다를 구현하려면 이와 같은 추상체가 필요
@FunctionalInterface
interface MyLambda1 {
    void print();                           // 람다식의 추상체
}


public class LambdaEx1 {
    public int method1(int x, int y) {      // 정의했으면 나중에 호출해줘야 함
        return x * y;
    }

    /*
    1. 람다식 구현체 (호출X)
      (argument)  (arrow token)   (function body)
        매개변수      어로우토큰          함수바디
        (x, y)          ->            { x * y };
    
    2. 람다식 종류
        () -> { }           : Basic (취급안함)
        (x) -> { }          : Consumer
        () -> { x }         : Supplier
        (x) -> { x * x }
            : Operator  (주로 매개변수를 전달받아 처리를 한 후 다시 반환하는 타입)
            : Function  (주로 매개변수를 받아 처리한 후 그 결과를 형변환하여 반환하는 타입)
            : Predicate (주로 매개변수를 받아 비교한 후 일치하는지 여부를 논리값으로 반환하는 타입)
    */

    public static void method1() {                      // 일반적인 메소드 구조
        System.out.println("안녕하세요~! 메소드1입니다.");
    }

    public static void main(String[] args) {
        method1();                                      // 일반적인 메소드 구조
        MyLambda1 lam1 = () -> {                        // 람다식 구조 (람다식은 추상화만 해놓고 쓰고 싶을 때 꾸며서 쓸 수 있다는 장점을 가지고 있음)
            System.out.println("안녕하세요~! 람다식1입니다.");
        };
        lam1.print();
    }

}
