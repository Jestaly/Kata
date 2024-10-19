package STACKS.Stacks9;

import java.util.*;

import STACKS.Stacks6.Operators;

public class Main {
    public static void main(String args[]) {
        Stack<Character> stackLet = new Stack<>();
        // STACK IMPLEMENTATION
        // INFIX: A / B * C + D * E
        // POSTFIX: AB/C*DE*+
        String str = "AB/C*DE*+";
        String strTemp = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == '*' || str.charAt(i) == '/' ||
                    str.charAt(i) == '+' || str.charAt(i) == '-')) {

                stackLet.push(str.charAt(i));
                System.out.println(stackLet.peek());
            }
            if (str.charAt(i) == '*' || str.charAt(i) == '/' ||
                    str.charAt(i) == '+' || str.charAt(i) == '-') {
                for (int j = 0; j < 3; j++) {
                    // operator = str.charAt(i);
                    strTemp += stackLet.pop();

                }
            }
        }
        str = strTemp;
        System.out.println(str);
    }
}
