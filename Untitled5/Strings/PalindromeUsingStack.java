package Strings;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeUsingStack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i = 0 ;i<str.length();i++){
            st.push(str.charAt(i));
        }

        int i = 0;
        while(i != str.length()) {
            char curr = str.charAt(i);
            if (st.peek() != curr) {
                System.out.println("False");
                return;
            } else {
                st.pop();
                i++;
            }


        }
        System.out.println("True");

    }

}
