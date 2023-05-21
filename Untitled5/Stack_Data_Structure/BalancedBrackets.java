package Stack_Data_Structure;

import java.util.Scanner;
import java.util.Stack;
/*
( { ( [ ] ) } )
 */
public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        Stack<Character> st = new Stack<>();
        for (int i = 0 ;i<str.length();i++){
            char curr = str.charAt(i);
            if(curr == '(' || curr == '{' || curr == '['){
                st.push(curr);
            }else {
                if(st.isEmpty()){
                    System.out.println(false);
                    return;
                }
                if (curr == ')' && st.peek() == '('){
                    st.pop();
                } else if (curr == '}' && st.peek() == '{'){
                    st.pop();
                } else if (curr == ']' && st.peek() == '['){
                    st.pop();
                }
            }
        }
        if(st.isEmpty()){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
