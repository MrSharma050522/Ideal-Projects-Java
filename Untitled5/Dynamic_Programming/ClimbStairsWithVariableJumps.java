package Dynamic_Programming;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class ClimbStairsWithVariableJumps {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i =0;i< arr.length;i++){
            arr[i] = s.nextInt();
        }

        int[] dp = new int[n+1];
        dp[n] = 1;
        for (int i = n-1;i >=0 ;i--){
            for (int j=1;j<=arr[i] && i+j < dp.length; j++){
                dp[i] += dp[i+j];
            }
        }
        System.out.println(dp[0]);

    }
}
// Input : 13
//         5 5 2 4 1 5 9 8 6 3 8 9 1
// Output : 2044
