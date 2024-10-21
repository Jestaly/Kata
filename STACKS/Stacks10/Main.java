package STACKS.Stacks10;

import java.util.*;

public class Main {

    public static int[] findGreaterElement(int[] arr, Stack<Integer> stack) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    stack.push(arr[j]);
                    break;
                }
                if (j == arr.length - 1) {
                    stack.push(-1);
                }
            }
            arr[i] = stack.pop();
        }
        return arr;
    }

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = { 7, 8, 1, 4, 3, 5, 6 };
        // OUTPUT: [ 8, -1, 4, 5, 5, 6, -1 ]

        System.out.println(Arrays.toString(findGreaterElement(arr, stack)));
    }
}
