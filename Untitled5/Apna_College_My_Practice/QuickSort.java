package Apna_College_My_Practice;
// Quick Sort

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10,80,100,50,30,70};
        int n = arr.length;

        quickSortss(arr,0,n-1);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    private static void quickSortss(int[] arr, int low , int high ){
        if(low<high){
            int pivotIdx = partition(arr,low , high);

            quickSortss(arr,low,pivotIdx-1);
            quickSortss(arr,pivotIdx+1,high);
        }
    }
    private static int partition(int[] arr, int low, int high){
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
