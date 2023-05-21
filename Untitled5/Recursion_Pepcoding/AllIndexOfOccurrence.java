package Recursion_Pepcoding;

import java.util.Scanner;

public class AllIndexOfOccurrence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int  i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int d = s.nextInt();
        int[] arr2 = occur(arr,d,0,0);
        for (int i = 0 ;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
    public static int[] occur (int[] arr, int d , int i , int fsf){
        if(i == arr.length){
            return new int[fsf];
        }
        int[] iarr;
        if(arr[i] == d){
            iarr = occur(arr, d, i + 1, fsf + 1);
            iarr[fsf] = i;
        }else {
            iarr = occur(arr, d, i + 1, fsf);
        }
        return iarr;

    }
}
