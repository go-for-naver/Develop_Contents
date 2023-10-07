package sec2;

public class Exam04 {
    public static void main(String[] args) {
        //연산문
        //산술연산
        int a = 1004 / 10 * 20 % 5 + 4 - 2;
        //대입연산자 : 모든 연산의 끝
        int b = 20;
        b += 50;    //b=b+50
        b -= 20;    //b=b-20
        b *= 30;    //b=b*30
        b /= 10;    //b=b/10
        b %= 17;    //b=b%17
        b >>= 2;    //b = b >> 2
        b <<= 2;    //b = b << 2
        //비교연산
        System.out.println(a>b);    //초과
        System.out.println(a>=b);   //이상
        System.out.println(a<b);    //미만
        System.out.println(a<=b);   //이하
        System.out.println(a==b);   //같으면
        System.out.println(a!=b);  //서로 다르면

        int c = 123 * 4 / 3 - 9 + 2;
        //논리 연산
        System.out.println(a>b && a>c); //and
        System.out.println(a>b || a>c); //or
        System.out.println(!(a>b)); //not

        //비트연산(2진수 연산 : 원래의 수를 2진수로 변환 후에 연산)
        System.out.println(a&80); //AND
        System.out.println(a|80); //OR
        System.out.println(a^80); //XOR
        System.out.println(~a); //Complement(보수 : 숫자 배치상 반대의 수)
    }
}
