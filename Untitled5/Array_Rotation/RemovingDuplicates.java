package Array_Rotation;

import java.util.Arrays;
import java.util.Scanner;

public class RemovingDuplicates {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {2,3,4,6,1,2,3,4,6,7,8,4,5,6,7};
        Arrays.sort(arr);
        int n = arr.length;
        n=removeDup(arr,n);
        for(int i = 0 ;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int removeDup(int[] arr,int n){
        if(n==0||n==1){
            return n;
        }
        int[] temp = new int[n];
        int j=0;
        for(int i = 0 ;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j++]=arr[i];
            }
        }
        temp[j++]=arr[n-1];
        for(int i = 0 ;i<j;i++){
            arr[i]=temp[i];
        }
        return j ;
    }
}
