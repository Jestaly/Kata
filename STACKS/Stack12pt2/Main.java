package STACKS.Stack12pt2;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Stack<Character> stack = new Stack<>();

        String str = "A+B*C";
        String strTemp = "";
        char opTemp = ' ';
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
                    opTemp = str.charAt(i);
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
                    opTemp = str.charAt(i);
                    stack.push(str.charAt(i));
                    continue;
                }
                if ((str.charAt(i) == '+' || str.charAt(i) == '-') &&
                        (stack.peek() == '*' || stack.peek() == '/')) {
                    opTemp = str.charAt(i);
                    strTemp += stack.pop();
                    stack.push(str.charAt(i));
                    continue;
                }
            }
        }
        while (!stack.isEmpty()) {
            strTemp += stack.pop();
        }
        System.out.println(strTemp);
    }
}
