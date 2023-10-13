package sec2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackEx1 {

    public static void main(String[] args) {

        Stack<String> st1 = new Stack<>();
        st1.push("0");
        st1.push("1");
        st1.push("2");
        st1.push("4");
        st1.push("8");

        System.out.println(st1);
        st1.pop();                      // 8 제거
        System.out.println(st1);
        st1.pop();                      // 4 제거
        System.out.println(st1);
        st1.pop();
        System.out.println(st1);
        st1.pop();
        System.out.println(st1);

    }

}
