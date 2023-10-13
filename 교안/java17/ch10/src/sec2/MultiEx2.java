package sec2;

public class MultiEx2 {

    public static void main(String[] args) {

        Multi2 m1 = new Multi2<String, Integer>("student", 20);
        Multi2 m2 = new Multi2<String, Integer>("teacher", 24);
        Multi2 m3 = new Multi2<String, Integer>("student", 20);
        boolean res1 = m1.compare(m1, m2);
        boolean res2 = m1.compare(m1, m3);
        System.out.println("비교결과1 : " + res1);
        System.out.println("비교결과2 : " + res2);

    }

}
