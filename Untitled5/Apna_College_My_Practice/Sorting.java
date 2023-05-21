package Apna_College_My_Practice;

public class Sorting {
    public static void main(String[] args) {
        int[] arr =  {7,8,3,1,2};
//        bubbleSort(arr);
        int[] arr1 = {64,25,12,22,11};
        arr = arr1;
        selectionSort(arr1);
//        insertionSort(arr);
        int n = arr.length;
        for ( int i =0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    // Insertion Sort :
    public static void insertionSort(int[] arr){
        for(int i = 1; i< arr.length;i++){
            int current = arr[i];
            int j= i - 1;
            while (j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            // placement
            arr[j+1] = current;
        }
    }


    // Selection Sort :
    public static void selectionSort(int[] arr){
        for(int i = 0 ;i<arr.length-1;i++){
            int minIdx = i;

            for(int j = i+1;j< arr.length;j++){
                if(arr[j]<arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;

        }

    }



    //  Bubble Sort :
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


    }


    //Bubble Sort Optimized :
    public static void BubbleSortOptimizedOne(int[] array, int n) {
        for(int i=0; i<n; i++) {
            boolean flag = false;
            for(int j=0; j<n-i-1; j++) {
                if(array[j]>array[j+1]) {
                    flag = true;
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
            // No Swapping happened, array is sorted
            if(!flag){
                return;
            }
        }
    }

}

