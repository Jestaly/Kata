package DOUBLY.Doubly2;

import java.time.temporal.Temporal;

public class Main {
    Node head;
    Node tail;

    Main() {
        this.head = null;
        this.tail = null;
    }

    class Node {
        Node next;
        Node prev;
        int val;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    void insertAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node tempNode = head;
        while (tempNode.prev != null) {
            tempNode = tempNode.prev;
        }
        head = tempNode.prev = newNode;
        newNode.next = tempNode;
    }

    void insertAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            return;
        }
        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tail = tempNode.next = newNode;
        newNode.prev = tempNode;
    }

    // delete node not functioning correctly
    void deleteNode(int val) {
        if (head == null) {
            return;
        }
        Node delNode = new Node(val);
        Node prevPointer = tail;

        // if (nextPointer.val == delNode.val) {
        // head = nextPointer.next;
        // return;
        // }
        // if (prevPointer.val == delNode.val) {
        // tail = prevPointer.prev;
        // return;
        // }
        // if (nextPointer.next == null || prevPointer.prev == null) {
        // head = null;
        // tail = null;
        // return;
        // }
        // while (prevPointer.prev.val != delNode.val) {
        // prevPointer = prevPointer.prev;
        // }
        // prevPointer.prev = prevPointer.prev.prev;
        Node nextPointer = head;
        while (nextPointer.next.val != delNode.val) {
            nextPointer.prev = nextPointer.next;
            nextPointer = nextPointer.next;
        }
        // nextPointer.prev.next = nextPointer.next;
        // nextPointer.next.prev = nextPointer.prev;
    }

    void displayForward() {
        if (head == null) {
            return;
        }
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.val + " <-> ");
            tempNode = tempNode.next;
        }
        System.out.println("Null");
    }

    void displayBackward() {
        if (tail == null) {
            return;
        }
        Node tempNode = tail;
        while (tempNode != null) {
            System.out.print(tempNode.val + " <-> ");
            tempNode = tempNode.prev;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.insertAtHead(0);
        main.insertAtHead(-1);
        main.insertAtHead(-2);

        main.insertAtTail(1);
        main.insertAtTail(2);
        main.insertAtTail(3);

        main.displayForward();
        main.displayBackward();
    }
}
