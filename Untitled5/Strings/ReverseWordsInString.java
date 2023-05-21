package Strings;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "My name is Sandeep Sharma ";
        char[] arr = reverseWords(str.toCharArray());
        System.out.println(arr);
    }
    public static char[] reverseWords(char[] arr){
        int s = 0 ;
        for(int e =0  ; e< arr.length;e++){
            if(arr[e] == ' '){
                reverse (arr,s,e);
                s = e+1;
            }
        }
        reverse(arr,s,arr.length-1);
        reverse(arr,0,arr.length-1);
        return arr;
    }
    public static void reverse(char[] str ,int start , int end ){
        while (start <= end ){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp ;
            start++;
            end--;
        }
    }
}
