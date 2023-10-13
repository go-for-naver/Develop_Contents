package sec1;

// Generic의 T(Type)은 기본형(Primitive)일 수 없음
// 그러므로 기본타입이 아닌 클래스(참조형)로 선언하여 선언해야 함
public class Gen4 implements InterGen3<Integer> {

    @Override
    public Integer method1() {
        return 100;
    }
}
