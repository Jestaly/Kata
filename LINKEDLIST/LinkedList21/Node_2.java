package LINKEDLIST.LinkedList21;

public class Node_2 {
    public Node_2 head;
    public Node_2 next;
    public String val;
    public Node_1 node;

    public Node_2(String val) {
        this.val = val;
        this.next = null;
    }

    public Node_1 connectTo(Node_1 node) {
        return this.node = node;
    }

    public void add(String val) {
        Node_2 newNode = new Node_2(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node_2 tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }

    public void display(Node_2 node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " -> ");
        display(node.next);
    }

}
