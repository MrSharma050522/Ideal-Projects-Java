package Char_Linked_List;
/*
null <- 1 <-> 2 <-> 3 <-> 4 <-> 5 <-> 6 <-> 7 -> null
single linked list : data, address of next node.
doubly linked list : data, address of next node, address of prev node.
 */

import java.util.Scanner;

public class DoublyLLUtils {
    public static void main(String[] args) {
        DoublyLLNode head = takeInput();
        print(head);
    }

    /*
    input : 1 2 3 4 5 6 -1
    head = null, tail = null

    Fir iter : el = 1
    newNode = 1
    head == null , head = newNode; head = 1
    newNode.prev = tail
    tail = newNode // tail = 1
    null <- 1

    Sec iter : el = 2
    newNode = 2
    head = 1, tail = 1, newNode = 2
    tail.next = newNode
    newNode.prev = tail
    tail = newNode // tail = 2
    null <- 1 <-> 2

    head = 1, tail = 2 , LL : null <- 1 <-> 2

    Iteration three : el = 3
    newNode = 3
    head = 1, tail = 2
    tail.next = newNode
    newNode.prev = tail;
    tail = newNode

    LL : null <- 1 <-> 2 <-> 3


     */
    public static DoublyLLNode takeInput() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        DoublyLLNode head = null;
        DoublyLLNode tail = null;
        while (data != -1) {
            DoublyLLNode newNode = new DoublyLLNode(data);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            newNode.prev = tail;
            tail = newNode;
            data = s.nextInt();
        }
        return head;
    }

    // null <- 1 <-> 2 <-> 3 <-> 4 <-> 5 <-> 6 -> null
    public static void print(DoublyLLNode head) {
        DoublyLLNode temp = head;
        while (temp != null) {
            System.out.println("Current node :" + temp.data);
            if (temp.prev == null) {
                System.out.println("Prev node of: " + temp.data + " = " + null);
            } else {
                System.out.println("Prev node of: " + temp.data + " = " + temp.prev.data);
            }
            if (temp.next == null) {
                System.out.println("Next node of: " + temp.data + " = " + null);
            } else {
                System.out.println("Next node of: " + temp.data + " = " + temp.next.data);
            }
            System.out.println("*****************");
            temp = temp.next;
        }
    }
}
