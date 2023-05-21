package Practice_Java;

import java.util.Scanner;

public class Sorting_QuickSort {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=s.nextInt();
        }
        quickSortr(arr,0,arr.length-1);


        int k = s.nextInt();
        int sum = 0 ;
        for(int i =n-k;i<n;i++){
            int sq = arr[i]*arr[i];
            sum = sum+sq;
        }
        System.out.println(sum);
    }
    private static void quickSortr(int[] arr, int low , int high ){
        if(low<high){
            int pivotIdx = partition(arr,low , high);

            quickSortr(arr,low,pivotIdx-1);
            quickSortr(arr,pivotIdx+1,high);
        }
    }
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                // swap
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i; // pivot index
    }
}
