package STACKS.Stacks9;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Stack<String> stackLet = new Stack<>();
        // STACK IMPLEMENTATION
        // INFIX: A / B * C + D * E
        // POSTFIX: AB/C*DE*+
        String str = "AB/C*DE*+";
        String charTemp;
        String strTemp = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == '*' || str.charAt(i) == '/' ||
                    str.charAt(i) == '+' || str.charAt(i) == '-')) {
                stackLet.push(Character.toString(str.charAt(i)));
            } else {
                charTemp = stackLet.pop();
                strTemp = "(" + stackLet.pop() + str.charAt(i) + charTemp + ")";
                if (i != str.length() - 1) {
                    stackLet.push(strTemp);
                }
            }
        }
        str = strTemp;
        System.out.println(str);
    }
}
