package sec2;

import sec1.Chunjae;

public class ChunjaeEx1 {

    public static void main(String[] args) {

        Chunjae c1 = new Chunjae();
        // c1.no = 10;          - private 이므로 같은 클래스 내부에서만 접근 가능하므로 접근 불가능
        // c1.partNo = 1234;    - default 이므로 같은 패키지에서만 접근 가능하므로 접근 불가능
        // c1.point = 200;      - protected 이므로 같은 패키지에 있거나 상속 관계에 있을 때만 가능하므로 접근 불가능
        c1.name = "김기태";      // public 이므로 어느 패키지나 클래스에 관계없이 모두 접근 가능하므로 접근 가능
        System.out.println(Chunjae.PI * 20 * 20);

    }

}
