package STACKS.Stacks1;

import java.util.Stack;

public class Main {
    public static void main(String args[]) {
        // Write a Java program to implement a stack with push and pop operations. Find
        // the top element of the stack and check if it is empty or not.

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(34);
        stack.push(22);
        stack.push(512);
        stack.push(100);
        stack.push(2);

        while (stack.peek() <= 100) {

            stack.pop();
        }
        System.out.println(stack.peek());
    }
}
