package sec2;

// 제네릭의 제한 =>        <T extends 제한클래스>
// 제한 클래스의 서브(이하) 클래스만 생성이 허용됨
public class MultiEx3 {

    public static void main(String[] args) {

//        Child<Parent> c1 = new Child<Parent>();             => My 이하로만 제약 범위를 잡아놨는데 Parent를 넣었기 때문에 오류
//        Child<Child> c3 = new Child<>();                    => 자기 자신은 만들 수없음
        Child<My> c2 = new Child<>();                         // 1.7 이상부터 new Child<>() 가능
        Child<Season> c3 = new Child<>();

    }

}
