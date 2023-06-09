package Char_Linked_List;
/*
Given a LL, reverse it.
1 -> 2 -> 3 -> 4 -> 5
5 -> 4 -> 3 -> 2 -> 1 -> null

prev = null
curr = 1
1 -> null
agla = curr.next // agla = 2
curr.next = prev // curr.next = null , 1 -> null
prev = curr // prev = 1
curr = agla // moving forward. curr = 2
output : 5 -> 4 -> 3 -> 2 -> 1 -> null
 */

public class ReverseALL {
    public static void main(String[] args) {
        LLNode head = LLUtils.takeInput();
        LLNode reverseHead = reverse(head);
        LLUtils.print(reverseHead);
    }

    public static LLNode reverse(LLNode head) {
        LLNode prev = null;
        LLNode curr = head;

        /*
        1 -> 2 -> 3 -> 4 -> 5 -> null
        OP : 5 -> 4 -> 3 -> 2 -> 1 -> null

        prev = null
        curr = 1

        Iteration 1 :
        agla = 2
        1.next = null => 1 -> null
        prev = 1
        curr = 2

        Iteration 2 :
        agla = 2.next = 3
        2.next = 1 , 2 -> 1 -> null
         */

        while (curr != null) {
            LLNode agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }
        return prev;
    }

}
