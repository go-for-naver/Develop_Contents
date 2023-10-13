package sec1;

// 쓰레드(Thread) : 하나의 작업(Task) 또는 하나의 실행 프로그램(Process)
// Multi Thread : 여러 개의 쓰레드를 동시에 진행 또는 실행할 수 있도록 한 실행 환경
// Op-code(명령어코드) | Operand(데이터가 있는 주소) => Stack(스택)에 보관되어 처리
// 여러 일을 처리하려면 일의 순서를 정해야 함 -> 스케줄링

// 일반적인 프로세스의 예
// 생성(Create) -> 실행 대기(Wait) -> 실행(Run) -> 선점대기(Blocking) -> 재실행(WakeUp) -> 종료(Complete)

public class Thread1 {

    public static void main(String[] args) {

        int[] arr = {95, 60, 85, 70, 90, 80};
        String[] str = {"김기태", "이슬비", "박나연", "박진권", "오태훈", "신승원"};

        for (int i=0; i<arr.length; i++) {
            System.out.println("이름 : " + str[i]);           // 전체 Single Thread는 6개
            try {
                Thread.sleep(500);                      // 대기시간 부여 (0.5초씩 딜레이 발생)
                // 대기시간 부여하고, 지정한 밀리초만큼 Wait되며, 그 시간이 지나면 자동으로 Wake Up된다.
            } catch (InterruptedException e) {                // Thread를 작성했다면 InterruptedException 예외 처리가 필요함
                throw new RuntimeException(e);
            }
        }

    }

}
