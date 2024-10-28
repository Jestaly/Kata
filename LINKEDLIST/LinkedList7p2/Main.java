package LINKEDLIST.LinkedList7p2;

import java.util.*;

public class Main {
    Node head;

    class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
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

    public void display() {
        Node displayNode = head;

        while (displayNode != null) {
            System.out.println(displayNode.data);
            displayNode = displayNode.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        Main main = new Main();

        System.out.println("Enter size: ");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.print("Enter data " + (i + 1) + ": ");
            int myData = scanner.nextInt();
            main.add(myData);
        }
        main.display();
        scanner.close();
    }
}
