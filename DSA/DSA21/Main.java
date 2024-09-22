package DSA.DSA21;

import java.util.Stack;

public class Main {
    public static void main(String args[]) {
        Stack<String> stack = new Stack<String>();

        stack.push("Valorant");
        stack.push("Minecraft");

        while (stack.peek() != "Valorant") {
            stack.pop();
        }
        System.out.println(stack.peek());

    }
}
