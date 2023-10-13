package sec1;

// 추상화 클래스 : 부분 추상화하고 싶을 때 사용
public abstract class Man {

    private int item1;
    private String item2;

    // 추상화 : 실제 구현 내용을 적지 않고, 상속받는 클래스에서 구현 내용을 기술함으로써 물려받는 입장에서 쓰고 싶은 것이 다를 경우, 미리 method5~8처럼 사용처럼 정해버리면
    //         그대로 쓰거나 오버라이딩을 해야 함
    // 반환 타입과 매개변수만 지키면 내 맘대로 커스텀 가능
    public abstract void method1();         // 선언만
    public abstract int method2();
    public abstract void method3(int no);
    public abstract int method4(int no);

    // 추상화 선언이 아니므로 구현내용을 기술해야 함
    public void method5() {
        System.out.println("method5");
    }
    public int method6() {
        return 100;
    }
    public void method7(int no) {
        System.out.println("매개변수 값: " + no);
    }
    public int method8(int no) {
        return no * (no - 1);
    }

}
