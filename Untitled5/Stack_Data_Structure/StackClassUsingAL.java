package Stack_Data_Structure;



import java.util.ArrayList;

public class StackClassUsingAL {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        public static int sizes(){
            return list.size();
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);

        }
    }


    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(6);
        stack.push(8);
        stack.push(2);
        stack.push(8);
        stack.push(4);
        stack.push(9);
        stack.push(9);
        stack.push(9);

        System.out.println(stack.sizes());
        System.out.println(stack.isEmpty());

        while (! stack.isEmpty()){
            System.out.println(stack.peek() );
            stack.pop();
        }
    }
}
