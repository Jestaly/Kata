package STACKS.Stacks1;

public class Main {
    public static void main(String args[]) {

        Stack stack = new Stack(5);

        stack.push(20);
        stack.push(204);
        stack.push(203);
        stack.push(212);
        stack.push(21);
        stack.pop();
        stack.pop();
        stack.peek();

        System.out.println(stack.isEmpty());
        // Write a Java program to implement a stack with push and pop operations. Find
        // the top element of the stack and check if it is empty or not.
    }
}
