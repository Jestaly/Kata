package LINKEDLIST.LinkedList2;

import LINKEDLIST.LinkedList2.SinglyLinkedList.ListNode;

public class Main {
    public static void main(String args[]) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.head = sll.new ListNode(10);
        ListNode second = sll.new ListNode(20);
        ListNode third = sll.new ListNode(30);
        ListNode fourth = sll.new ListNode(40);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.current = sll.head;
        while (sll.current != null) {
            System.out.println(sll.current.data);
            sll.current = sll.current.next;
        }
        System.out.println("null");
    }
}
