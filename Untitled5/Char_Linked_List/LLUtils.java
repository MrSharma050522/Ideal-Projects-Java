package Char_Linked_List;
/*
1. Linked list
2. Stacks
3. Queues
4. Trees.

Linked list:
Linked : linking between all the elements.
List : ArrayList -> collection of similar elements (dynamic)
Elements are at non-continuous positions unlike arraylist.

1 -> 2 -> 3 -> 4 -> 5 -> null

1,342    2,452    3, 167    4, 876   5, null
100      342      452       167      876

head = first node of LL. = 1
tail = last node of LL (except null) = 5
If you solve the problems of LL, you will always get head.

LLNode -> data, address
 */

import java.util.Scanner;
public class LLUtils {
    public static void main(String[] args) {
        LLNode head = takeInput();
        print(head);
    }
    /*
    Taking the input of LL
    1 2 3 4 5 -1:
    |1| -> |2| -> |3| -> |4| -> |5| -> null
     */
    public static LLNode takeInput() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt(); // 1
        LLNode head = null; // head = null
        LLNode tail = null; // tail = null
        while (data != -1) {
            LLNode newNode = new LLNode(data); // newNode = 3
            // 1 -> 2 -> 3
            if (head == null) {
                head = newNode; // head = 1
                tail = newNode; // tail = 1
            } else {
                // head.next = newNode 1 -> 2
                // tail.next = newNode 1 -> 2
                tail.next = newNode; // 1 -> 2 -> 3
                tail = newNode; // tail = 3
            }
            data = s.nextInt(); // 3
        }
        return head;
    }

    // 1 -> 2 -> 3 -> 4 -> 5 -> null
    /*
    head = 3
    print : 1 2 3
    head = 2.next = 3

    1 ->  2  -> 3 -> 6 -> 7 -> 8
     */
    public static void print(LLNode head) {
        LLNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
    public static int getLength(LLNode head) {
        LLNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

}
