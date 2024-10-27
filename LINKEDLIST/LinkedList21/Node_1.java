package LINKEDLIST.LinkedList21;

public class Node_1 {

    public Node_1 head;
    public Node_1 next;
    public String val;
    public Node_2 node;

    public Node_1(String val) {
        this.val = val;
        this.next = null;
    }

    public Node_2 connectTo(Node_2 node) {
        return this.node = node;
    }

    public void add(String val) {
        Node_1 newNode = new Node_1(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node_1 tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }

    public void display(Node_1 node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " -> ");
        display(node.next);
    }
}
