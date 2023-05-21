package Strings;

import java.util.Scanner;

public class ReversingString {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        reverseString(str,str.length()-1);


        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);

        }
        System.out.println(sb);
    }
    public static void  reverseString(String str,int n ){
        if(n==0){
            System.out.print(str.charAt(n));
            return;
        }
        else System.out.print(str.charAt(n));
        reverseString(str,n-1);
    }
}
