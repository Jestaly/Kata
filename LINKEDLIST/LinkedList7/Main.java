package LINKEDLIST.LinkedList7;

import java.util.*;

class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    Node head;

    public Main() {
        this.head = null;
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
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        Node tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        Main main = new Main();

        System.out.print("Enter a size of data: ");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.print("Enter data #" + (i + 1) + ": ");
            int myData = scanner.nextInt();

            main.add(myData);
        }
        main.display();
        scanner.close();
    }
}
