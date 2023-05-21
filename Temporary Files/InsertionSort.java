import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i<n;i++){
            arr[i]=s.nextInt();
        }
        for (int i =1;i<n;i++){
            int curr = arr[i];
            int j =i-1;
            while(j>=0 & curr < arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
