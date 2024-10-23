package LINKEDLIST.LinkedList8;

import java.util.*;

public class Main {
    Node head;

    Main() {
        this.head = null;
    }

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

    public void iterate(int i) {
        Node iterator = head;
        int counter = 0;
        while (iterator != null) {
            if (counter >= i) {
                System.out.println(iterator.data);
            }
            iterator = iterator.next;
            counter++;
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();

        int size = 5;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter data " + (i + 1) + ": ");
            int myData = scanner.nextInt();
            main.add(myData);
        }

        System.out.print("Enter index to start iteration: ");
        int i = scanner.nextInt();
        main.iterate(i);

        scanner.close();
    }
}
