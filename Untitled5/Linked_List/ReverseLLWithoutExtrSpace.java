package Linked_List;

import java.util.Scanner;

class LLNode {
    int data;
    LLNode next;
    LLNode (int data ){
        this.data = data;
    }
}
public class ReverseLLWithoutExtrSpace {
    public static void main(String[] args) {
        LLNode head = takeInput();
        print(head);
        System.out.println();
        System.out.println("After reversing the Linked list :");
        reverse(head);
        print(head);
    }
    public static LLNode takeInput(){
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        LLNode head = null ;
        LLNode tail = null;
        while(data != -1 ){
            LLNode newNode = new LLNode(data);
            if(head == null){
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }
    public static int length(LLNode head){
        int size = 0 ;
        LLNode temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        return size;
    }
    public static void print(LLNode head){
        LLNode curr = head;
        while (curr!=null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
    }
    private static LLNode getNode(LLNode head, int idx ){
        LLNode temp = head;
        for(int i = 0 ;i<idx;i++){
            temp = temp.next;
        }
        return temp ;
    }
    public static void reverse(LLNode head){
        int li = 0 ;
        int ri = length(head)-1;
        while(li < ri ){
            LLNode left = getNode(head,li);
            LLNode right = getNode(head,ri);
            int temp = left.data;
            left.data = right.data;
            right.data = temp;
            li++;
            ri--;
        }
    }
}
