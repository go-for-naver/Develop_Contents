package sec1;

public class GenEx1 {

    public static void main(String[] args) {

        Gen1 g1 = new Gen1();
        g1.method1("Yeeun");                // '' 안됨 => char이기 때문에

        // 일반 클래스로 만들어진 필드의 값은 오로지 한가지 타입 밖에 지원되지 않으므로 t 필드는 String 타입만 받을 수 있음
        // g1.setT(10);
        g1.setT("신예은");
    }

}
