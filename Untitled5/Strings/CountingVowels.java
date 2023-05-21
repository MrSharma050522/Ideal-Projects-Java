package Strings;

import java.util.Scanner;

public class CountingVowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int count  = 0 ;
        for(int i = 0 ;i<str.length();i++){
            char curr = str.charAt(i);
            if(curr=='a' || curr=='e' || curr=='i' || curr=='o' || curr=='u' ){
                count++;
            }

        }
        System.out.println(count);
    }
}
