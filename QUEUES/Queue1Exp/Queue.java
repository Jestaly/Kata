package QUEUES.Queue1Exp;

public class Queue {
    Node head;

    Queue() {
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

    void enqueue(String val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }
        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }

    void dequeue() {
        Node tempNode = head;
        if (tempNode == null) {
            return;
        }
        head = tempNode.next;
    }

    void display(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " -> ");
        display(node.next);
    }

    void peek() {
        System.out.println(head.val);
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue("Black");
        queue.enqueue("Green");
        queue.enqueue("Red");
        queue.enqueue("White");

        queue.dequeue();
        // queue.dequeue();
        // queue.dequeue();

        queue.peek();

        queue.display(queue.head);

        System.out.println("Null");

    }
}
