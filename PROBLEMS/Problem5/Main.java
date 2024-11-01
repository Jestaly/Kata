package PROBLEMS.Problem5;

import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Main {

    public static ListNode meregeTwoLists(ListNode list1, ListNode list2) {
        ListNode tempNode1 = list1;
        ListNode tempNode2 = list2;
        ListNode mergeNode = new ListNode();

        if (list1 == null && list2 == null) {
            return null;
        }
        // Input: list1 = [1,2,4], list2 = [1,3,4]
        // Output: [1,1,2,3,4,4]

        if (tempNode1.val <= tempNode2.val) {
            mergeNode = tempNode1;
            mergeNode.next = tempNode2;
            while (mergeNode.next != null) {
                if (mergeNode.next.val <= tempNode1.next.val) {
                    mergeNode = mergeNode.next;
                    mergeNode.next = tempNode1.next;
                }
            }
        } else {
            mergeNode = tempNode2;
        }

        return tempNode1;
    }

    public static void main(String[] args) {
        ListNode node3 = new ListNode(4);
        ListNode node2 = new ListNode(2, node3);
        ListNode list1 = new ListNode(1, node2);

        ListNode node3_ = new ListNode(4);
        ListNode node2_ = new ListNode(2, node3_);
        ListNode list2 = new ListNode(1, node2_);

        meregeTwoLists(list1, list2);

    }
}
