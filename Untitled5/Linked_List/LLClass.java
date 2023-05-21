package Linked_List;

public class LLClass {
    Node head;
    private int size ;

    LLClass (){
        this.size = 0;

    }
    class Node {
        String data ;
        Node next ;


        Node(String data){
            this.data = data;
            this.next = null ;
            size++;
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
    public void deleteFirst(){
        if(head == null){
            System.out.print("the list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    public void deleteLast(){
        if(head == null){
            System.out.print("the list is empty");
            return;
        }

        if(head.next == null){
            head = null ;
            return  ;
        }

        Node secondLast = head ;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
//        // OR
//        Node temp = head;
//        for(int i=0;i<size-2;i++){
//            temp = temp.next;
//        }
//        temp.next = null;
        size--;

    }
    public int getSize(){
        return size;
    }
    public void reverseIterative(){
        if(head == null || head.next == null){
            System.out.println("list is empty ");
            return;
        }

        Node preNode = head ;
        Node currNode = head.next;
        while (currNode!=null){
            Node nextNode = currNode.next;
            currNode.next=preNode;
            preNode = currNode;
            currNode = nextNode;
        }
        head.next = null ;
        head = preNode;
    }
    private Node getNodeAt(int idx){
        Node temp = head ;
        for(int i = 0 ;i<idx;i++){
            temp = temp.next;
        }
        return temp ;
    }
    public void reverseDataIterative(){
        int li = 0;
        int ri = size - 1;
        while (li < ri ){
            Node left = getNodeAt(li);
            Node right = getNodeAt(ri);

            String temp = left.data;
            left.data = right.data;
            right.data = temp;
            li++;
            ri--;
        }

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
    public static void main(String[] args) {
        LLClass list = new LLClass();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("new");
        list.printList();
        list.addFirst("this");
        list.printList();


//        list.deleteFirst();
//        list.printList();
//
//        list.deleteLast();
//        list.printList();

        System.out.println(list.getSize());
        list.addLast("list");
        System.out.println(list.getSize());
        list.reverseIterative();
        list.printList();
        list. head =  list.reversRecursive(list.head);
        list.printList();
        list.reverseDataIterative();
        list.printList();


    }

}
