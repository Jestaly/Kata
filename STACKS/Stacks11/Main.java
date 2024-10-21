package STACKS.Stacks11;

import java.util.*;

public class Main {

    public static void sort(Stack<Integer> inpuStack, int size) {
        Stack<Integer> procStack = new Stack<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

            }
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> inputStack = new Stack<>();

        System.out.print("Enter size: ");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.print("Input number " + (i + 1) + ": ");
            int num = scanner.nextInt();

            inputStack.push(num);
        }

        sort(inputStack, size);

        scanner.close();

    }
}
