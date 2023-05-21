package Strings;
//abcbdcses
//
//Unique - a d e
//
//Distinct- abcdes

import java.util.HashMap;
import java.util.Scanner;

public class UniqueAndDistinctInString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.print("Unique character of String are :");
        uniqueCharacter(str);
        System.out.println();
        System.out.print("Distinct character of string are :");
        distinct(str);


    }
    public static void uniqueCharacter(String str){
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0 ;i<str.length();i++){
            char curr = str.charAt(i);
            if(hm.containsKey(curr)){
                int of = hm.get(curr);
                int nf = of+1;
                hm.put(curr,nf);
            }else {
                hm.put(curr,1);
            }
        }
        for (Character ch : hm.keySet()){
            if(hm.get(ch) == 1){
                System.out.print(ch+" ");
            }
        }
    }
    public static void distinct(String str ){
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0 ;i<str.length();i++){
            char curr = str.charAt(i);
            if(hm.containsKey(curr)){
                int of = hm.get(curr);
                int nf = of+1;
                hm.put(curr,nf);
            }else {
                hm.put(curr,1);
            }
        }
        for (Character ch : hm.keySet()){
            System.out.print(ch+" ");
        }
    }
}
