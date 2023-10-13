package sec1;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        // 제어문 : 조건분기문, 반복문, 기타 제어문
        // 조건분기문 : if, if~else~, if~else if~else~, switch~case~break
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 입력 : ");
        String name = sc.nextLine();
        System.out.print("나이 입력 : ");
        int age = sc.nextInt();
        System.out.print("키 입력 : ");
        double height = sc.nextDouble();

        System.out.printf("\n이름 : %s, 나이 : %d, 키 : %3.2f\n", name, age, height);

        // if 기본 문법
        /* if(조건식) {
            조건이 만족할 때 실행할 문장1;
            조건이 만족할 때 실행할 문장2;
           } 또는
           if(조건식) 조건이 만족할 때 실행할 문장;
        */
        if(age >= 36) {
            System.out.println("당신은 중년 이상입니다.");
            System.out.println("그 누구도 당신을 유혹하지 않습니다.");
        }

        if(height <= 170) System.out.println("숏다리입니다.");


    }
}
