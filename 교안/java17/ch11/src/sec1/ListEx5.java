package sec1;

import java.util.List;
import java.util.Vector;

public class ListEx5 {

    public static void main(String[] args) {

        List<Qna> q = new Vector<>();
        Qna a = new Qna(1,"제목1", "내용1");
        q.add(a);
        q.add(new Qna(2,"제목2", "내용2"));
        q.add(new Qna(3, "제목3", "내용3"));
        q.add(new Qna(4, "제목4", "내용4"));
        System.out.println("글번호\t제목\t\t내용");
        for (Qna p:q) {
            System.out.println(p.qno + "\t\t" + p.title + "\t" + p.content);
        }

    }

}
