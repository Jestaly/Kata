package LINKEDLIST.LinkedList20;

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

    int length = -1;

    void add(String val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }
        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
            length++;
        }
        tempNode.next = newNode;

    }

    void display(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " -> ");
        display(node.next);
    }

    void swap(int index1, int index2) {
        Node indexNode1 = head;
        Node indexNode2 = head;

        if (index1 == index2 || index1 > length - 1 ||
                index1 < 0 || index2 > length - 1 || index2 < 0) {
            return;
        }
        if (indexNode1 == null || indexNode2 == null) {
            return;
        }

        int iCounter = 0;

        while (iCounter != index1) {
            indexNode1 = indexNode1.next;
            iCounter++;
        }
        iCounter = 0;

        while (iCounter != index2) {
            indexNode2 = indexNode2.next;
            iCounter++;
        }

        String tempStr = indexNode1.val;
        indexNode1.val = indexNode2.val;
        indexNode2.val = tempStr;
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.add("Red");
        main.add("Green");
        main.add("Black");
        main.add("Pink");
        main.add("Orange");
        main.display(main.head);
        System.out.println("Null");
        main.swap(0, 6);
        main.display(main.head);
        System.out.println("Null");

    }
}
