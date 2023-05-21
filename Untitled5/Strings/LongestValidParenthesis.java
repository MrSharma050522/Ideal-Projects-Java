package Strings;

import java.util.Scanner;

public class LongestValidParenthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        System.out.println(longestValidParentheses(str));
    }
    public static int longestValidParentheses(String s) {
        int answer = 0;

        int open = 0;
        int close = 0;

        // 0 to n-1
        for(int index = 0; index < s.length(); index++) {
            char ch = s.charAt(index);

            if(ch == '(') {
                open++;
            } else {
                close++;
            }

            if(open == close) {
                int totalLength = open + close;
                answer = Math.max(answer , totalLength);
            } else if(close > open) {
                open = close = 0;
            }
        }

        open = close = 0;

        // n-1 to 0
        for(int index = s.length() - 1; index >= 0; index--) {
            char ch = s.charAt(index);

            if(ch == '(') {
                open++;
            } else {
                close++;
            }

            if(open == close) {
                int totalLength = open + close;
                answer = Math.max(answer , totalLength);
            } else if(open > close) {
                open = close = 0;
            }
        }

        return answer;
    }
}
