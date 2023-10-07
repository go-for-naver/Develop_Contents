package sec2;

public class Exam05 {
    public static void main(String[] args) {
        //제어문(Real Command)
        int su = 85;
        //if(조건식) 참일때값
        if(su>=60) System.out.println("축하축하");
        //if~else if~else~
        //if(조건식1) {
        //  조건식1이 만족할 때의 실행할 문장
        //} else if(조건식2) {
        //  조건식2이 만족할 때의 실행할 문장
        // } else {
        //  조건식1과 조건식2이 모두 불만족할 때의 실행할 문장
        // }
        if(su>=80){
            System.out.println("합격");
        } else if(su>=60) {
            System.out.println("재평가");
        } else {
            System.out.println("탈락");
        }
        //반복실행문
        //for(초기값부여식;조건식;증감식) { 반복할문장 }
        for(int i=0;i<10;i++){ //i=0~9
            System.out.println(i); //10회 실행
        }
        //while(조건식) { 반복실행문장; }
        boolean run = true;
        int k = 0;
        while(run){
            k++;
            if(k%3==0) continue;  //3의 배수 건너뜀
            if(k%27==0) {
                run = false;
                //break;
            }
            System.out.println(k);
        }
    }
}
