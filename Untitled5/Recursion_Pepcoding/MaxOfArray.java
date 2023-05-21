package Recursion_Pepcoding;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = {50, 7, 1, 41, 3, 90, 11, 80};
//        maximum(arr,0);
//        System.out.println(ans);

        System.out.println(maximumArr(arr,0));
    }
    static int ans = 0 ;
    public static void maximum(int[] arr , int n ){
        if(n == arr.length){
            return;
        }
        if(arr[n] > ans){
            ans = arr[n];
        }
        maximum(arr,n+1);
    }
    public static int maximumArr(int[] arr , int n ){
        if(n == arr.length){
            return 0;
        }
        int max = maximumArr(arr,n+1);
        return Math.max(arr[n], max);

    }
}
