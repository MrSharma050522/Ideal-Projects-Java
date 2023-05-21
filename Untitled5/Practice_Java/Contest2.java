package Practice_Java;


import java.util.Arrays;
import java.util.Scanner;

public class Contest2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int k = s.nextInt();
        Arrays.sort(arr);
        if(chesk(arr,k)){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
    }
    public static boolean chesk(int[] arr, int B ){

        int size = arr.length;
        int i = 0 ;
        int j = 1 ;

        while ( i<size && j<size ){
            if ((i != j) && (arr[j] - arr[i]) == B ){
                return true;
            } else if  (arr[j] - arr[i] < B){
                j++;
            } else {
                i++;



            }
        }
        return false;
    }
}
