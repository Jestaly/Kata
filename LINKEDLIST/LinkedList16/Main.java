package LINKEDLIST.LinkedList16;

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

    void displayElements() {
        Node countNode = head;
        int index = 0;
        while (countNode != null) {
            System.out.println("Element at index " + index + ": " + countNode.val);
            countNode = countNode.next;
            index++;
        }
        // Node tempNode = head;
        // for (int i = 0; i < count + 1; i++) {
        // System.out.println("Element at index " + i + ": " + tempNode.val);
        // tempNode = tempNode.next;
        // }
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

        main.displayElements();

    }
}
