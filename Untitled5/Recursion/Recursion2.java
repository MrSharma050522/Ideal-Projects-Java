package Recursion;
import java.util.HashSet;


public class Recursion2 {
    public static void main(String[] args) {




//        String str = "234";
//        keypadCombination(str,0,"");

//
//        String str ="abcab";
//        HashSet<String> set = new HashSet<>();
//        uniqueSubsequenceOfString(str,0,"",set);


//        String str ="abc";
//        subsequenceOfString(str,0,"");


//        String str = "abbccda";
//        removeDuplicates(str,0,"");


//        String str = "axbcxxd";
//        moveAllX(str,0,0,"");


//        int[] arr = {1,2,3,3,5,6,7};
//        System.out.println(checkSortedStrictlyIncreasing(arr,0));


//        String str = "abaacdaefaah";
//        findOccurance(str,0,'a');


//        String str = "Sandeep Sharma";
//        reversingString(str,str.length()-1);


        int n = 3;////////
      towerOfHanoi(n,"S","H","D");


    }


    public static String[] keypad = {" ",".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void keypadCombination(String str,int idx ,String combination ){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for(int i = 0 ;i<mapping.length();i++){
            keypadCombination(str,idx+1,combination+mapping.charAt(i));
        }
    }








    public static void uniqueSubsequenceOfString(String str, int idx ,String newString, HashSet<String> set){
            if(idx==str.length()){
                if(set.contains(newString)){
                    return;
                } else {
                    System.out.println(newString);
                    set.add(newString);
                    return;
                }
            }
            char currChar = str.charAt(idx);
            // to be
            uniqueSubsequenceOfString(str,idx+1,newString+currChar,set);
            // not to be
            uniqueSubsequenceOfString(str,idx+1,newString,set);
    }








    public static void subsequenceOfString(String str, int idx ,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // to be
        subsequenceOfString(str,idx+1,newString+currChar);
        // not to be
        subsequenceOfString(str,idx+1,newString);
    }








    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str, int idx ,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar- 'a']){
            removeDuplicates(str,idx+1,newString);
        } else {
            newString+=currChar;
            map[currChar-'a']= true;
            removeDuplicates(str,idx+1,newString);
        }

    }









    public static void moveAllX(String str,int idx ,int count ,String newString){
        if(idx==str.length()){
            for(int i = 0 ;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveAllX(str,idx+1,count,newString);
        } else {
            newString+=currChar; // new String = new String + currChar;
            moveAllX(str,idx+1,count,newString);
        }
    }








    public static boolean checkSortedStrictlyIncreasing(int[] arr , int idx ){
        if(idx==arr.length-1){
            return true ;
        }
        if(arr[idx]<arr[idx+1]){
            // array is sorted till now
            return checkSortedStrictlyIncreasing(arr,idx+1);
        } else {
            return false ;
        }
    }









    public static int first = -1;
    public static int last  = -1;
    public static void findOccurance(String str,int idx ,char element ){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar==element){
            if(first==-1){
                first=idx;
            } else {
                last=idx;
            }
        }

        findOccurance(str,idx+1,element);
    }







    public static void reversingString(String str, int idx ){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reversingString(str,idx-1);
    }






    public static void towerOfHanoi(int n , String src , String helper , String dest){
        if(n==1){
            System.out.println("transfer disk "+n+" form "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("transfer disk "+n+" form "+src+" to "+dest);
        towerOfHanoi(n-1,helper,src,dest);
    }
}
