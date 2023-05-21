package Linked_List;

public class RemoveAtOddEvenPosition {
    public static void main(String[] args) {
        Node head = null;
        head = Insert(head, 99);
        head = Insert(head, 11);
        head = Insert(head, 22);
        head = Insert(head, 33);

        System.out.print("before deleting: ");
        Display(head);

        System.out.print("\nAfter deleting Odd position nodes: ");
        head = DeleteAllOddNode(head);
        Display(head);
    }
    static class Node {
        int data;
        Node next;
    }

    static Node DeleteAllEvenNode( Node head) {
        int len = Length(head);
        int count = 1;
        Node previous = head, next ;
        if (head == null) {
            System.out.print("\nList is empty\n");
            return null;
        }
        if (len < 2) {
            return null;
        }
        next = previous.next;
        while (len > 0) {
            if (count % 2 == 0) {
                previous.next = next.next;
                previous = next.next;
                next = previous.next;
            }
            len--;
            count++;
        }
        return head;
    }

    static int Length(Node head) {
        Node current = head;
        int count = 0;
        if (head == null) {
            return 0;
        }
        else {
            do {
                current = current.next;
                count++;
            } while (current != head);
        }
        return count;
    }

    static void Display( Node head) {
        Node current = head;
        if (head == null) {
            System.out.print("\nDisplay List is empty\n");
        }

        else {
            do {
                System.out.printf("%d ", current.data);
                current = current.next;
            } while (current != head);
        }
    }

    static Node Insert(Node head, int data) {
        Node current = head;
        Node newNode = new Node();
        if (newNode == null) {
            System.out.print("\nMemory Error\n");
            return null;
        }
        newNode.data = data;
        if (head == null) {
            newNode.next = newNode;
            head = newNode;
            return head;
        }
        else {
            while (current.next != head) {
                current = current.next;
            }
            newNode.next = head;
            current.next = newNode;
        }
        return head;
    }

    static Node deleteNode(Node head_ref, Node del) {
        Node temp = head_ref;
        if (head_ref == del) {
            head_ref = del.next;
        }
        while (temp.next != del) {
            temp = temp.next;
        }
        temp.next = del.next;
        return head_ref;
    }

    static Node DeleteFirst(Node head) {
        Node previous = head, next = head;
        if (head == null) {
            System.out.print("\nList is empty\n");
            return head;
        }
        if (previous.next == previous) {
            head = null;
            return head;
        }
        while (previous.next != head) {
            previous = previous.next;
            next = previous.next;
        }
        previous.next = next.next;
        head = previous.next;
        return head;
    }

    static Node DeleteAllOddNode(Node head) {
        int len = Length(head);
        int count = 0;
        Node previous = head, next ;
        if (head == null) {
            System.out.print("\nDelete Last List is empty\n");
            return null;
        }
        if (len == 1) {
            head = DeleteFirst(head);
            return head;
        }
        while (len > 0) {
            if (count == 0) {
                head = DeleteFirst(head);
            }
            if (count % 2 == 0 && count != 0) {
                head = deleteNode(head, previous);
            }
            previous = previous.next;
            next = previous.next;
            len--;
            count++;
        }
        return head;
    }
}
