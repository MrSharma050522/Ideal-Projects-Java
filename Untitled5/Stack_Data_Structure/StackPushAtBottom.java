package Stack_Data_Structure;

import java.util.Stack;

public class StackPushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        pushAtBottom(stack,5);
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
    public static void pushAtBottom(Stack<Integer> stack, int data) {
            if(stack.isEmpty()){
                stack.push(data);
                return;
            }
            int temp = stack.pop();
            pushAtBottom(stack,data);
            stack.push(temp);
    }

}


