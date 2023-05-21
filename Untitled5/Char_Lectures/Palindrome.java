package Char_Lectures;/*
String : aba
Output = true

Naman = Palindrome_Number
Nitin = Palindrome_Number    => read it from starting or end it looks the same
Ayush = false
Kanak = true

str : a b c d c b a
      0 1 2 3 4 5 6
n = str.length()

isPalindrome(str)
if (str.charAt(0) == str.charAt(n-1) {
    return isPalindrome(str.substring(1, n-1))
} else {
    return false ;
}


 */



public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abcdcba"));
        System.out.println(isPalindrome("sandeep"));
        System.out.println(isPalindrome("nitin"));
        System.out.println(isPalindrome("kanak"));
        System.out.println(isPalindrome("ancnba"));
        System.out.println(isPalindrome("ancna"));

    }
    public static boolean isPalindrome(String str){
        // Base case
        if (str.length() <= 1){
            return true;
        }
        // Step 2 and Step 3 :
        if (str.charAt(0) == str.charAt(str.length() - 1)){
            return isPalindrome(str.substring(1, str.length() - 1 ));


        }
        return false;
    }
}
