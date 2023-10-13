package sec2;

import java.util.*;
import java.util.Map.*;

public class MapEx1 {

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, String> map2 = new Hashtable<>();
        Map<String, Integer> map3 = new TreeMap<>();
        // Properties는 제네릭 타입을 넣으면 안됨
        Properties map4 = new Properties();                 // 다른 맵과 구조가 완전히 다름                    


        map1.put("no", 1);
        map1.put("kor", 100);
        map1.put("eng", 70);
        map1.put("mat", 90);
        System.out.println(map1);
        System.out.println("국어점수: " + map1.get("kor"));
        if (map1.containsKey("soc")) {
            System.out.println("해당 키가 존재합니다.");
        } else {
            map1.put("soc", 100);
        }

        if (map1.containsValue(100)) {
            System.out.println("만점 과목이 있습니다.");
        } else {
            System.out.println("만점 과목 없음");
        }

        System.out.println("================== map2 ====================");

        // 해시맵(HashMap)의 순회
        for (Entry<String, Integer> eSet : map1.entrySet()) {
            System.out.println(eSet.getKey() + " : " + eSet.getValue());
        }

        System.out.println("---------------------------------------------");

        map2.put("name", "kimgitae");
        map2.put("age", "29");
        map2.put("height", "173.8");
        map2.put("weight", "72.4");
        System.out.println(map2);

        if (map2.containsKey("weight")) {           // weight 키값을 가진 데이터를 삭제하기
            map2.remove("weight");
        } else {
            System.out.println("해당 키가 존재하지 않음");
        }
        System.out.println("이름 : " + map2.get("name"));
        System.out.println("나이 : " + map2.get("age"));
        System.out.println("키 : " + map2.get("height"));

        System.out.println("--------------------------------------------------");
        // 해시테이블(HashTable)의 순회
        for (Entry<String, String> eSet : map2.entrySet()) {
            System.out.println(eSet.getKey() + " : " + eSet.getValue());
        }

        System.out.println("================== map3 ====================");

        map3.put("no", 1);
        map3.put("age", 29);
        map3.put("height", 173);
        map3.put("weight", 72);
        System.out.println(map3);

        if (map2.containsKey("weight")) {           // weight 키값을 가진 데이터를 삭제하기
            map2.remove("weight");
        } else {
            System.out.println("해당 키가 존재하지 않음");
        }
        System.out.println("이름 : " + map3.get("no"));

        System.out.println("--------------------------------------------------");
        // 트리맵(TreeMap)의 순회
        for (Entry<String, Integer> eSet : map3.entrySet()) {
            System.out.println(eSet.getKey() + " : " + eSet.getValue());
        }
        // .push() 아니고 .setProperty()로 추가
        map4.setProperty("margin","40px");                     // 제네릭이 안 되어 있으면 무조건 String, 그치만 property는 제네릭 사용X
        map4.setProperty("padding", "30px");
        map4.setProperty("width", "1200px");
        map4.setProperty("height", "50px");
        System.out.println("폭 : " + map4.getProperty("width"));

        

        
    }

}
