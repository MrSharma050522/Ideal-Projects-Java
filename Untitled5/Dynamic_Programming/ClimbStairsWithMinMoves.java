package Dynamic_Programming;

import java.util.Scanner;

public class ClimbStairsWithMinMoves {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        Integer[] dp = new Integer[n+1];
        dp[n]=0;
        for (int i = n-1 ; i>=0 ;i--){
            if (arr[i] > 0 ){
                int min = Integer.MAX_VALUE;
                for (int j = 1;j<=arr[i] && i+j < dp.length ;j++){
                    if(dp[i+j] != null){
                        min = Math.min(min , dp[i+j]);
                    }
                }
                if(min != Integer.MAX_VALUE){
                    dp[i] = min+1;
                }
            }
        }
        System.out.println(dp[0]);
    }
}
// Input : 10 1 1 1 4 9 8 1 1 10 1
// Output : 5

