package Linked_List;

import java.util.Scanner;

public class Adding1ToALL {
    static class Node {
        int data ;
        Node next ;
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node head = takeInput();
        print(head);
        System.out.println();
        System.out.println("After adding 1 :");
        Node sum = add1toLL(head);
        print(sum);
    }
    public static Node takeInput(){
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        Node head = null;
        Node tail = null;
        while (data != -1 ){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else {
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
    public static int addWithCarry(Node head ){
        if(head == null ){
            return 1;
        }
        int res = head.data + addWithCarry(head.next);
        head.data = (res) % 10;
        return (res) /10;
    }

    public static Node add1toLL(Node head){
        int carry = addWithCarry(head);
        if(carry > 0){
            Node newNode = new Node(carry);
            newNode.next = head;
            return newNode;
        }
        return head;

    }

}
