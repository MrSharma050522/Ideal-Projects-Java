package Array_Rotation;

import java.util.Scanner;

public class ArrangingPositiveNegative {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for(int i = 0 ;i<n;i++){
            arr[i]=s.nextInt();
        }
        int k = 0 ;
        for(int j = 0 ;j<n;j++){
            if(arr[j]>0){
                arr1[k++]=arr[j];
            }
        }
        for(int l = 0 ;l<n;l++){
            if(arr[l]<0){
                arr1[k++]=arr[l];
            }
        }
        for(int a = 0 ;a<n;a++){
            System.out.print(arr1[a]+" ");
        }

    }
}
/*
10
1 2 -3 23 -12 3 6 9 -13 2

1 2 23 3 6 9 2 -3 -12 -13
 */
