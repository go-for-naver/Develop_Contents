package sec2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// 출력 방식 : BufferedWriter, PrintWrite, FileOutputStream, Files, DataOutputStream
public class BufferWriterEx1 {

    public static void main(String[] args) {
        /*
        String path = "d:\\shin\\java\\out3.txt";
        File file = new File(path);
        */

        try {
            File file = new File("out3.txt");           // 노트

            if (!file.exists()) {        // 해당하는 파일이 없다면 파일 만들기
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);               // 연필
            BufferedWriter writer = new BufferedWriter(fw);     // 연필 사용자

            // 연필로 노트에 쓰기
            writer.write("이건 바이트 단위가 아니라 문자열 단위라 이렇게 써도 됨");
            writer.close();
            // file 객체는 close() 해주지 않아도 자동으로 됨

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
