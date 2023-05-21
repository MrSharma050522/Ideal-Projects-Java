package Strings;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(isPalindrome("kanak"));
        System.out.println(isPalindrome("sandeep"));
        System.out.println(isPalindrome("radar"));
        System.out.println(isPalindrome("abcdcba"));
        System.out.println(isPalindrome("shashank"));
    }
    public static boolean isPalindrome(String str ){
        if(str.length() <= 1){
            return true ;
        }
        if(str.charAt(0) == str.charAt(str.length()-1)){
            return isPalindrome(str.substring(1,str.length()-1));
        }
        return false;
    }
}
