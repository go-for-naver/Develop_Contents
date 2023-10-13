package sec1;

// Thread 클래스를 상속받아서 사용자 Thread 만들기
class SMThread extends Thread {
    // synchronized: 동기화 블록 (병행 수행 가능)
    @Override
    public synchronized void start() {                  // Thread의 생성 후 자동 실행
        this.method1();                                 // 동기화 블록에 기재된 쓰레드들은 병행 수행됨
        super.start();                                  // 부모 클래스인 Thread의 start를 호출하므로 굳이 Override 하지 않아도 됨
    }

    @Override
    public void run() {                                 // Thread로 실행할 내용을 기술
        int[] arr = {95, 60, 85, 70, 90, 80};

        for (int i=0; i<arr.length; i++) {
            System.out.println("점수 : " + arr[i]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void method1() {
        for (int i=1; i<7; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Thread2 {

    public static void main(String[] args) {

        Thread th1 = new SMThread();
        th1.start();                    // 쓰레드 생성 후 자동 실행

    }

}
