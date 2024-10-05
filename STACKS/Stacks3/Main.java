package STACKS.Stacks3;

import java.util.Stack;

public class Main {
    public static void main(String args[]) {
        String str = "hello";
        String strRev = "";
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            strRev += stack.pop();
        }
        str = strRev;
        System.out.println(str);
    }
}
