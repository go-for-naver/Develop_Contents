package sec2;

public class Throws1 {

    // 모든 예외처리는 try-catch-finally 또는 throws를 반드시 써야 함
    public static void main(String[] args) throws Exception {                       // 아래의 메서드에서 throws하지 않은 Exception이 나온다면 Exception이 처리

        String name = null;
        nullCheck(name);

        int[] arr = new int[4];
        otherCheck(arr);

        String data = "123yeeun";
        otherCheck(data);

    }

    public static void nullCheck(String a) throws NullPointerException {            // throws 구절은 method에 씀
        // 예외 상황이 되었을 경우, NullPointerException이 처리하도록 강제로 예외 떠넘김
        System.out.println(a);
    }

    public static void otherCheck(int[] a) throws ArrayIndexOutOfBoundsException {
        System.out.println(a[5]);
    }

    public static void otherCheck(String a) throws NullPointerException {           // 가급적이면 throws문은 자세하게 적어주기 (throws Exception 사용 자제) => 어떤 예외인지 분간이 안 가기 때문에
        int data = Integer.parseInt(a);
    }

}
