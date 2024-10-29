package QUEUES.Queue1Exp;

public class Queue {
    int size = 5;
    int sizeCounter = -1;
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

        if (sizeCounter == size) {
            System.out.println("Queue is full!");

            return;
        }
        if (head == null) {
            head = newNode;
            return;
        }
        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
        sizeCounter++;
        System.out.println(sizeCounter);

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
        if (head == null) {
            System.out.println("Null");
            return;
        }
        System.out.println(head.val);
    }

    // void
    boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    boolean isFull() {
        int counter = 0;
        Node tempNode = head;

        while (tempNode.next != null) {
            tempNode = tempNode.next;
            counter++;
        }
        if (counter < size - 1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue("Black");
        queue.enqueue("Green");
        queue.enqueue("Red");
        queue.enqueue("White");
        // queue.enqueue("Blue");

        queue.dequeue();
        // System.out.println(queue.isEmpty());
        // System.out.println(queue.isFull());

        queue.display(queue.head);
        System.out.println("Null");
    }
}
