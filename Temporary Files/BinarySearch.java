import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(binarySearch(arr,x));
    }
    public static boolean binarySearch(int[] arr , int x){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start + end) /2 ;
            if( x > arr[mid] ){
                start = mid+1;
            }else if(x < arr[mid] ){
                end = mid-1;
            } else {
                return  true;
            }
        }
        return false;
    }
}
//5 6
//1 5 8 6 9
