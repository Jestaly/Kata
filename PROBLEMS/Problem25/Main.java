package PROBLEMS.Problem25;

import java.util.*;

public class Main {
    public static int longestValidParentheses(String s) {
        StringBuilder tempStr = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        if (s.length() == 0) {
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(c);

                continue;
            }
            if (stack.peek() == '(' && c == ')') {
                tempStr.append(stack.pop()).append(c);

                continue;
            }
            stack.push(c);

        }
        int length = tempStr.length();
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                length -= 2;
            }
            stack.pop();
        }
        return length;
    }

    public static void main(String[] args) {
        String s = "(()";
        System.out.println(longestValidParentheses(s));
    }
}
