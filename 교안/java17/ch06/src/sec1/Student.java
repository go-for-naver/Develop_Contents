package sec1;

public class Student {

    private int no;
    private String name;
    private int kor;
    private int eng;
    private int mat;

    // 접근제한자 반환타입 메서드명([타입 매개변수명]) { return 해당반환타입의데이터값또는변수; }
    // 1. 리턴X, 매개변수X
    public void method1() {
        System.out.println("메서드1");
    }

    // 2. 리턴O, 매개변수X
    public int method2() {
        int a = 1004;
        return a;
    }

    // 3. 리턴X, 매개변수O
    public void method3(int a) {
        System.out.println("당신은 " + a);
    }

    // 4. 리턴O, 매개변수O
    public int method4(int a) {
        return a*a;
    }

}
