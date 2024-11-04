package PROBLEMS.Problem4;

import java.util.Stack;

public class Main {
    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            try {
                if (s.charAt(i) == ')' && stack.peek() == '(') {
                    stack.pop();
                    continue;
                } else if (s.charAt(i) == ']' && stack.peek() == '[') {
                    stack.pop();
                    continue;
                } else if (s.charAt(i) == '}' && stack.peek() == '{') {
                    stack.pop();
                    continue;
                }
                stack.push(s.charAt(i));
            } catch (Exception e) {
                return false;
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = ")";
        System.out.println(isValid(s));
    }
}
