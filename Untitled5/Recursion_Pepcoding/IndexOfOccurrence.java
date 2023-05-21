package Recursion_Pepcoding;

import java.util.Scanner;

public class IndexOfOccurrence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int d = s.nextInt();
        System.out.println(firstIndex(arr,0,d));
        System.out.println(firstIndex2(arr,0,d));
        System.out.println(lastIndex(arr,n-1,d));
        System.out.println(lastIndex2(arr,0,d));
    }

    public static int firstIndex(int[] arr, int i, int d) {
        if(i == arr.length){
            return -1;
        }
        int res = firstIndex(arr,i+1,d);
        if(arr[i] == d){
            return i;
        }else {
            return res;
        }
    }
    public static int firstIndex2(int[] arr ,int i , int d ){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == d){
            return i;
        }else {
            return firstIndex2(arr,i+1,d);
        }
    }
    public static int lastIndex(int[] arr , int i , int d ){
        if(i < 0){
            return -1;
        }
        if(arr[i] == d){
            return i;
        }else {
            return lastIndex(arr,i-1,d);
        }
    }
    private static int lastIndex2(int[] arr, int i, int d) {
        if(i == arr.length){
            return -1;
        }
        int res = lastIndex2(arr,i+1,d);
        if(res == -1){
            if(arr[i] == d){
                return i;
            }else {
                return -1;
            }
        } else {
            return res;
        }
    }
}
