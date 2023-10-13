package sec1;

public class ChunjaeEx2 {

    public static void main(String[] args) {

        Chunjae c1 = new Chunjae();
        // c1.no = 10;          - private 이므로 같은 클래스 내부에서만 접근 가능하므로 접근 불가능
        c1.partNo = 1234;       // default 이므로 같은 패키지에서만 접근 가능하므로 접근 가능
        c1.point = 200;         // protected 이므로 같은 패키지에 있거나 상속 관계에 있을 때만 가능하므로 접근 가능
        c1.name = "김기태";      // public 이므로 어느 패키지나 클래스에 관계없이 모두 접근 가능하므로 접근 가능
        System.out.println(Chunjae.PI * 20 * 20);
        // public > protected > default > private

        Sehun[] sArray = new Sehun[10];                 // 같은 패키지에 있는 클래스가 아니므로 사용 불가
        Chanwon ch1 = new Chanwon();

        for (int i=0; i<sArray.length; i++) {
            sArray[i] = new Sehun();                    // 객체의 배열은 원소를 재생성해야 함
            sArray[i].setNo(i+1);
            sArray[i].setData("사람" + (i+1));
        }

        for (Sehun s:sArray) {
            System.out.printf("%d %s\n", s.getNo(), s.getData());
        }

    }

}
