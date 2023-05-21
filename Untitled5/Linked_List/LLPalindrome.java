package Linked_List;


                //2. Check if a Linked List is a palindrome
                //Time complexity - O(n)
                //Space complexity - O(1)

import Char_Linked_List.LLNode;
import Char_Linked_List.LLUtils;

public class LLPalindrome {
    public static void main(String[] args) {
        LLNode head = LLUtils.takeInput();
        LLUtils.print(head);
        System.out.println();
        System.out.println(isPalindrome(head));
        System.out.println(IsPalindrome(head));
    }
    public static LLNode getMiddle(LLNode head){
        LLNode slow = head;
        LLNode fast = head;
        while (fast.next!= null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static LLNode reverse(LLNode head ){
        LLNode prev = null;
        LLNode curr = head;
        while (curr != null) {
            LLNode agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }
        return prev;
    }
    /*
    1 2 3 4 1 2 3 4
     */
    public static boolean isPalindrome(LLNode head){
        if (head == null || head.next == null) {
            return true;
        }
        LLNode firstHalfEnd = getMiddle(head);
        LLNode secondHalfStart = reverse(firstHalfEnd.next);
        LLNode firstHalfStart = head;
        while (secondHalfStart != null){
            if(secondHalfStart.data != firstHalfStart.data){
                return false ;
            }
            secondHalfStart = secondHalfStart.next;
            firstHalfStart = firstHalfStart.next;
        }
        return true ;
    }
    public static boolean IsPalindromeHelper( LLNode right){
        if(right == null){
            return true ;
        }
        boolean res = IsPalindromeHelper(right.next);
        if(!res){
            return false;
        } else if(left.data != right.data) {
            return false;
        } else{
            left = left.next;
            return  true;
        }
    }
    public static LLNode left;
    public static boolean IsPalindrome(LLNode head){
        left = head;
        return IsPalindromeHelper(head);
    }
}
