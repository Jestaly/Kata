package LINKEDLIST.LinkedList6;

public class Main {
    private Node head;

    public static class Node {
        private Node next;
        private int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String args[]) {
        Main main = new Main();

        main.head = new Node(1);
        main.head.next = new Node(2);
        main.head.next.next = new Node(3);
        main.head.next.next.next = new Node(4);
        System.out.println(main.head.data);
        System.out.println(main.head.next.data);
        System.out.println(main.head.next.next.data);
        System.out.println(main.head.next.next.next);

    }
}
