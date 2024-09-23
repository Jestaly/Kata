package LINKEDLIST.Linkedlist1;

public class Main {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String args[]) {
        Main main = new Main();

        main.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        main.head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println(main.head.data);
        System.out.println(main.head.next.data);

        System.out.println(second.data);
        System.out.println(second.next.data);

        System.out.println(third.data);
        System.out.println(third.next.data);

        System.out.println(fourth.data);
        System.out.println(fourth.next.data);
    }
}
