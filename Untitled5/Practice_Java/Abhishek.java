package Practice_Java;

public class Abhishek {
    Node head;

    class Node {
        String data ;
        Node next ;
        Node(String data){
            this.data = data;
            this.next = null ;
        }

    }
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head ;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node currNode = head ;
        while (currNode.next!=null){
            currNode= currNode.next;

        }
        currNode.next = newNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return  ;
        }
        Node currNode = head ;
        while (currNode != null){
            System.out.print(currNode.data + "->");
            currNode= currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Abhishek list = new Abhishek();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("this");
        list.printList();
        list. head =  list.reversRecursive(list.head);
        list.printList();
    }
    public Node reversRecursive(Node head ){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reversRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
