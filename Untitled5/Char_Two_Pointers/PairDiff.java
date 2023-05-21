package Char_Two_Pointers;
/*
Given an one-dimensional unsorted array A containing N integers.

You are also given an integer B, find if there exists a pair of elements in the array whose difference is B.

Return 1 if any such pair exists else return 0.

Example Input
Input 1:

 A = [5, 10, 3, 2, 50, 80]
 B = 78
Input 2:

 A = [-10, 20]
 B = 30

Example Output
Output 1: 1
Output 2: 1

Example Explanation
Explanation 1:

 Pair (80, 2) gives a difference of 78.
Explanation 2:

 Pair (20, -10) gives a difference of 30 i.e 20 - (-10) => 20 + 10 => 30
 */


public class PairDiff {

    public static void main(String[] args) {
        int[] arr = {-10 ,20};
        int[] arr1 = sortedArray(arr);   //{2 3 5 10 50 80 }
        System.out.println(checkDiff(arr1,32));
        System.out.println(checkDiff(arr1,40));
        System.out.println(checkDiff(arr1,78));
        System.out.println(checkDiff(arr1,-30));
        System.out.println(checkDiff(arr1,2));
        System.out.println(checkDiff(arr1,30));







    }
    public static int[] sortedArray(int[] arr){
        int n = arr.length;
        for (int i = 0 ; i < n-1 ; i++){
            for ( int j = 0 ; j < n- i -1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;

    }
    //[2, 3, 5, 10, 50, 80]
    public static boolean checkDiff(int[]arr, int B){
        int size = arr.length;
        int i = 0 ;
        int j = 1 ;

        while ( i<size && j<size ){

            if ((i != j) && (arr[j] - arr[i]) == B || arr[i] - arr[j] == B){
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
