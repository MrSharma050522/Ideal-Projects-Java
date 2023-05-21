package Practice_Java;

import java.util.Scanner;

class LLNode {
    int data;
    LLNode next;

    LLNode(int data) {
        this.data = data;
    }

}
public class Shubham {
    public static void main(String[] args) {
        LLNode head = takeInput();
        print(head);

    }

    public static LLNode takeInput() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        LLNode head = null;
        LLNode tail = null;
        while (data != 0) {
            LLNode newNode = new LLNode(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {

                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void print(LLNode head) {
        LLNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
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

}
