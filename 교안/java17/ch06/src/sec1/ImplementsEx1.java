package sec1;

public class ImplementsEx1 {

    public static void main(String[] args) {

        Flying f1;              // 인터페이스 선언
//        f1 = new Flying();    // 구현 내용이 기술이 되어야 하므로 생성 안됨
        f1 = new Flying() {     // 익명의 객체
            @Override
            public void fly() {
                System.out.println("비행체가 날아갑니다~!");
            }
        };
        f1.fly();

        f1 = new Airplane();
        f1.fly();

        f1 = new Dragonfly();
        f1.fly();

        f1 = new Birds();
        f1.fly();

    }

}
