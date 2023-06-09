package Char_queues;

import Char_Linked_List.LLNode;

/*
H/w : Implement queue using arrays.
Queues :
1. Data structure where we store elements
2. FIFO principle : First in First out.
3. Dynamic in nature.

el : {1, 2, 3, 4, 5}
remove : stack : 5
        queue : 1

Operations :
1. insert element - add(el)
2. remove element : poll() -> remove the first element added.
3. top element : peek() -> returns the first element inserted.
4. size -> no of elements in the queue.
5. isEmpty() -> size == 0

Queue can implemented using:
1. Arrays
2. Linked list.
 */
public class QueueUsingLL {
    LLNode head;
    LLNode tail;
    int size;

    /*
    elements : {1, 2, 3}
    1 -> 2 -> 3
     */
    public void add(int el) {
        LLNode newNode = new LLNode(el);
        if (this.head == null) {
            this.head = newNode;
        } else {
            this.tail.next = newNode;
        }
        this.tail = newNode;
        this.size++;
    }

    public int poll() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!");
            return -1;
        }
        int toBeReturn = peek();
        this.head = this.head.next;
        this.size--;
        return toBeReturn;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!");
            return -1;
        }
        return this.head.data;
    }

    public int size() {
        return this.size;
    }


    public boolean isEmpty() {
        return this.size == 0;
    }
}
