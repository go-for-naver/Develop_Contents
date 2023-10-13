package sec3;

public class SystemEx1 {
    // 보안관리자 설정하여 특정 조건이 되면 시스템(프로그램) 종료
    public static void main(String[] args) {
        /* 자바 11이전 버전에서 사용하던 방법
        System.setSecurityManager(new SecurityManager() {
            @Override
            public void checkExit(int status) {
                if (status != 5) {
                    throw new SecurityException();
                }
            }
        });
        */

        for(int i=0; i<5; i++) {
            try {
                // 비밀번호 확인 로직
                System.out.println(i);
            } catch (SecurityException e) {
                System.exit(i);
                System.out.println("종료");
            }
        }

    }

}
