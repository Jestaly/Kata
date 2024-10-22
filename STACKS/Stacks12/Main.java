package STACKS.Stacks12;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Stack<String> stack = new Stack<>();
        String str = "A+(B/C-D)*E";
        String strTemp = "";

        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == '*' || str.charAt(i) == '/' ||
                    str.charAt(i) == '+' || str.charAt(i) == '-')) {
                strTemp += str.charAt(i);
            } else {
                if (stack.isEmpty()) {
                    stack.push(Character.toString(str.charAt(i)));
                    continue;
                }

                if (!(str.charAt(i - 1) == '*' || str.charAt(i - 1) == '/' ||
                        str.charAt(i - 1) == '+' || str.charAt(i - 1) == '-')) {

                }
            }
        }
    }
}
