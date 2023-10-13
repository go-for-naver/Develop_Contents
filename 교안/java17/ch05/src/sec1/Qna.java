package sec1;

public class Qna extends Board {

    public static final String DUMMY = "테스트글제목";            // 상수 (공유 데이터)
    private int level;                                          // 0: 문의글, 1: 답글, 2: 답글에 대한 질문, 3: 답글에 대한 질문에 대한 답글 => 계층형 게시판
    private int parno;

    public Qna() { super(); }
    public Qna(int no) {
        super(1);
    }

    @Override
    public void method2() {
        System.out.println("여기는 QnA입니다.");
    }

}
