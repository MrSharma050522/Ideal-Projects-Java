package Char_Stacks;

/*
LL : head.
 */

import Char_Linked_List.LLNode;

public class StacksUsingLL {
    // Create a LL.
    LLNode head;
    // represents size at a given time.
    int size;

    // Insert the element in the stack.
    /*
    {1, 2}
    newNode = 1
    1.next = null
    head = 1

    newNode = 2
    2.next = 1
    2 -> 1 -> null
     */
    public void push(int el) {
        LLNode newNode = new LLNode(el);
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
    }

    // Return the topmost/ last element of the stack.
    // TC : O(1)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!!");
            return -1;
        }
        return this.head.data;
    }

    // Remove and return the topmost/ last element of the stack.
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!!");
            return -1;
        }
        int lastElement = peek();
        this.head = this.head.next;
        this.size -= 1;
        return lastElement;
    }

    // Returns the length of stack or no of elements in stack.
    // TC : 0(1)
    public int size() {

        return this.size;
    }

    // Check whether there are any elements present in stack or not?
    // TC : 0(1)
    public boolean isEmpty() {

        return (size == 0);
    }
}
