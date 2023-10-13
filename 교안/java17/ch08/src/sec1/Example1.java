package sec1;

public class Example1 {

    public static void main(String[] args) {

        // 예외(Exception) : 문법 상의 오류(Syntax Error)가 아니며, 실행 중의 오류가 발생한 상황
        // 주요 예외 : NullPointer, Arithmetic, ArrayIndexBounds, ClassCast, NumberFormat, ClassNotFound
        // 모든 예외는 java.lang.Exception의 서브 클래스로 구성됨
        // 외부 자원(파일, 데이터베이스, 주변 장치) 등을 연동하거나 활용하기 위하여는 반드시 예외처리가 동반되어야 함

        int no1 = 100;
        int no2 = 0;
        int res = 0;

        try {
            res = no1 / no2;                                        // 예외 처리 대책이 필요한 문장을 try 구절로 묶음
        } catch (ArithmeticException e) {                           // 예외 사항이 발생하였을 경우 실행할 문장을 catch 구절로 묶음
            System.out.println("divide 0");      // 'no2가 0으로 나누려고 시도하였음' 출력
            System.out.println(e.getMessage());                     // '/ by zero' 출력
            e.printStackTrace();                                    // 'java.lang.ArithmeticException: / by zero at sec1.Example1.main(Example1.java:16)' 출력 (일반적으로 사용)
        } catch (Exception e) {                                     // 모든 예외를 처리할 수 있는 구문을 꼭 넣어 주어야 함
            e.printStackTrace();
        } finally {                                                 // 성공, 실패 관계없이 무조건 실행해야 하는 문장
            // finally 예시: 주변장치를 연동하여 데이터를 주고받은 경우, 마지막에 꼭 닫아줄 때 사용
            System.out.println("connected end");
            System.out.println("closing");
        }
        System.out.println("print complete");                              // 예외처리하면 출력됨 (오류가 어떤 것인지 출력해준 뒤, 아래 코드를 실행함) => 예외처리 하는 이유

    }

}
