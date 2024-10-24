package LINKEDLIST.LinkedList13;

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

    void offerLast(String data) {
        if (head == null) {
            System.out.println("You don't have a current chain.");
            return;
        }
        Node newNode = new Node(data);
        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }

    public static void main(String args[]) {
        Main main = new Main();

        main.add("Red");
        main.add("Green");
        main.add("Black");

        main.offerLast("Pink");
        main.offerLast("White");

        main.display(main.head);
        System.out.print("Null");

    }
}
