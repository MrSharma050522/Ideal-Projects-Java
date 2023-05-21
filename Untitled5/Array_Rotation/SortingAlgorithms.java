package Array_Rotation;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] arr = {64,25,12,22,11,5,2,7,9,1,6,8};
//        selectionSort(arr);
//        bubbleSort(arr);
//        insertionSort(arr);
//        mergeSort(arr,0, arr.length-1);
//        printArray("Merge Sort",arr);
        quickSort(arr,0, arr.length-1);
        printArray("Quick Sort",arr);
    }

    public static void printArray(String typeOfSort,int[] arr){
        System.out.println(typeOfSort);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[minIndex]) minIndex = j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        printArray("Selection Sort",arr);
    }

    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray("Bubble Sort",arr);
    }

    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArray("Insertion Sort",arr);
    }
    public static void mergeSort(int[] arr, int s , int e){
        if(s >= e){
            return;
        }
        int mid = (s+e)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);
        mergeArray(arr,s,mid,e);
    }
    public static void mergeArray(int[] arr , int s, int mid , int e){
        int[] mergedArr = new int[e-s+1];
        int i=s;
        int j=mid+1;
        int idx = 0;
        while(i <= mid && j <= e){
            if(arr[i] <= arr[j]){
                mergedArr[idx++] = arr[i++];
            }else {
                mergedArr[idx++] = arr[j++];
            }
        }
        while(i<=mid){
            mergedArr[idx++] = arr[i++];
        }
        while(j<=e){
            mergedArr[idx++] = arr[j++];
        }
        for(int k=0;k<mergedArr.length;k++){
            arr[s+k] = mergedArr[k];
        }
    }
    public static void quickSort(int[] arr, int low , int high){
        if(low < high){
            int pivotIndex = partition(arr,low,high);

            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }
    public static int partition(int[] arr, int low , int high){
        int pivot = arr[high];
        int i = low - 1;

        for(int j=low ;j<high;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
}
