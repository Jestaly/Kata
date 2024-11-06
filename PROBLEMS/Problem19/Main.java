package PROBLEMS.Problem19;

public class Main {

    ListNode head;

    Main() {
        this.head = null;
    }

    class ListNode {
        ListNode next;
        int val;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    ListNode deleteDuplicates(ListNode head) {
        ListNode tempNode = head;
        if (tempNode.val == tempNode.next.val) {
            System.out.println("executed");
            tempNode = tempNode.next;
        }
        while (tempNode.next != null) {
            tempNode = tempNode.next;
            if (tempNode.val == tempNode.next.val) {

                ListNode deleteNode = tempNode.next;
                tempNode.next = deleteNode.next;
            }
        }
        return null;
    }

    void display(ListNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " -> ");
        display(node.next);
    }

    void add(int val) {
        if (head == null) {
            head = new ListNode(val);
            return;
        }
        ListNode tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = new ListNode(val);
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.add(1);
        main.add(1);
        main.add(2);
        main.add(3);
        main.add(3);

        System.out.println(main.deleteDuplicates(main.head));
        main.display(main.head);
        System.out.println("Null");

    }
}
