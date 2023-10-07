package sec2;

public class Exam03 {
    public static void main(String[] args) {
        //변수와 타입
        //선언문 : 변수와 클래스와 생성자, 멤버 필드, 멤버 메소드 등을 정의하는 행위
        //변수 선언 : 저장소의 사용 용도와 저장소의 이름을 선언
        //타입(type) : 변수를 선언할 때 어떠한 저장소의 용도로 사용할 지 선언하는 형태
        //기본 타입과 참조 타입이 존재함.
        //기본 타입 : 하나의 데이터만 저장할 수 있는 형태
        //boolean : true, false
        boolean t = true;
        //byte : 0~255(-128~127)
        byte b = 'a';
        //char : 한 글자 2byte
        char c = 128;
        //short : 단정도정수 2byte : 65536
        short s = 32767;
        //int : 정수 4byte
        int i = 567890568;
        //long : 배정도정수 8byte
        long l = 56789056800l;
        //float : 단정도실수 4byte
        float f = 3.6789543f;
        //double : 배정도실수 8byte
        double d = 3.67895432178954d;

        //Wrapper -> int(Integer)
        String a = "365.123"; //기본형 X
        char[] ch = {'3','6','5','.','1','2','3'}; //기본형 X
        int su1 = Integer.parseInt(a); //365
        float su2 = Float.parseFloat(a); //365.123

        Integer su3 = su1;      //boxing(Wrap)
        int su4 = su3;          //unboxing
    }
}
