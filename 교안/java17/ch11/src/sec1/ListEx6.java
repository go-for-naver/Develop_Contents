package sec1;

import java.util.LinkedList;
import java.util.List;

public class ListEx6 {

    public static void main(String[] args) {
        List<Student> s = new LinkedList<>();

        s.add(new Student(1, "이름1", 10));
        s.add(new Student(2, "이름2", 15));
        s.add(new Student(3, "이름3", 20));
        s.add(new Student(4, "이름4", 25));

        for (int i=0; i<s.size(); i++) {
            Student a = s.get(i);
            System.out.println(a.sno + "\t" + a.sname + "\t" + a.point);
        }

        // List와 LinkedList
        // 일반적인 속도는 LinkedList가 이전 포인터와 다음 포인터가 있어 훨씬 빠르나 중간 삭제나 중간 삽입의 경우는 List가 더 빠르다.
    }

}
