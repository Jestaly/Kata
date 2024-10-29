package QUEUES.Queue1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Green");
        queue.add("Black");
        queue.add("Blue");
        queue.add("Yellow");

        queue.remove();
        queue.add("White");
        queue.remove();
        System.out.println(queue);

        Stack<String> stack = new Stack<>();

        stack.add("Green");
        stack.add("Black");
        stack.add("Blue");
        stack.add("Yellow");

        stack.pop();
        stack.add("White");
        stack.pop();
        System.out.println(stack);
    }
}
