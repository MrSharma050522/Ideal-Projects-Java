package Apna_College_My_Practice;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {7,8,3,1,2};
        int n = arr.length;
        // Calling
        mergeSort(arr,0, arr.length-1);
        for(int i = 0; i< n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // Dividing
    public static int[] mergeSort(int[] arr, int si , int ei ){
        if(si >=  ei){
            return arr;
        }
        int mid = si + (ei - si )/2;
        mergeSort(arr, si ,mid);
        mergeSort(arr, mid+1, ei);
        mergingArray(arr, si, mid, ei);
        return arr;
    }
    // Conquering
    public static void mergingArray(int[] arr, int si , int mid ,int ei){
        int[] mergedArray = new int[ei-si+1];
        int idx1 = si ;
        int idx2 = mid+1;
        int idx = 0;
        while (idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                mergedArray[idx++] = arr[idx1++];
            } else {
                mergedArray[idx++] = arr[idx2++];
            }
        }
        while (idx1 <= mid){
            mergedArray[idx++] = arr[idx1++];
        }
        while (idx2 <= ei){
            mergedArray[idx++] = arr[idx2++];
        }
        // Copying the element of mergedArray to our original array
        for(int i = 0 ;i< mergedArray.length; i++){
            arr[si+i] = mergedArray[i];
        }



    }
}
