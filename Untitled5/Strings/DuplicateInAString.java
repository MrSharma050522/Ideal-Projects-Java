package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateInAString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String  str = s.nextLine();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0;i<str.length();i++){
            char curr = str.charAt(i);
            if(hm.containsKey(curr)){
                int freq = hm.get(curr);
                int newFreq = freq + 1;
                hm.put(curr,newFreq);
            } else {
                hm.put(curr,1);
            }
        }

        for(Character ch : hm.keySet()){
            if(hm.get(ch) >= 2){
                System.out.print(ch+" ");

            }
        }


    }
}
