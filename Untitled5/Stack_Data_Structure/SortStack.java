package Stack_Data_Structure;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(85);
        stack.push(3);
        stack.push(45);
        stack.push(7);
        stack.push(48);
        stack.push(36);
        stack.push(84);
        stack.push(41);
        stack.push(15);
        sort(stack);
//        while (!tempStack.isEmpty()) {
//            System.out.println(stack.peek());
//            stack.pop();
//        }
    }
    public static void sort(Stack<Integer> stack){
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()){
            int temp = stack.pop();
            while(!tempStack.isEmpty() && tempStack.peek() > temp ){
                stack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        while (!tempStack.isEmpty()) {
            System.out.println(tempStack.pop());

        }
    }
}
