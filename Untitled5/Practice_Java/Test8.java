package Practice_Java;


import java.util.Scanner;
class LLNodes {
    int data ;
    LLNodes next;
    LLNodes(int data) {
        this.data = data;
    }
}


public class Test8 {
    public static void main(String[] args) {
        LLNodes start = takeInputs();
//        print(start);
//        LLNodes newHead1 = insert(start, 6, 0);
//        Test8.print(newHead1);
//        LLNodes newHead4 = insert(start, 20, 5);
//        Test8.print(newHead4);

//        int middleEl = getMiddleElements(start);
//        System.out.println(middleEl);
//
//        LLNodes reverseHead = reverse(start);
//        Test8.print(reverseHead);
        LLNodes newHead = reverseKGroups(start, 3);
        Test8.print(newHead);
    }
    public static LLNodes reverseKGroups(LLNodes head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int i = 0;
        LLNodes prev = null;
        LLNodes curr = head;
        while (i < k && curr != null) {
            LLNodes agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
            i++;
        }
        LLNodes recursionHead = reverseKGroups(curr, k);
        if (head != null) {
            head.next = recursionHead;
        }
        return prev;
    }
    public static LLNodes reverse(LLNodes head) {
        LLNodes prev = null;
        LLNodes curr = head;
        while (curr != null) {
            LLNodes agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }
        return prev;
    }
    public static LLNodes takeInputs(){
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        LLNodes start = null;
        LLNodes end = null;
        while (data!=-1){
            LLNodes newNodes = new LLNodes(data);
            if(start==null){
                start = newNodes;
                end = newNodes;
            } else {
                end.next=newNodes;
                end=newNodes;
            }
            data = s.nextInt();
        }
        return start ;
    }
    public static void print(LLNodes start){
        LLNodes temp = start;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static int getMiddleElements(LLNodes start) {
        LLNodes slow = start;
        LLNodes fast = start;
        LLNodes prev = null;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    public static LLNodes insert(LLNodes start, int el, int idx) {
        int length = getLength(start);
        if (idx >= length) {
            System.out.println("Insertion not possible");
            return start;
        }
        // When the idx == 0
        if (idx == 0) {
            LLNodes newNode = new LLNodes(el);
            newNode.next = start;
            start = newNode;
            return start;
        }


        LLNodes newNode = new LLNodes(el);
        int i = 0;
        LLNodes prevNode = start; // 1

        while (i < idx - 1) {
            prevNode = prevNode.next;
            i++;
        }
        LLNodes nextNode = prevNode.next; // nextNode = null
        newNode.next = nextNode; // 20.next = null
        prevNode.next = newNode; // 5.next = 20
        return start;
    }
    public static int getLength(LLNodes start) {
        LLNodes temp = start;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

}