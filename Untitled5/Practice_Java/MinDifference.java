package Practice_Java;

import java.util.HashMap;
import java.util.Scanner;

public class MinDifference {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            int k = s.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i]=s.nextInt();
            }
            int[] mindiff = new int[n];
            HashMap<Integer,Integer> set = new HashMap<>();
            for(int i = 0 ;i<n;i++){
                if(k>arr[i]){
                    mindiff[i]=k-arr[i];
                    set.put(mindiff[i],arr[i]);
                } else{
                    mindiff[i]=arr[i]-k;
                    set.put(mindiff[i],arr[i]);
                }
            }
            for(int i :set.values()){
                System.out.print(i+" ");
            } System.out.println();





        }
    }
}
