import java.util.LinkedList;
import java.util.Scanner;


public class CreateAndReverseLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node head = takeInput();
        Node newHead = reverseKGroups(head, 3);
        print(newHead);
    }
    public static Node takeInput() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node head = null;
        Node tail = null;
        while (data != -1) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
            data = s.nextInt();
        }
        return head;
    }
    public static Node reverseKGroups(Node head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int i = 0;
        Node prev = null;
        Node curr = head;
        while (i < k && curr != null) {
            Node agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
            i++;
        }
        head.next = curr;
        return prev;
    }
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
}
