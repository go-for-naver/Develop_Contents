package sec2;

import java.util.Arrays;

public class Example4 {

    public static void main(String[] args) {

        String code = "801225-1278900";
        char m = code.charAt(7);             // 특정 인덱스에 있는 값을 가져올 때 사용하는 메서드
        String gender = (m == '1' || m == '3')? "남" : "여";
        System.out.println("성별 코드 : " + m);
        System.out.println("성별 : " + gender);

        // substring (80-12-25)
        String yy = code.substring(0, 2);
        String mm = code.substring(2, 4);
        String dd = code.substring(4, 6);
        System.out.println("생년월일 : " + (yy + "-" + mm + "-" + dd));

        // indexOf
        String nick = "kimKiTae";
        int idx = nick.indexOf('k');
        System.out.println("k의 문자 인덱스 값 : " + idx);
        idx = nick.indexOf('i');
        System.out.println("i의 문자 인덱스 값 : " + idx);
        idx = nick.lastIndexOf('i');
        System.out.println("i의 마지막 찾은 경우의 인덱스 값 : " + idx);

        // concat
        String name1 = nick + " imperial";                  // 문자열 결합 연산
        String name2 = nick.concat(" imperial");        // 문자열 결합 연산

        // toCharArray() : 문자열을 문자배열로
        // getBytes() : 문자열을 바이트배열로 (제어할 때 좋아서 실제로는 얘가 더 많이 쓰임)
        char[] nArr = nick.toCharArray();                   // 문자열을 문자 배열 k i m k i t a e 로 분리됨
        byte[] bArr = nick.getBytes();                      // 아스키코드 값이 들어감
        System.out.println("@ 2번째 : " + nArr[2]);          // m
        System.out.printf("# 2번째 : %s\n", bArr[2]);          // 109 -> m의 아스키 코드값

        // String.valueOf()
        int age = 23;
        float ht = 173.8f;
        boolean ps = true;
        String val1 = String.valueOf(age);                   // 정수 -> 문자열
        String val2 = String.valueOf(ht);                    // 실수 -> 문자열
        String val3 = String.valueOf(ps);                    // 부울 -> 문자열
        if (val1.equals("23")) System.out.println("문자열 변환 성공");

        // toUpperCase() / toLowerCase()
        System.out.println("대문자로 변환 : " + nick.toUpperCase());
        System.out.println("소문자로 변환 : " + nick.toLowerCase());

        // replace()
        String nick2 = nick.replace('k', 'g');  // 영문 대소문자 구분함
        System.out.println(nick2);

        // split() : 문자열 배열을 특정 구분자로 요소 분리
        String chunjae1 = "오세훈/오태훈/이은영/서광/이소윤/신예은";
        String chunjae2 = "백준철-신승원/구예진-한선/박진권-박나연";
        String[] stArr1 = chunjae1.split("/");
        String[] stArr2 = chunjae2.split("-|/");

        // Arrays.toString(문자열배열): 문자열배열을 출력
        System.out.println(Arrays.toString(stArr1));
        System.out.println(Arrays.toString(stArr2));

        // trim() : 해당 문자열의 앞 뒤의 공백 제거
        String data1 = "          kim          ";
        String data2 = "tae            ";
        String data3 = "               gi";
        System.out.println("글자수1 : " + data1.length());                     // 배열의 length는 괄호가 없으나, 문자열의 length는 괄호가 없음
        System.out.println("글자수2 : " + data2.length());
        System.out.println("글자수3 : " + data3.length());
        String trans1 = data1.trim();
        String trans2 = data2.trim();
        String trans3 = data3.trim();
        System.out.println("글자수1 : " + trans1.length());
        System.out.println("글자수2 : " + trans2.length());
        System.out.println("글자수3 : " + trans3.length());

    }

}
