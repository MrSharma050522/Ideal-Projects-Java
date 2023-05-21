package Linked_List;

import Char_Linked_List.LLNode;
import Char_Linked_List.LLUtils;

public class MergeSortALinkedList {
    public static void main(String[] args) {
        LLNode head = LLUtils.takeInput();
        System.out.println("Original Linked List : ");
        LLUtils.print(head);
        System.out.println();
        System.out.println("Sorted Linked List : ");
        LLUtils.print(mergeSort(head));

    }

    public static LLNode getMiddleNode(LLNode head){
        LLNode slow = head;
        LLNode fast = head.next;
        while (fast != null  && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static LLNode mergeSort(LLNode head ){
        if(head.next == null ){
            return head;
        }
        LLNode mid = getMiddleNode(head);
        LLNode nextOfMiddle = mid.next;
        mid.next = null;
        LLNode firstSortedHalf = mergeSort(head);
        LLNode secondSortedHalf = mergeSort(nextOfMiddle);
        LLNode head3 = merge(firstSortedHalf,secondSortedHalf);
        return head3;
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
    public static LLNode merge(LLNode a , LLNode b ){
        if(a==null) return b;
        if(b==null) return a;

        LLNode result;

        if(a.data <= b.data){
            result = a;
            result.next = merge(a.next, b);
        }else{
            result = b;
            result.next = merge(a, b.next);
        }
        return result;
    }
}
