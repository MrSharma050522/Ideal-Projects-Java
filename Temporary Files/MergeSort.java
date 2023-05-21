import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n] ;
        for(int i = 0 ;i<n;i++){
            arr[i]=s.nextInt();
//            System.out.println(arr[i]);
        }
        sorting(arr, 0 , arr.length-1);
        for (int i = 0 ;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sorting(int[] arr , int s , int e ){
        if(s >= e){
            return;
        }
        int mid = s+(e-s)/2;
        sorting(arr,s,mid);
        sorting(arr,mid+1,e);

        merging(arr,s,mid,e);
        return;
    }
    public static void merging(int[] arr, int s , int mid , int e ){
        int[] merge = new int[e - s +1];
        int idx1 = s ;
        int idx2 = mid+1;
        int idx = 0;
        while(idx1 <= mid && idx2 <= e){
            if(arr[idx1] < arr[idx2]){
                merge[idx++] = arr[idx1++];
            } else {
                merge[idx++] = arr[idx2++];
            }
        }
        while (idx1 <= mid){
            merge[idx++] = arr[idx1++];
        }
        while(idx2 <= e){
            merge[idx++] = arr[idx2++];
        }
        for(int i = 0 ;i<merge.length;i++){
            arr[s+i]=merge[i];
        }
    }

}
