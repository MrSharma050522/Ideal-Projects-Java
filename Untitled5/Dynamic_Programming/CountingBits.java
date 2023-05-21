package Dynamic_Programming;

import java.util.Scanner;

public class CountingBits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] result = countBits(n);
        for(int i = 0 ;i<n+1;i++){
            System.out.print(result[i]+" ");
        }

    }
    public static int[] countBits(int n ){
        int[] dp = new int[n+1];
        dp[0] = 0;
        if(n == 0){
            return dp;
        }
        dp[1] = 1;
        if(n == 1){
            return dp;
        }
        dp[2] = 1;
        if(n == 2 ){
            return dp;
        }
        for(int i = 3;i<n+1;i++){
            int bit = 0 ;
            if((1&i) != 0 ){
                bit = 1;
            }
            int k = i>>1;
            dp[i] = dp[k] + bit;
        }
        return dp;
    }
}
