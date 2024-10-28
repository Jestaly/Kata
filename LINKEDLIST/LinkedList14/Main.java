package LINKEDLIST.LinkedList14;

import java.util.*;

public class Main {
    Node head;

    Main() {
        this.head = null;
    }

    class Node {
        Node next;
        String data;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    void add(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
    }

    void display(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " -> ");
        display(node.next);
    }

    void addAll(int index, Stack<String> stack) {
        int counter = 0;
        Node tempNode = head;

        while (counter != index - 1) {
            tempNode = tempNode.next;
            counter++;
        }
        Node newNode;
        while (!stack.isEmpty()) {
            newNode = new Node(stack.pop());
            newNode.next = tempNode.next;
            tempNode.next = newNode;
        }
    }

    public static void main(String args[]) {

        Stack<String> stack = new Stack<>();
        Main main = new Main();

        main.add("Red");
        main.add("Green");
        main.add("Black");

        stack.push("White");
        stack.push("Pink");
        stack.push("Yellow");

        main.addAll(1, stack);

        main.display(main.head);
        System.out.println("Null");
    }
}
