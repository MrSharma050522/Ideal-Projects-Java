package Practice_Java;

public class Sorting_Quick {
    public static void main(String[] args) {
        int[] arr = {4,6,8,0,4,3,8,9,2,3,5,7};
        quickSort(arr,0,arr.length-1);
        for(int i = 0 ;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quickSort(int[] arr, int s ,int e ){
        if(s>e){
            return;
        }
        int pivotIdx = partition(arr,s,e);
        quickSort(arr,s,pivotIdx-1);
        quickSort(arr,pivotIdx+1,e);
    }
    public static int partition(int[] arr , int s , int e){
        int pivotEl=arr[e];
        int i = s-1;
        for(int j = s ;j<e;j++){
            if(arr[j]<pivotEl){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i]=arr[e];
        arr[e]=temp ;
        return i;
    }
}
