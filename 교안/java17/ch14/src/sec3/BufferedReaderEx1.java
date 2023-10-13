package sec3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// BufferedReader : 줄 단위로 불러올 경우 활용
public class BufferedReaderEx1 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(
                new FileReader("out4.txt")
        );

        String data;
        while((data = rd.readLine()) != null) {
            System.out.println(data);
        }

    }
}
