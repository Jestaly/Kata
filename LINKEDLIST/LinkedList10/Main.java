package LINKEDLIST.LinkedList10;

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

    void printList(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        printList(node.next);
    }

    void insert(int index, int data) {
        Node newNode = new Node(data);
        Node curr = head;
        int count = 0;
        while (count != index - 1) {
            curr = curr.next;
            count++;
        }
        Node prev = curr;
        while (curr.next != null) {
            prev = curr.next;
            curr.next = newNode;
            newNode = prev;
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public static void main(String args[]) {
        Main main = new Main();

        main.add(1);
        main.add(2);
        main.add(3);
        main.add(4);
        main.add(5);
        main.add(5);
        main.add(5);
        main.add(5);
        main.add(5);
        main.add(5);
        main.add(5);
        main.add(5);
        main.add(5);
        main.add(5);
        main.add(5);
        main.add(5);

        main.insert(9, 100);
        main.insert(10, 99);

        main.printList(main.head);
    }
}
