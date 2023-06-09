package Char_Linked_List;
/*
1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8
k = 3
3 -> 2 -> 1 -> 6 -> 5 -> 4 -> 8 -> 7
 */

public class ReverseALLInGroups {
    public static void main(String[] args) {
        LLNode head = LLUtils.takeInput();
        LLNode newHead = reverseKGroups(head, 3);
        LLUtils.print(newHead);
    }

    /*
    1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> null
    3 -> 2 -> 1 -> 6 -> 5 -> 4 -> 8 -> 7
     */
    public static LLNode reverseKGroups(LLNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int i = 0;
        LLNode prev = null;
        LLNode curr = head;
        while (i < k && curr != null) {
            LLNode agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
            i++;
        }
        /*
        3 -> 2 -> 1
        prev = 3
        curr = 4
         */
        LLNode recursionHead = reverseKGroups(curr, k);
        if (head != null) {
            head.next = recursionHead;
        }
        return prev;
    }
}
