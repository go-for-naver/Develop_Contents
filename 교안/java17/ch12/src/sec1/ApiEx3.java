package sec1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ApiEx3 {

    public static void main(String[] args) {

        // Math.random() : 0 ~ 1의 실수
        int su = (int) (Math.random() * 44 + 1);        // 1 ~ 45 중 랜덤한 숫자를 변수 su에 대입
        System.out.println("임의의 수 : " + su);
        
        // 로또 추첨기 (나)
        System.out.println("\n로또 번호 : ");
        Set<Integer> lotto = new HashSet<>();
        while (true) {
            lotto.add((int) (Math.random() * 44 + 1));
            if(lotto.size() == 6) {
                break;
            }
        }
        Integer[] gen1 = lotto.toArray(new Integer[6]);
        Arrays.sort(gen1);
        System.out.println(Arrays.toString(gen1));


        // 로또 추첨기 (2)
        Integer[] lotto2 = new Integer[6];
        for(int i=0; i<6; i++) {
            lotto2[i] = (int) (Math.random() * 44 + 1);
        }
        
        // 중복성 해결을 위하여 배열을 Set으로 변환
        Set<Integer> gen = new HashSet<>(Arrays.asList(lotto2));
        
        // 중복된 번호가 있으면, 개수가 6개 미만이므로 6개 미만인 경우 중복 없이 요소가 6개가 될 때까지 반복
        while(gen.size() < 6) {
            gen.add((int) (Math.random() * 44 + 1));
        }
        lotto2 = gen.toArray(new Integer[6]);
        // Arrays.sort(lotto, Collections.reverseOrder());      => 내림차순 정렬하기
        Arrays.sort(lotto2);
        System.out.println("\n로또 번호 2 : ");
        System.out.println(Arrays.toString(lotto2));
        
    }

}