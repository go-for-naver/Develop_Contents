package sec2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputEx1 {

    public static void main(String[] args) {
        try {
            File file = new File("out5.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            fos.write("eat rice".getBytes());
            fos.close();
        } catch(IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("out5.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("입력파일이 존재하지 않거나 경로가 잘못되었습니다.");
        }
    }

}
