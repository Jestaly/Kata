package LINKEDLIST.LinkedList15;

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

    String getFirst() {
        if (head == null) {
            System.out.println("head has no value.");
        }
        return head.data;
    }

    String getLast() {
        Node tempNode = head;
        if (tempNode == null) {
            return "Null";
        } else {
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            return tempNode.data;
        }
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

        String firstElement = main.getFirst();
        String lastElement = main.getLast();

        System.out.println("The first element: " + firstElement);
        System.out.println("The last element: " + lastElement);

    }
}
