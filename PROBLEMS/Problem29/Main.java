package PROBLEMS.Problem29;

class ListNode {
    ListNode next;
    int val;

    ListNode() {

    }

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Main {

    // l1 = [2,4,3]
    // l2 = [5,6,4]

    // result = [7,0,8]

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode tempL1 = l1;
        ListNode tempL2 = l2;

        StringBuilder tempStrL1 = new StringBuilder();

        while (tempL1 != null) {
            tempStrL1.append(tempL1.val);
            tempL1 = tempL1.next;
        }

        StringBuilder tempStrL2 = new StringBuilder();
        while (tempL2 != null) {
            tempStrL2.append(tempL2.val);
            tempL2 = tempL2.next;
        }

        long resultInteger = Long.parseLong(tempStrL1.reverse().toString())
                + Long.parseLong(tempStrL2.reverse().toString());

        StringBuilder resultReverse = new StringBuilder();
        resultReverse.append(resultInteger).reverse();
        int i = 0;
        ListNode current = new ListNode();
        while (i < Long.toString(resultInteger).length()) {
            ListNode newNode = new ListNode(
                    Integer.parseInt(Character.toString(resultReverse.charAt(i))));
            if (current == null) {
                resultNode = newNode;
                i++;
                continue;
            }

            ListNode tempNode = current;

            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
            i++;
        }
        return current.next;
    }

    public static ListNode l1;
    public static ListNode l2;
    public static ListNode resultNode;

    public static void addL1(int val) {
        ListNode newNode = new ListNode(val);
        if (l1 == null) {
            l1 = newNode;
            return;
        }
        ListNode tempNode = l1;

        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }

    public static void addL2(int val) {
        ListNode newNode = new ListNode(val);
        if (l2 == null) {
            l2 = newNode;
            return;
        }
        ListNode tempNode = l2;

        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }

    public static void printL1(ListNode l1) {
        if (l1 == null) {
            return;
        }
        System.out.print(l1.val + " -> ");
        printL1(l1.next);
    }

    public static void printL2(ListNode l2) {
        if (l2 == null) {
            return;
        }
        System.out.print(l2.val + " -> ");
        printL2(l2.next);
    }

    public static void printResult(ListNode result) {
        if (result == null) {
            return;
        }
        System.out.print(result.val + " -> ");
        printResult(result.next);
    }

    public static void main(String[] args) {
        addL1(9);
        addL1(9);
        addL1(9);
        addL1(9);
        addL1(9);
        addL1(9);
        addL1(9);

        addL2(9);
        addL2(9);
        addL2(9);
        addL2(9);

        printL1(l1);
        System.out.println("Null");
        printL2(l2);
        System.out.println("Null");

        ListNode result = addTwoNumbers(l1, l2);

        printResult(result);
        System.out.println("Null");
    }
}
