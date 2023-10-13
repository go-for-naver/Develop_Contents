package sec1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// 키보드로 문자를 입력받아 out2.txt로 저장하고, 그 내용을 불러와 콘솔창에 다시 출력하는 프로그램
public class StreamEx2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("문자 입력 : ");
        String inputText = sc.nextLine();
        byte[] bArr = inputText.getBytes();

        try {
            FileOutputStream fos = new FileOutputStream("out2.txt");
            for(byte b : bArr) {
                fos.write(b);
            }
            fos.close();
        } catch(IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("out2.txt");
            int i;
            System.out.print("저장되어 있는 문자 : ");
            while ((i = fis.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
