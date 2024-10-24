package LINKEDLIST.LinkedList9;

public class Main {
    Node head;

    class Node {
        Node next;
        Node prev;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void printList(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        printList(node.next);
    }

    void printReverse(Node node) {
        if (node == null) {
            return;
        }

        printReverse(node.next);
        System.out.println(node.data);
    }

    void add(int data) {
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

    public static void main(String args[]) {
        Main main = new Main();

        main.add(1);
        main.add(2);
        main.add(3);
        main.add(4);
        main.add(5);

        main.printReverse(main.head);
    }

}
