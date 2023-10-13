package sec2;

import java.util.List;

public class Multi4 {
    public void method1(List<?> lst) {                      // ?(와일드카드) : Type, Value.... 다 가능
        for (Object obj : lst) {                            // 목록 출력
            System.out.println(obj + "\t");
        }
    }

    public int method2(List<? extends Number> lst) {        // 목록의 합계
        int hap = 0;
        for (Number i : lst) {
            hap += i.doubleValue();
        }
        return hap;
    }

    public List<? super Integer> method3(List<? super Integer> lst) {       // Integer의 부모 클래스만 사용 가능
        for (int i=0; i<5; i++) {
            lst.add(i);
        }

        return lst;
    }

}
