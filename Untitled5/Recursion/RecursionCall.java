package Recursion;

public class RecursionCall {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        reverse(arr,0,arr.length);
        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(checkPalindrome("12234321",0));

        int n = 5;
        System.out.println(sum(n));
        System.out.println(factorial(n));
    }
    public static int sum (int n ){
        if( n == 0){
            return 0;
        }
        return n + sum(n-1);

    }
    public static int factorial (int n ){
        if( n == 0){
            return 1;
        }
        return n * factorial(n-1);

    }
    public static void reverse(int[] arr , int i , int n ){
        if(i>=n/2) return;
        swap(arr,i,n-i-1);
        reverse(arr,i+1,n);
    }
    public static void swap(int[] arr,int a , int b ){
        int temp = arr[a] ;
        arr[a] = arr[b] ;
        arr[b] = temp;
    }
    public static boolean checkPalindrome(String str,int i ){
        if(i >= str.length()/2){
            return true;
        }
        if(str.charAt(i) != str.charAt(str.length()-1-i)){
            return false;
        }
        return checkPalindrome(str,i+1);
    }


}
