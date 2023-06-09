package Char_Linked_List;
/*
1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
Given two values : el : 9, idx : 1
Insert the given el at given idx
1 -> 9 -> 3 -> 4 -> 5 -> 6 -> null
 */
public class InsertInALL {
    public static void main(String[] args) {
        LLNode head = LLUtils.takeInput();
        // 1 -> 2 -> 3 -> 4 -> 5 -> null
        LLNode newHead1 = insert(head, 6, 0);
        LLUtils.print(newHead1);
//        LLNode newHead2 = insert(head, 10, 4);
//        LLUtils.print(newHead2);
        LLNode newHead4 = insert(head, 20, 5);
        LLUtils.print(newHead4);
//        LLNode newHead3 = insert(head, 20, 10);
//        LLUtils.print(newHead3);
    }

    public static LLNode insert(LLNode head, int el, int idx) {
        int length = LLUtils.getLength(head);
        if (idx >= length) {
            System.out.println("Insertion not possible");
            return head;
        }
        // When the idx == 0
        if (idx == 0) {
            LLNode newNode = new LLNode(el);
            newNode.next = head;
            head = newNode;
            return head;
        }

        /*
        1 -> 2 -> 3 -> 4 -> 5 -> null
        idx = 4, el = 10
        1 -> 2 -> 3 -> 4 -> 10 -> 5 -> null
        prevNode = 4
        nextNode = 5
        idx = 5, el = 20
        1 -> 2 -> 3 -> 4 -> 5 -> 20 -> null
         */
        LLNode newNode = new LLNode(el);
        // Find the prev node
        // 1 < 5 = 1, 2, 3, 4
        // 0 < 4 = 0, 1, 2, 3
        int i = 0;
        LLNode prevNode = head; // 1
        /*
        idx = 5
        0 < 4, temp = 2, i = 1
        1 < 4, temp = 3, i = 2
        2 < 4, temp = 4, i = 3
        3 < 4, temp = 5, i = 4
         */
        // prevNode = 5
        // nextNode = null
        while (i < idx - 1) {
            prevNode = prevNode.next;
            i++;
        }
        LLNode nextNode = prevNode.next; // nextNode = null
        newNode.next = nextNode; // 20.next = null
        prevNode.next = newNode; // 5.next = 20
        return head;
    }

}
