package Linked_List;


                //3. Detecting Loop in a Linked List.
                //Time complexity - O(n)
                //Space complexity - O(1)


import Char_Linked_List.LLNode;
import Char_Linked_List.LLUtils;

public class LoopMaking_Detecting_Removal {
    public static void main(String[] args) {
        LLNode head = LLUtils.takeInput();
        makeLoop(head,4);
        System.out.println(detectLoop(head));
        LLUtils.print(removeLoop(head));
        System.out.println();
        System.out.println(detectLoop(head));
    }
    public static void makeLoop(LLNode head , int x ){
        if( x == 0 ){
            return;
        }
        LLNode curr  =head;
        LLNode last = head;
        int i = 1;
        while(i < x ){
            curr = curr.next;
            i++;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = curr;
    }

    /*
        Floyd’s Cycle-Finding Algorithm:

        Floyd’s Cycle-Finding Algorithm is the fastest method:
        Traverse linked list using two pointers.
        Move head1 pointer(slow) by head1 and another pointer(fast) by two.
        If these pointers meet at the same node then there is a loop. If pointers do not meet then linked list does not have a loop
        This is a simple algorithm to detect the cycle.
     */
    public static boolean detectLoop(LLNode head){
        if (head == null) {
            return false;
        }
        LLNode slow = head ;
        LLNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                return true ;
            }
        } return false ;
    }
    public static LLNode removeLoop(LLNode head){
        LLNode fast = head.next;
        LLNode slow = head;
        while( fast!=slow ){
            if( fast==null || fast.next==null )
                return null;

            fast = fast.next.next;
            slow = slow.next;
        }
        //Here we'll get length of loop not the length of LinkedList
        int size = 1;
        fast = fast.next;
        while( fast!=slow ){
            fast = fast.next;
            size+=1;
        }
        slow = head;
        fast = head;
        // Moving fast pointer to the size-1 th node ;
        for(int i=0; i<size-1; i++)
            fast = fast.next;

        //now we keep iterating with both pointers till fast reaches a node such
        //that the next node is pointed by slow. At this situation slow is at
        //the node where loop starts and fast at last node so, we simply
        //update the link part of fast.
        while( fast.next != slow ){
            fast = fast.next;
            slow = slow.next;
        }
        fast.next = null;
        return head;
    }


}
