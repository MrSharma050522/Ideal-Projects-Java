package Linked_List;

import Char_Linked_List.LLNode;
import Char_Linked_List.LLUtils;

public class AddTwoNumberAsLL {
    public static void main(String[] args) {
        LLNode head1 = LLUtils.takeInput();
        LLNode head2 = LLUtils.takeInput();
        LLUtils.print(addTwoLists(head1,head2));
    }
    public static LLNode addTwoLists(LLNode first, LLNode second) {
        LLNode start1 = new LLNode(0);
        start1.next = first;
        LLNode start2 = new LLNode(0);
        start2.next = second;

        addPrecedingZeros(start1, start2);
        LLNode result = new LLNode(0);
        if (sumTwoLLNodes(start1.next, start2.next, result) == 1) {
            LLNode LLNode = new LLNode(1);
            LLNode.next = result.next;
            result.next = LLNode;
        }
        return  result.next;
    }

    /* Adds lists and returns the carry */
    private static int sumTwoLLNodes(LLNode first, LLNode second, LLNode result) {
        if (first == null) {
            return 0;
        }
        int number = first.data + second.data + sumTwoLLNodes(first.next, second.next, result);
        LLNode LLNode = new LLNode(number % 10);
        LLNode.next = result.next;
        result.next = LLNode;
        return number / 10;
    }

    /* Appends preceding zeros in case a list is having lesser LLNodes than the other one*/
    private static void addPrecedingZeros(LLNode start1, LLNode start2) {
        LLNode next1 = start1.next;
        LLNode next2 = start2.next;
        while (next1 != null && next2 != null) {
            next1 = next1.next;
            next2 = next2.next;
        }
        if (next1 == null && next2 != null) {
            while (next2 != null) {
                LLNode LLNode = new LLNode(0);
                LLNode.next = start1.next;
                start1.next = LLNode;
                next2 = next2.next;
            }
        } else if (next2 == null && next1 != null) {
            while (next1 != null) {
                LLNode LLNode = new LLNode(0);
                LLNode.next = start2.next;
                start2.next = LLNode;
                next1 = next1.next;
            }
        }
    }

}
