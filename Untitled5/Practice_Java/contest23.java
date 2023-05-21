package Practice_Java;

import java.util.Scanner;

public class contest23{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for(int i = 0 ;i<n;i++){
            arr[i]=s.nextInt();
        }
        int x =  0;
        for(int i = 0 ;i<n;i++){
            if(arr[i]%n==0){
                arr1[x++]=arr[i]/n;
            } else{
                arr1[x++]=arr[i];
            }
        }
        for(int i =0;i<n-1;i++){
            if(arr1[i]<arr1[i+1]){
                System.out.println("YES");
                break;
            } else {
                System.out.println("NO");
                break;
            }
        }
    }


}
