package sec3;

import java.util.Properties;
import java.util.Set;

public class SystemEx4 {

    public static void main(String[] args) {
        System.out.println("운영체제 : " + System.getProperty("os.name"));
        System.out.println("사용자 : " + System.getProperty("user.name"));
        System.out.println("사용자 디렉토리 : " + System.getProperty("user.home"));
        System.out.println("현재 자바 버전 : " + System.getProperty("java.version"));
        System.out.println("자바 홈 : " + System.getProperty("java.home"));                // 개발 환경 구축할 때 설정했던 java_home 출력하고 싶은 경우
        System.out.println();

        Properties props = System.getProperties();
        Set keys = props.keySet();
        for (Object obj : keys) {
            String key = obj.toString();
            String val = System.getProperty(key);
            System.out.printf("[%s] : %s \n", key, val);
        }
    }

}
