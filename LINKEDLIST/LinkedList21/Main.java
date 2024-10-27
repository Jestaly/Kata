package LINKEDLIST.LinkedList21;

public class Main {

    public static Node_1 node1 = new Node_1(null);
    public static Node_2 node2 = new Node_2(null);

    void link() {

        Node_1 tempNode = node1.head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        Node_2 headNode = node2.head;
        node1.connectTo(headNode);
    }

    public static void main(String[] args) {
        Main main = new Main();
        node1.add("Black");
        node1.add("Green");
        node1.add("Orange");
        node1.display(node1.head);
        System.out.println("Null");
        node2.add("Purple");
        node2.add("Pink");
        node2.add("Red");
        main.link();
        node2.display(node2.head);
        System.out.println("Null");

    }
}
