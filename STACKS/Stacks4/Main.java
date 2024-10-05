package STACKS.Stacks4;

import java.util.Stack;

public class Main {
    public static void main(String args[]) {
        Stack<Character> stack = new Stack<Character>();
        String str = "({[]})";
        boolean isBalance = false;
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
            if (str.charAt(i)) {

            }
        }
    }
}
