package sec1;

public class Example3 {
    
    // 원소 추가 함수
    public static String[] add(String[] originArr, String txt) {

        String[] newArr = new String[originArr.length + 1];                 // 새로운 배열은 원래 배열의 데이터에서 하나 더 증가

        for (int i=0; i<originArr.length; i++) {                            // 원래 배열 데이터를 새로운 배열에 전달하여 복제
            newArr[i] = originArr[i];
        }
        newArr[originArr.length] = txt;                                     // 추가되는 원소를 txt 변수로 입력받아 새로운 원소로 추가
        return newArr;

    }

    public static String[] remove(String[] originArr) {

        String[] newArr = new String[originArr.length - 1];                 // 새로운 배열은 원래 배열의 데이터에서 하나 더 증가

        for (int i=0; i<originArr.length-1; i++) {                          // 원래 배열 데이터를 새로운 배열에 전달하여 복제
            newArr[i] = originArr[i];
        }
        return newArr;

    }

    public static void main(String[] args) {

        // 원소 추가 요청
        String[] originArr = {"김기태", "박나연", "김이호", "오태훈", "서광"};
        originArr = new String[]{"가나다", "라마바", "사아자", "카타파"};       // 값의 재초기화를 한꺼번에 할 수 있으나 새롭게 추가는 되지 않음
        originArr = add(originArr, "한선");                             // 함수를 호출할 때 원래 배열과 추가 데이터를 같이 대입
        originArr = add(originArr, "이슬비");

        for (String s : originArr) {
            System.out.println(s);
        }

        originArr = remove(originArr);

        System.out.println("=====================");
        for (String s : originArr) {
            System.out.println(s);
        }

    }

}
