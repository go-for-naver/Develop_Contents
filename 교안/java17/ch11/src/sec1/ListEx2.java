package sec1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListEx2 {

    public static void main(String[] args) {

        List lst1 = new ArrayList();                // 다형성
        lst1 = new Vector();
        lst1 = new LinkedList();

//        ArrayList lst2 = new ArrayList();
//        lst2 = new Vector();                      // 형제 클래스로는 바꿀 수 없음

        Vector lst2 = new Vector();

        method1(lst1);
//        method2(lst2);

    }

    public static void method1(List ls) {

    }

    public static void method2(ArrayList ls2) {             // 매개변수를 받을 때에서 List로 받아야 함

    }

}
