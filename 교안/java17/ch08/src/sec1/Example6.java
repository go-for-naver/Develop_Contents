package sec1;

public class Example6 {

    public static void main(String[] args) {

        // 모든 클래스의 최고 조상은 Object
        // Class도 Object의 자식
        // Class: 다른 자식을 로딩하기 위한 클래스

        try {
            Class clazz = Class.forName("maria.jdbc.driver");       // class loading 구문에는 반드시 try-catch 처리 필수
        } catch (ClassNotFoundException e) {
            System.out.println("존재하지 않는 클래스이거나 알 수 없는 클래스임");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("원인 불명");
            e.getMessage();                 // 웹에서만 메시지를 볼 수 있기 때문에 사용자도 볼 수 있음
            e.printStackTrace();            // 콘솔창에 떠서 개발자만 볼 수 있음
        } finally {
            System.out.println("연결 종료/자동 닫기");
        }

    }


}
