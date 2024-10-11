package STACKS.Stacks8;

public class Stack {
    private ListNode top;
    private int length;

    private class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public Stack() {
        top = null;
        length = 0;
    }

    public void push(int data) {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public int peek() {
        if (isEmpty()) {
            return 0;
        }
        return top.data;
    }

    public static void main(String args[]) {
        Stack stack = new Stack();
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
