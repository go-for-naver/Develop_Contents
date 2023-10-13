package sec2;

import java.util.*;

// Set은 중복을 허용하지 않는 곳에서 사용
// 예) 로또번호 추첨기
public class SetEx1 {

    public static void main(String[] args) {

        Set set1 = new HashSet();
        set1 = new TreeSet();

        System.out.println("============ Set 결과 =============");

        // 순서 유지X, 데이터 중복X (인덱스 없음) => 집합
        Set<String> set2 = new HashSet<>();
        set2.add("글자글자");
        set2.add("가나다");
        set2.add("단어");
        set2.add("가나다");
        set2.add("사아자");
        set2.add("사아자");

        // Set은 순번이 없기 때문에 for문 사용X
        // 따라서 Iterator로 바꾼 후 while문 사용
        Iterator it = set2.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("============ List 결과 =============");

        // 순서 유지O, 데이터 중복O
        List<String> ls2 = new ArrayList<>();
        ls2.add("글자글자");
        ls2.add("가나다");
        ls2.add("단어");
        ls2.add("가나다");
        ls2.add("사아자");
        ls2.add("사아자");

        for (String s : ls2) {
            System.out.println(s);
        }

    }

}
