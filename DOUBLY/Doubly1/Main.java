package DOUBLY.Doubly1;

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
        String val;

        Node(String val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    void add(String val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
        newNode.prev = tempNode;
        tail = newNode;
        System.out.println(tempNode.next.val);

    }

    void display(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(" <-> " + node.val);
        display(node.prev);
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.add("Green");
        System.out.println(main.head.val);
        main.add("Black");
        main.add("Orange");
        main.add("Blue");
        main.add("White");

        System.out.print("Null");
        main.display(main.tail);
        System.out.print(" <-> Null");

    }
}
