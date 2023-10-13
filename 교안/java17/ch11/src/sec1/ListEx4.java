package sec1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 과정 관리 로직
class Course {
    public int cno;
    public String cname;
    public int cprise;
    public double ctime;
}

public class ListEx4 {
    static List<Course> cList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ck = true;                      // 과정 작업 상태 - true: 계속, false: 종료
        int i = 0;                              // 과정수
        while (ck) {
            System.out.print("작업 번호[1-6] : ");
            int num = sc.nextInt();
            sc.nextLine();
            switch (num) {
                case 1:
                    i++;
                    System.out.println("과정 등록\n");
                    Course c = new Course();
                    c.cno = i;
                    System.out.print("과목이름 : ");
                    c.cname = sc.nextLine();
                    System.out.print("단가 : ");
                    c.cprise = sc.nextInt();
                    System.out.print("소요시간 : ");
                    c.ctime = sc.nextDouble();
                    cList.add(c);
                    break;
                case 2:
                    System.out.println("과정 검색\n");
                    System.out.print("검색할 과정 번호 : ");
                    int no = sc.nextInt();

                    if (no < cList.size()) {
                        Course co = cList.get(no);
                        System.out.println("과정번호 : " + co.cno);
                        System.out.println("과정이름 : " + co.cname);
                        System.out.println("과정단가 : " + co.cprise);
                        System.out.println("소요시간 : " + co.ctime);
                    } else {
                        System.out.println("해당 과정이 존재하지 않습니다.");
                    }
                    break;
                case 3:
                    System.out.println("과정 삭제\n");
                    System.out.print("삭제할 과정 번호 : ");
                    no = sc.nextInt();
                    if (no <= cList.size()) {
                        cList.remove(no);
                    } else {
                        System.out.println("해당 과정이 존재하지 않습니다.");
                    }
                    break;
                case 4:
                    System.out.println("과정 목록\n");
                    System.out.println("과정번호\t과정이름\t수강료\t수강시간");
                    for (Course cr:cList) {
                        System.out.printf("%d\t%s\t%d\t%f", cr.cno, cr.cname, cr.cprise, cr.ctime);
                    }
                    break;
                case 5:
                case 6:
                    ck = false;
                    break;
                default:
                    System.out.println("작업 번호는 1~6까지입니다.");
            }
        }
    }

}
