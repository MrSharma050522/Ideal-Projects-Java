package Array_Rotation;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2,5,7,4,5,6,3,8};
        reverse(arr,arr.length);
    }
    static void reverse(int[] arr, int n ){
        int[] temp = new int[n];
        int j=n;
        for(int i =0;i<n;i++){
            temp[j-1]=arr[i];
            j--;
        }
        for(int i = 0 ;i<n;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
