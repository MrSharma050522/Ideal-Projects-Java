package Recursion_Pepcoding;

import java.util.Scanner;

public class TargetSumSubset {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int tar = s.nextInt();
        printTargetSum(arr,0,"",0,tar);
    }
    public static void printTargetSum(int[] arr , int i , String set , int sos , int tar){
        if( i == arr.length){
            if(sos == tar){
                System.out.println(set+".");
            }
            return;
        }
        printTargetSum(arr,i+1,set+arr[i]+"," , sos+arr[i],tar);
        printTargetSum(arr,i+1,set,sos,tar);
    }
}
