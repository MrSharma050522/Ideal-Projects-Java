package Char_Lectures;
/*
Given an array of size n - 1 such that it only contain distinct integer in the range 1 to N .
Find the missing number

n = 5
{1, 2, 3, 5}
missing no : 4

n = 6
{ 1, 4, 6, 2, 3}
missing no : 5

array =  size = 5
n = 6
1 2 3 4 5 6 = sum1

{1 4 6 2 3} = sum2
sum1 - sum2 = missing number

 */

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2, 3};
        System.out.println(missingNo(arr));

    }
    public static int missingNo(int[] arr){
        int n = arr.length + 1 ;
        int sum1 = (n * ( n + 1 ))/ 2 ;
        int sum2 = 0 ;
        for ( int i = 0 ; i < arr.length; i++){
            sum2 = sum2 + arr[i];

        }
        return sum1 - sum2;

    }
}
