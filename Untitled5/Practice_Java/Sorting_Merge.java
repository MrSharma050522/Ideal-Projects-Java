package Practice_Java;
// Merge sort ;

public class Sorting_Merge {
    public static void main(String[] args) {
        int[] arr = {4,6,8,0,4,3,8,9,2,3,5,7};
        mergeSort(arr,0,arr.length-1);
        for(int i = 0 ;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int[] arr, int s , int e){
        if(s>=e){
            return ;
        }
        int mid = s+(e-s)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);
        mergeArray( arr, s , mid , e);
        return ;
    }

    public static void mergeArray(int[] arr, int s ,int mid ,int e) {
        int[] merge = new int[e-s+1];
        int idx1=s;
        int idx2=mid+1;
        int idx = 0 ;
        while (idx1<=mid&&idx2<=e){
            if(arr[idx1]<arr[idx2]){
                merge[idx++]=arr[idx1++];
            }
            else {
                merge[idx++]=arr[idx2++];
            }
        }
        while (idx1<=mid) {
            merge[idx++] = arr[idx1++];
        }
        while(idx2<=e) {
            merge[idx++] = arr[idx2++];
        }
        for(int i =0;i<merge.length;i++) {
            arr[i + s] = merge[i];
        }

    }
}
