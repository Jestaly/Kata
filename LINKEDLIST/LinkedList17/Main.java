package LINKEDLIST.LinkedList17;

public class Main {
    Node head;

    Main() {
        this.head = null;
    }

    class Node {
        Node next;
        String val;

        Node(String val) {
            this.val = val;
            this.next = null;
        }
    }

    void add(String val) {
        Node newNode = new Node(val);
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
        System.out.print(node.val + " -> ");
        display(node.next);
    }

    void remove(int index) {
        Node tempNode = head;
        int count = 0;
        if (index == 0) {
            head = tempNode.next;
            return;
        }
        while (count != index - 1) {
            tempNode = tempNode.next;
            count++;
        }
        if (tempNode.next == null) {
            return;
        }
        tempNode.next = tempNode.next.next;
    }

    public static void main(String args[]) {
        Main main = new Main();

        main.add("Red");
        main.add("Green");
        main.add("Black");
        main.add("Pink");
        main.add("Orange");

        main.display(main.head);
        System.out.println("Null");

        main.remove(2);

        main.display(main.head);
        System.out.println("Null");

    }
}
