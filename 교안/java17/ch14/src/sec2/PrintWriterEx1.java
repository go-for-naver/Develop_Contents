package sec2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// PrintWriter : 출력을 버퍼, 한 줄, 한 글자, 문자열 등의 모든 단위의 파일에 쓰기 작업 (많이 사용)
public class PrintWriterEx1 {
    public static void main(String[] args) {
        try {
            File file = new File("out4.txt");
            if(!file.exists()) {            // 파일 없으면 파일 만들기~
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);       // 연필
            PrintWriter writer = new PrintWriter(fw);   // 정말 필기를 잘 하는 사람 (BufferedWriter보다 잘 함)
            
            // 연필로 노트에 쓰기
            writer.write("점심시간 10분전");
            writer.println("배고파");
            writer.print(" 밥");
            writer.print("\n진짜 배고파");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
