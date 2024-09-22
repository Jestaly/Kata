package STACKS.Stacks1;

import java.util.*;

public class Stack {

    // Write a Java program to implement a stack with push and pop operations. Find
    // the top element of the stack and check if it is empty or not.

    private int[] stackArray;
    private int counter = 0;
    private int size;

    public Stack(int size) {
        stackArray = new int[size];
        this.size = size;
    }

    public void push(int n) {

        if (counter == size) {
            System.out.println("Stack is full.");
        } else {
            stackArray[counter] = n;
            counter++;
        }

    }

    public void pop() {
        stackArray[counter - 1] = 0;
        counter--;
    }

    public void peek() {
        System.out.println(Arrays.toString(stackArray));

        if (counter == 0) {
            System.out.println(stackArray[counter]);
        } else {
            System.out.println(stackArray[counter - 1]);
        }
    }

    public boolean isEmpty() {
        if (counter == 0) {
            return true;
        }
        return false;
    }
}
