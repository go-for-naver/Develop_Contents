package sec1;

public class Descendant extends Man {

    @Override
    public void method1() {
        System.out.println("후손 메서드1");
    }

    @Override
    public int method2() {
        return 3;
    }

    @Override
    public void method3(int no) {
        System.out.println("후손 메서드3 : " + no);
    }

    @Override
    public int method4(int no) {
        return no + 2;
    }
}
