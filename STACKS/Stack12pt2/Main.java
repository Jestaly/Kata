package STACKS.Stack12pt2;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Stack<Character> stack = new Stack<>();
        // INFIX TO POSTFIX
        String str = "A+B*C-D";
        String strTemp = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == '*' || str.charAt(i) == '/' ||
                    str.charAt(i) == '+' || str.charAt(i) == '-' ||
                    str.charAt(i) == '(' || str.charAt(i) == ')')) {
                strTemp += str.charAt(i);
                continue;
            }
            if (str.charAt(i) == '*' || str.charAt(i) == '/' ||
                    str.charAt(i) == '+' || str.charAt(i) == '-' ||
                    str.charAt(i) == '(' || str.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    stack.push(str.charAt(i));
                    continue;
                }
                if (stack.peek() == '(') {
                    stack.push(str.charAt(i));
                    continue;
                }
                if (str.charAt(i) == '(') {
                    stack.push(str.charAt(i));
                    continue;
                }
                if (str.charAt(i) == ')') {
                    while (stack.peek() != '(') {
                        strTemp += stack.pop();
                    }
                    stack.pop();
                    continue;
                }
                if (str.charAt(i) == stack.peek()) {
                    strTemp += stack.pop();
                    stack.push(str.charAt(i));
                    continue;
                }
                if ((str.charAt(i) == '*' || str.charAt(i) == '/') &&
                        (stack.peek() == '+' || stack.peek() == '-')) {
                    stack.push(str.charAt(i));
                    continue;
                }
                if ((str.charAt(i) == '+' || str.charAt(i) == '-') &&
                        (stack.peek() == '*' || stack.peek() == '/')) {
                    strTemp += stack.pop();
                    stack.push(str.charAt(i));
                    continue;
                }
            }
        }
        while (!stack.isEmpty()) {
            strTemp += stack.pop();
        }
        str = strTemp;
        System.out.println(str);
    }
}
