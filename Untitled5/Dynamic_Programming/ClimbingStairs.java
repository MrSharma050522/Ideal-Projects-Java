package Dynamic_Programming;

import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(countPathsRecursiveApproach(n));
        System.out.println(countPathsDP(n,new int[n+1]));
        System.out.println(countPathsDPTabulation(n));
    }
    public static int countPathsRecursiveApproach(int n){
        if(n == 0){
            return 1;
        }else if (n < 0){
            return 0;
        }

        int nm1 = countPathsRecursiveApproach(n-1);
        int nm2 = countPathsRecursiveApproach(n-2);
        int nm3 = countPathsRecursiveApproach(n-3);
        int count = nm1+nm2+nm3 ;
        return count;
    }
    public static int countPathsDP(int n, int[] qb ){
        if(n == 0){
            return 1;
        }else if (n < 0){
            return 0;
        }
        if(qb[n] != 0 ){
            return qb[n];
        }

        int nm1 = countPathsDP(n-1,qb);
        int nm2 = countPathsDP(n-2,qb);
        int nm3 = countPathsDP(n-3,qb);
        int count = nm1+nm2+nm3 ;
        qb[n]=count;
        return count;
    }

    public static int countPathsDPTabulation(int n ){
        int[] dp = new int[n+1];
        dp[0]=1;
        for (int i =1;i<=n;i++){
            if(i == 1 ){
                dp[i] = dp[i-1];
            }else if(i == 2){
                dp[i] = dp[i-1] + dp[i-2];
            }else {
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
        }
        return dp[n];
    }
}
