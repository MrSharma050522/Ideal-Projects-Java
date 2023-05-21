package Linked_List;

import Char_Linked_List.LLNode;
import Char_Linked_List.LLUtils;

public class FoldLinkedList {
    public static void main(String[] args) {
        LLNode head = LLUtils.takeInput();
        LLUtils.print(head);
        System.out.println();
        fold(head);
        LLUtils.print(head);

    }
    private static void foldHelper(LLNode right ){
        if(right == null){
            return ;
        }
        foldHelper(right.next);
        if(left == null){
            return;
        }
        if(left != right && left.next != right ) {
            LLNode temp = left.next;
            left.next = right;
            right.next = temp;
            left = temp;
        } else if (left.next == right){
            left.next.next = null ;
            left = null;
        } else {
            left.next = null;
            left = null;
        }

    }
    public static LLNode left = null;
    public static void fold(LLNode head){
        if(head != null){
            left = head;
            foldHelper(left);
        }
    }
}
