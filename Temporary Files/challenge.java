/*
Given an unsorted array of integers, find a subarray that adds to a given number.
If there is more than one subarray with the sum of the given number, print any of them.
Examples:
Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Output: Sum found between indexes 2 and 4
Explanation: Sum of elements between indices
2 and 4 is 20 + 3 + 10 = 33
Input: arr[] = {10, 2, -2, -20, 10}, sum = -10
Output: Sum found between indexes 0 to 3
Explanation: Sum of elements between indices
0 and 3 is 10 + 2 - 2 - 20 = -10
Input: arr[] = {-10, 0, 2, -2, -20, 10}, sum = 20
Output: No subarray with given sum exists
Explanation: There is no subarray with the given sum
 */

import java.util.HashMap;
import java.util.Scanner;

public class challenge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] arr = new int[n];
        for(int i =0 ;i<n;i++){
            arr[i]=s.nextInt();
        }
        givenSum(arr,k);
    }
    public static void givenSum(int[] arr , int k  ){
        int n = arr.length;
        int sum = 0 ;
        int s = 0;
        int e = -1 ;
        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int i = 0 ;i<n;i++){
            sum = sum + arr[i];
            if(sum - k == 0 ){
                s = 0;
                e = i;
                break;
            }
            if (hm.containsKey(sum - k)) {
                s = hm.get(sum-k) + 1;
                e = i ;

            }
            hm.put(sum,i);
        }
        if(e == -1){
            System.out.println("nothing found ");
        }else {
            System.out.println(s +" "+e);
        }

    }

}
