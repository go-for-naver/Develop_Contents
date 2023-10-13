package sec4;

import java.util.Arrays;

public class StringEx3 {

    public static void main(String[] args) {

        String str1 = new String();
        str1 += "김이름";
        str1 += "/";
        str1 += "이이름";
        str1 += "/";
        str1 += "박이름";
        str1 += "/";
        str1 += "최이름";
        System.out.println(str1);

        // StringBuffer
        StringBuffer str2 = new StringBuffer();
        str2.append("김이삼");
        str2.append("/");
        str2.append("박이삼");
        str2.append("/");
        str2.append("최이삼");
        str2.append("/");
        str2.append("이이삼");
        str2.replace(0, 3, "김기태");
        System.out.println(str2.toString());            // 데이터가 정상적으로 나오지 않는 경우를 대비해 toString 붙여줌

        // StringBulider
        StringBuilder str3 = new StringBuilder();
        str3.append("김삼사");
        str3.append("-");
        str3.append("이삼사");
        str3.append("-");
        str3.append("박삼사");
        str3.append("-");
        str3.append("최삼사");
        System.out.println(str3.toString());            // 데이터가 정상적으로 나오지 않는 경우를 대비해 toString 붙여줌
        str3.insert(4, "새이름-");
        System.out.println(str3.toString());
        System.out.println(str3.substring(4, 7));
        System.out.println(str3.reverse());
        String str = str3.toString();                   // String으로 형변환
        String[] str4 = str.split("-");           // 구분 기호로 나누려면 String으로 형변환 해줘야 함
        System.out.println(Arrays.toString(str4));

    }

}
