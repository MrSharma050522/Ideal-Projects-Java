package Linked_List;

import Char_Linked_List.LLNode;
import Char_Linked_List.LLUtils;

public class OddEvenLinkedList {
    public static void main(String[] args) {
        LLNode head = LLUtils.takeInput();
        System.out.println("Original Linked List :");
        LLUtils.print(head);
        System.out.println();
        System.out.println("Linked List after arranging odd even :");
        LLUtils.print(oddEvenArrange(head));

    }
    public static LLNode oddEvenArrange(LLNode head){
        if(head == null || head.next == null){
            return head ;
        }

        LLNode current = head;
        LLNode oddHead = null;
        LLNode evenHead = null;
        LLNode oddTail = null;
        LLNode evenTail = null;
        while(current!=null) {
            if(current.data%2==0) {
                if(evenHead==null) {
                    evenHead=evenTail=current;
                } else {
                    evenTail.next=current;
                    evenTail=current;
                }
            } else {
                if(oddHead==null) {
                    oddHead=oddTail=current;
                } else {
                    oddTail.next=current;
                    oddTail=current;
                }
            }
            current=current.next;
        }
        LLNode newHead ;
        if(evenHead == null) {
            newHead = oddHead;
        }
        else if(oddHead == null) {
            newHead = evenHead;
        } else {
            newHead = oddHead;
            oddTail.next = evenHead;
            evenTail.next = null;
        }
        return newHead;
    }
}
