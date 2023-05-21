package Array_Rotation;
/*
Finding the second last element of an Array
 */
public class SecondLastEleOfArr {
    public static void main(String[] args) {
         int[] arr ={12, 35, 1, 10, 34, 1};
        System.out.println(bubbleSort(arr,5));



    }
    public static int bubbleSort(int[] arr, int n){
        for (int i = 0 ; i<=n-1;i++){
            for(int j = 0 ;j<=n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr[n-1];

    }
}
