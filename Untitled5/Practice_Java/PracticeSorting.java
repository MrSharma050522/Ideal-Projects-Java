package Practice_Java;

public class PracticeSorting {
    public static void main(String[] args) {
        int[] arr = {1,5,3,6,8,36,9,3};
        int[] arr2 = {3,5,2,6,2,7,4,2,6,9};
        BubbleSort(arr);
        selectionSort(arr2);
        for (int i = 0 ;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int i = 0 ;i< arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }



    }
    public static void BubbleSort(int[] arr){
        int  n = arr.length;
         for(int i = 0 ; i< n-1;i++){
             for (int j = 0 ; j<n-1;j++){
                 if (arr[j] > arr[j+1]){
                     swaps(arr,j,j+1);
                 }

             }
         }

    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0 ;i < n;i++){
            int minIdx = -1;
            int minEl = Integer.MAX_VALUE;
            for(int j = i;j < n; j++){
                if(arr[j] < minEl){
                    minEl = arr[j];
                    minIdx = j;
                }
            }
            swaps(arr,i,minIdx);
        }
    }
    public static void swaps(int[] arr, int i,int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
}
