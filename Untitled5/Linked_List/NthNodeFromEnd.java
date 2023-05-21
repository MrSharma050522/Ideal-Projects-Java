package Linked_List;

import Char_Linked_List.LLNode;
import Char_Linked_List.LLUtils;


            //1. Find the nth node from the end & remove it.
            //Time complexity - O(n)
            //Space complexity - O(1)


public class NthNodeFromEnd {
    public static void main(String[] args) {
        LLNode head = LLUtils.takeInput() ;
        System.out.println("Printing the Original LinkedList:");
        LLUtils.print(head);
        System.out.println("_____________");
        System.out.println("Printing the LL after remove nth element from last:");
        LLUtils.print(removeNthNodeFromEnd(head,7));
        System.out.println("_____________");
        System.out.println("Printing the Nth Node from last : ");
        // here after removal of nth from last the size decrease so that
        // it displays the nth from last  form the list after removal of the node
        System.out.println(gettingNthNodeFromEndUsingPointer(head,3));
        System.out.println("____________");
        System.out.println(gettingNthFromEnd(head,7));
        System.out.println("_____________");

    }
    public static LLNode removeNthNodeFromEnd(LLNode head, int n ){
        if(head.next == null){
            return null;
        }
        // size
        int size = 0;
        LLNode curr = head ;
        while (curr != null){
            curr = curr.next;
            size++;
        }
        if(n ==  size ){
            head = head.next;
        }
        int indexToSearch = size - n;
        LLNode prev = head ;
        int i = 1;
        while(i<indexToSearch){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head ;

    }
    public static int gettingNthNodeFromEndUsingPointer(LLNode head , int k ){
        LLNode slow = head;
        LLNode fast = head ;
        for(int i=0;i<k;i++){
            fast = fast.next;
        }
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;

    }
    public static int gettingNthFromEnd(LLNode head ,int n){
        if(head.next == null){
            return -1;
        }
        // size
        int size = 0;
        LLNode curr = head ;
        while (curr != null){
            curr = curr.next;
            size++;
        }
        if(n ==  size ){
            head = head.next;
        }
        int indexToSearch = size - n +1;
        LLNode cur = head ;
        int i = 1;
        while(i<indexToSearch){
            cur = cur.next;
            i++;

        }
        return cur.data ;
    }

}
