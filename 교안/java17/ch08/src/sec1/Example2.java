package sec1;

public class Example2 {

    public static void main(String[] args) {

        String num = "1004가나다";
        int parNo;

        try {
            parNo = Integer.parseInt(num);
        } catch(NumberFormatException e) {
            e.printStackTrace();
        } catch(Exception e) {
            System.out.println("원인 불명 예외");
            e.printStackTrace();
        }

    }

}
