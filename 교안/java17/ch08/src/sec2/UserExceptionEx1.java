package sec2;

public class UserExceptionEx1 {

    public static void main(String[] args) {

        try {
            method1();
        } catch (RunException e) {
//            e.getMessage();                                             // 웹에서만 메시지를 볼 수 있음
            System.out.println(e.getMessage());
            e.printStackTrace();                                          // IDE의 콘솔창에서만 확인 가능
        }

    }

    public static void method1() throws RunException {
        throw new RunException("실행 ");                                 // 예외를 강제로 발생시키는 것
    }

}
