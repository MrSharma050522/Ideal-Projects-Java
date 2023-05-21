public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,3,4,3};
        int n = arr.length;
        mergeSort(arr,0,arr.length-1);
        for(int i = 0 ;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] mergeSort(int[] arr, int s , int e){
        if(s>=e){
            return arr;
        }
        int mid=s+(e-s)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);
        mergingArray(arr,s,mid,e);
        return arr;
    }
    public static void mergingArray(int[] arr,int s ,int mid,int e){
        int[] mergedArray = new int[e-s+1];
        int i = s;
        int j = mid+1;
        int idx = 0;
        while(i<=mid&&j<=e){
            if(arr[i] <= arr[j]){
                mergedArray[idx++] = arr[i++];
            } else {
                mergedArray[idx++] = arr[j++];
            }
        }
        while (i <= mid){
            mergedArray[idx++]=arr[i++];
        }
        while(j<=e){
            mergedArray[idx++]=arr[j++];
        }
        for (int k = 0 ;k<mergedArray.length;k++){
            arr[s+k]=mergedArray[k];
        }
    }
}
