package STACKS.Stacks7;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        // Write a Java program to sort the elements of a given stack in ascending
        // order.
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();

        System.out.println("Enter stack size: ");
        int size = in.nextInt();

        stack.setSize(size);
        int capacity = stack.size();

        for (int i = 0; i < capacity; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = in.nextInt();
            stack.push(num);
        }
        int popTemp = 0;
        int peekTemp = 0;
        for (int i = 0; i < capacity; i++) {
            popTemp = stack.pop();
            for (int j = 0; j < capacity; j++) {
                if (popTemp > stack.peek()) {
                    peekTemp = stack.peek();
                    peekTemp = popTemp;
                }
            }
        }

        for (int i = 0; i < capacity; i++) {
            System.out.println(stack.pop());
        }

        in.close();
    }
}
