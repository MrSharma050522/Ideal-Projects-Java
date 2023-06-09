package Char_Linked_List;
/*
1 -> 2 -> 3 -> 4 -> 5
Find the middle element : 3
1 -> 2 -> 3 -> 4 -> 5 -> 6
Middle el : 3

Approach 1 :
1. Calculate the length of LL = len
2. Find element at len/2 idx.

Constraint :
1. Do this problem in a single pass/traversal
2. Do not calculate the length.

Approach  2: Hare and Tortoise approach.
1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10 -> 11 -> null
(1 step at a time) slow(tortoise) = 1 -> 2 -> 3 -> 4 -> 5 -> 6
(2 step at a time) fast(hare) = 1 -> 3 -> 5 -> 7 -> 9 -> 11

1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10 -> null
slow = 1 -> 2 -> 3 -> 4 -> 5 -> 6
fast = 1 -> 3 -> 5 -> 7 -> 9 -> null

fast == null || fast.next == null -> slow is my middle element

 */

public class MiddleInALL {
    public static void main(String[] args) {
        LLNode head = LLUtils.takeInput();
        int middleEl = getMiddleElement(head);
        System.out.println(middleEl);
    }

    public static int getMiddleElement(LLNode head) {
        LLNode slow = head;
        LLNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
