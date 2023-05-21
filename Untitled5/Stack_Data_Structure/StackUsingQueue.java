package Stack_Data_Structure;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<Integer>();
        static Queue<Integer> q2 = new LinkedList<Integer>();

        public static boolean isEmpty(){
            return q1.isEmpty();
        }
        public static void push(int x) {
            // Push x first in empty q2
            q2.add(x);

            // Push all the remaining
            // elements in q1 to q2.
            while (!q1.isEmpty()) {
                q2.add(q1.peek());
                q1.remove();
            }

            // swap the names of two queues
            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
        }

        public static void pop() {
            // if no elements are there in q1
            if (q1.isEmpty())
                return;
            q1.remove();
        }

        public static int top() {
            if (q1.isEmpty())
                return -1;
            return q1.peek();
        }

        public static int size(){
            return q1.size();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.size());
        while (!stack.isEmpty()){
            System.out.println(stack.top());
            stack.pop();
        }
    }

}
