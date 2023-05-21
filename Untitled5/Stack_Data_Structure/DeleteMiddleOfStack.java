package Stack_Data_Structure;

import java.util.Stack;

public class DeleteMiddleOfStack {
    public static void deleteMid(Stack<Integer> st, int n, int curr) {
        if (st.empty() || curr == n)
            return;
        int x = st.pop();
        deleteMid(st, n, curr+1);
        if (curr != n/2)
            st.push(x);
    }

    public static void main(String args[]) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);

        System.out.println(st);

        System.out.println("after deleting mid- ");
        deleteMid(st, st.size(), 0);
        Stack<Integer> stack = new Stack<>();
        while(!st.isEmpty()){
            stack.push(st.pop());
        }

        while (!stack.empty()) {
            int p=stack.pop();
            System.out.print(p + " ");
        }

    }
    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        reverse(stack);
        pushAtBottom(stack,top);
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
