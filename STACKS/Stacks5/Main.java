package STACKS.Stacks5;

import java.util.Stack;

public class Main {
    public static void main(String args[]) {

        Stack<String> stack = new Stack<String>();

        String str = "ABCD*+/E*F-";
        String tempStr;
        String[] operators = { "+", "-", "*", "/" };

        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j < operators.length; j++) {

                if (Character.toString(str.charAt(i)) == operators[j]) {
                }
            }
            stack.push(Character.toString(str.charAt(i)));
        }
    }
}
