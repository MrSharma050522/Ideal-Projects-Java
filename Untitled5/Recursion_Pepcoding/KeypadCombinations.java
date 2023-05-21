package Recursion_Pepcoding;

import java.util.ArrayList;
import java.util.Scanner;

public class KeypadCombinations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        ArrayList<String> words = getKeypadCombination(str);
        System.out.println(words);
//        printKeypadCombination(str,0,"");
    }
    static String[] codes = {".," , "abc", "def","ghi","jkl","mno","pqrs","tu","vwx","yz" };

    public static ArrayList<String> getKeypadCombination(String str ){
        if(str.length() == 0 ){
            ArrayList<String> bRes = new ArrayList<>();
            bRes.add("");
            return bRes;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rRes = getKeypadCombination(ros);
        ArrayList<String> mRes = new ArrayList<>();
        String codeForCh = codes[ch - '0'];
        for(int i = 0 ;i<codeForCh.length();i++){
            char chCode = codeForCh.charAt(i);
            for(String rStr : rRes){
                mRes.add(chCode+rStr);
            }
        }
        return mRes;
    }
    public static void printKeypadCombination(String str,int idx ,String combination ){
        if(idx==str.length()){
            System.out.print(combination+ " ");
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = codes[currChar - '0'];
        for(int i = 0 ;i<mapping.length();i++){
            printKeypadCombination(str,idx+1,combination+mapping.charAt(i));
        }
    }
}
