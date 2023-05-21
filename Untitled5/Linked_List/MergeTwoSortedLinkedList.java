package Linked_List;

import Char_Linked_List.LLNode;
import Char_Linked_List.LLUtils;

import java.util.LinkedList;

public class MergeTwoSortedLinkedList {
    public static void main(String[] args) {
        LLNode head1 = LLUtils.takeInput();
        LLNode head2 = LLUtils.takeInput();
        mergeLinkedListWithoutAffecting(head1,head2);
        LLUtils.print(mergeLinkedList(head1,head2));
    }
    // here linked list are merged without affecting other two linked list ;
    public static void mergeLinkedListWithoutAffecting(LLNode head1, LLNode head2){
        LLNode one = head1;
        LLNode two = head2;
        LinkedList<Integer> res = new LinkedList<>();
        while (one != null && two != null){
            if(one.data <= two.data ){
                res.addLast(one.data);
                one = one.next;
            } else {
                res.addLast(two.data);
                two = two.next;
            }
        }
        while (one != null){
            res.addLast(one.data);
            one = one.next;
        }
        while (two != null){
            res.addLast(two.data);
            two = two.next;
        }
        System.out.println(res);
    }

    public static LLNode mergeLinkedList(LLNode head1, LLNode head2){
        if(head1 == null && head2 == null){
            return null;
        }
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        LLNode head3 = null;
        LLNode temp = null;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                if(head3 == null){
                    head3 = head1;
                    temp = head3;
                }else{
                    temp.next = head1;
                    temp = temp.next;
                }
                head1 = head1.next;
            }else{
                if(head3 == null){
                    head3 = head2;
                    temp = head3;
                }else{
                    temp.next = head2;
                    temp = temp.next;
                }
                head2 = head2.next;
            }
        }
        if(head1 != null){
            temp.next = head1;

        }else {
            temp.next = head2;
        }
        return head3;
    }
}
