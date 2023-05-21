package Practice_Java;

import java.util.Scanner;

public class ShubhamMock {
    static class LLNode
    {
        int data;
        LLNode next;
        LLNode(int data)
        {
            this.data=data;
            next=null;
        }
    }
    public static void main(String[] args) {
        LLNode newNode=takeInput();
        print(newNode);
        System.out.println(isPalindrome(newNode));


    }
    public static LLNode takeInput() {
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        LLNode start=null;
        LLNode end=null;
        while(data != -1) {
            LLNode newNode = new LLNode(data);
            if(start==null) {
                start=newNode;
                end=newNode;
            }
            else{
                end.next=newNode;
                end=newNode;
            }
            data=sc.nextInt();
        }
        return start;
    }
    public static void print(LLNode start) {
        LLNode temp=start;
        while(temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static boolean isPalindrome(LLNode head) {
        if(head==null || head.next==null) {
            return true;
        }
        LLNode middle=findMiddle(head);
        LLNode secondHalf=reverse(middle.next);
        LLNode firstHalf=head;
        while(secondHalf!=null) {
            if(firstHalf.data!=secondHalf.data) {
                return false;
            }
            firstHalf =firstHalf.next;
            secondHalf=secondHalf.next;
        }
        return true;
    }
    public static LLNode findMiddle(LLNode head) {
        LLNode slow=head;
        LLNode fast=head;
        while(fast.next!=null && fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static LLNode reverse(LLNode head) {
        LLNode prev=null;
        LLNode curr=head;
        while(curr!=null) {
            LLNode ptr=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ptr;
        }
        return prev;
    }
}
