package Linked_List;

import Char_Linked_List.LLNode;
import Char_Linked_List.LLUtils;

public class RemoveDuplicateFromLinkedList {
    public static void main(String[] args) {
        LLNode head = LLUtils.takeInput();
        LLUtils.print(head);
        System.out.println();
        LLUtils.print(removeDuplicates(head));
        System.out.println();
        LLUtils.print(removeDuplicate(head));
    }
    public static LLNode removeDuplicates(LLNode head){
        LLNode newHead = null;
        LLNode temp = null ;
        while (head != null){
            if(newHead == null ){
                newHead = head;
                temp = newHead;
            } else if(temp.data != head.data){
                temp.next = head;
                temp = temp.next;
            }else{
                temp.next = null;
            }
            head = head.next;
        }
        return newHead;
    }
    public static LLNode removeDuplicate(LLNode head){
        LLNode temp=head;
        while(head.next!=null) {
            if(head.data==head.next.data) {
                head.next=head.next.next;
            }
            else {
                head=head.next;
            }
        }
        return temp;
    }
}
