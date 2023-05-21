package Strings;


import java.util.Scanner;
import java.util.Stack;

public class ReverseAStringUsingStack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] reverse = new char[str.length()];
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        int i = 0;
        while (!stack.isEmpty()){
            reverse[i++]=stack.pop();
        }
        System.out.println(new String(reverse));
    }
}
