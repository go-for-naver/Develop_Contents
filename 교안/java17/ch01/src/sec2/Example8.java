package sec2;

public class Example8 {

    public static void main(String[] args) {

        String name = "신예은";
        int age = 23;
        double wt = 45.5;
        System.out.print("이름 : " + name + "\n나이 : " + age + "\n체중 : " + wt);
        System.out.print("\n출력문 예시2\n");
        System.out.println("이름 : \"" + name + "\",\t나이 : \'" + age + "\'," +
                "\t체중 : " + wt);
        System.out.println("출력문 예시3");
        System.out.printf("이름 : \"%s\", \t나이 : \'%d\', \t체중 : %3.2f", name, age, wt);

        int num1 = 127;
        // %b : 2진수, %o : 8진수, %x : 16진수 -> 파이썬, C언어
        // 각 진수에 해당하는 숫자를 문자열로 바꾸므로 나중에 숫자로 변환하면,
        // 그 숫자 그대로 10진수 표기된다. 그러므로 절대 바꾼 데이터는 연산하지 않도록 해야한다.
        String bin = Integer.toBinaryString(num1);      // 2진수로 바꿔서 문자열로 저장
        String oct = Integer.toOctalString(num1);       // 8진수로 바꿔서 문자열로 저장
        String hex = Integer.toHexString(num1);         // 16진수로 바꿔서 문자열로 저장
        System.out.println("\n2진수 : " + bin);
        System.out.println("8진수 : " + oct);
        System.out.println("16진수 : " + hex);
        System.out.println("10진수 : " + num1);

        // String k = bin + oct + hex;                        // 문자열이기 때문에 String 타입에 저장해야 함
        int k = Integer.parseInt(bin) + Integer.parseInt(oct);      // 더하기 위해서는 10진수로 바꿔주어야 함 (하지만 2진수를 10진수로 변환하는 것이 아니라 2진수를 10진수라고 생각해 더하기 때문에 데이터 이상해짐)
        System.out.println("더한 결과1 : " + k);
        // System.out.println(Integer.parseInt(bin));

        int b1 = 0b101111;
        int o1 = 0746;
        int x1 = 0x4fc;
        System.out.println("b1 = " + b1);
        System.out.println("o1 = " + o1);
        System.out.println("x1 = " + x1);

        int j = b1 + o1 + x1;
        System.out.println("j = " + j);

    }

}
