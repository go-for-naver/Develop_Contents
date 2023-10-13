package sec2;

public class Example7 {

    public static void main(String[] args) {

        // byte(1) < char(2) < short(2) < int(4) < long(8)
        // float(4) < double(8)

        // 자동 형변환 (auto casting) : 해당 타입에서 크기가 같거나 더 큰 타입에 대입되었을 때 발생
        int data1 = 1004;
        float data2 = data1;
        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);
        
        char data3 = '김';
        int data4 = data3;                          // data3을 아스키코드로 변환
        System.out.println("data3 = " + data3);
        System.out.println("data4 = " + data4);
        
        // 강제 형변환(Force Casting) : 형변환 연산자를 활용하는 형변환
        int data5 = 2048;
        byte data6 = (byte)data5;                         // int가 byte보다 크기 때문에 auto casting 불가능 => 형변환 연산자인 (byte) 사용 => 데이터의 신빙성 떨어짐
        System.out.println("data5 = " + data5);
        System.out.println("data6 = " + data6);

    }

}
