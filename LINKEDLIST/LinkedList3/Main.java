package LINKEDLIST.LinkedList3;

import LINKEDLIST.LinkedList3.SinglyLinkedList.ListNode;;

public class Main {
    public static void main(String args[]) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = sll.new ListNode(10);
        ListNode second = sll.new ListNode(20);
        ListNode third = sll.new ListNode(30);
        ListNode fourth = sll.new ListNode(40);
        ListNode fifth = sll.new ListNode(50);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

    }
}
