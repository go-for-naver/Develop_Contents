package sec2;

import java.io.*;

// 파일 생성 클래스 : File, Files(Path), FileOutputStream
// DataOutputStream : 한글과 같은 캐릭터셋을 지정하여 출력할 수 있음 => UTF-8(기본셋)
public class DataOutputEx1 {

    public static void main(String[] args) {
        try {
            File file = new File("c:\\Users\\db400tea\\IdeaProjects\\ch14\\out7.txt");
            if(!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream dos = new DataOutputStream(bos);           // 쓸 일 거의 없음

            dos.writeUTF("한글 깨지지 않도록 하기");
            dos.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}
