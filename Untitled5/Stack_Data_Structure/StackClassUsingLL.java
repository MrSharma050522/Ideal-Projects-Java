package Stack_Data_Structure;

import Char_Linked_List.LLNode;

/*
The heap is a memory used by programming languages to store global variables.
By default, all global variables are stored in heap memory space.
It supports Dynamic memory allocation.
The heap is not managed automatically for you and is not as tightly managed by the CPU.
It is more like a free-floating region of memory
 */

public class StackClassUsingLL {
    static class Stack{
        public static LLNode head;

        public static void push(int data){
            LLNode newNode = new LLNode(data);
            if(isEmpty()){
                head = newNode;
                return ;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int size(){
            LLNode curr = head;
            int i = 0;
            while(curr != null){
                curr = curr.next;
                i++;
            }
            return i;
        }
        public static boolean isEmpty(){
            return head == null;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(5);
        stack.push(8);
        stack.push(0);
        stack.push(7);
        stack.push(9);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

        while (! stack.isEmpty()){
            System.out.println(stack.peek() );
            stack.pop();
        }
    }
}
