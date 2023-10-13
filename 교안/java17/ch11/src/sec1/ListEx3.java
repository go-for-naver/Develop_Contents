package sec1;

import java.util.ArrayList;
import java.util.List;

class Student {
    public int sno;
    public String sname;
    public int point;

    public Student() {  }

    public Student(int sno, String sname, int point) {
        this.sno = sno;
        this.sname = sname;
        this.point = point;
    }
}

public class ListEx3 {

    public static void main(String[] args) {

        List<String> lst1 = new ArrayList<>();
        lst1.add("김이름");               // 요소 추가
        lst1.add("이이름");
        lst1.add("박이름");
        lst1.add("최이름");
        System.out.println(lst1);       // [김이름, 이이름, 박이름, 최이름] 출력

        lst1.remove(1);           // 특정 인덱스 위치의 요소 제거
        System.out.println(lst1);

        lst1.clear();                   // 모든 요소 제거
        System.out.println(lst1);

        lst1.add("새이름");
        lst1.add("신이름");
        lst1.add("권이름");
        lst1.add("박이름");
        System.out.println(lst1);
        System.out.println("리스트의 요소 수 : " + lst1.size());           // 개수
        System.out.println("특정 인덱스가 2인 데이터 : " + lst1.get(2));
        
        if (lst1.contains("이기태")) {                                    // 요소 존재 여부 확인
            System.out.println("이기태가 존재합니다.");
        } else {
            System.out.println("이기태가 존재하지 않습니다.");
        }
        if (lst1.isEmpty()) {                                           // 빈 리스트를 검증
            System.out.println("현재 리스트가 비어 있음");
        } else {
            System.out.println("현재 리스트가 사용 중임");
        }

        for (int i=0; i<lst1.size(); i++) {
            System.out.println(lst1.get(i));
        }
        System.out.println("=======================================");
        for (String s:lst1) {
            System.out.println(s);
        }

        System.out.println("=======================================");

        List<Student> sl = new ArrayList<>();
        Student q1 = new Student();
        q1.sno = 1;
        q1.sname = "이름1";
        q1.point = 90;
        Student q2 = new Student();
        q2.sno = 2;
        q2.sname = "이름2";
        q2.point = 85;
        Student q3 = new Student();
        q3.sno = 3;
        q3.sname = "이름3";
        q3.point = 50;

        sl.add(q1);
        sl.add(q2);
        sl.add(q3);

        Student q;
        for(int i=0; i<sl.size(); i++) {
            q = sl.get(i);
            System.out.println("번호 : " + q.sno);
            System.out.println("이름 : " + q.sname);
            System.out.println("점수 : " + q.point);
        }
        System.out.println("=======================================");

        for (Student s:sl) {
            System.out.println("번호 : " + s.sno);
            System.out.println("이름 : " + s.sname);
            System.out.println("점수 : " + s.point);
        }

    }

}
