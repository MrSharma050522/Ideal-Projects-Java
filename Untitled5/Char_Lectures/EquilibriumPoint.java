package Char_Lectures;/*
Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum
of elements at higher indexes. For example , in an array A:


Example :
 { -7 , 1, 5, 2, -4, 3, 0}
              |
 right : -4 + 3 + 0 = -1
 left : -7 + 1 + 5 = -1



Input : A[]  = { -7 , 1, 5, 2, -4, 3, 0}
Output : 3
3 is an equilibrium index , because :
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]

Input :A[] = { 1, 2, 3 }
Output :-1;

Approach 1 :
Step 1 : traverse from i = 1 to n - 2  ,    --> where n is length of array and n -1 is last element .
                          a . Find the left sum to index i [ 0th idx : i - 1 ]
                          b . Find the right sum to index i [ i + 1 to n-1 idx ]\
                          c . if leftSum = rightSum , return i .

Approach 2 :
 { -7 , 1, 5, 2, -4, 3, 0}
 totalSum = 0
i = 1 to n - 2


i = 1
leftSum = -7
rightSum = 0- (- 7 ) = 7 - 1 = 6

i = 2
leftSum = - 7 +1 = -6
rightSum = 0 - ( - 6 ) = 6 - 5 = 1

i = 3
leftSum = - 6 + 5 = -1
rightSum = 0 - ( -1 ) - 2 = -1

for any index , we so have leftSum and rightSum .

1 2 3 4 5 6 7 8 9
totalSum = 45
sum from 1 to 5 = 15
sum from 6 to 9 = totalSum - leftSum


totalSumOfArray =
leftSum from 0 to i - 1 =
rightSum from i + 1 to n = totalSumOfArray - leftSum






 */


public class EquilibriumPoint {
    public static void main(String[] args) {
        int[] arr =  { -7 , 1, 5, 2, -4, 3, 0};
        System.out.println(approach1(arr));
        System.out.println(approach2(arr));

    }
    public static int approach2(int[] arr){
        int totalSum = 0 ;
        for ( int i = 0 ; i < arr.length; i++){
            totalSum = totalSum + arr[i];
        }
        int leftSum = arr[0];
        for (int i = 1; i <= arr.length - 2 ; i++){
            int rightSum = totalSum - leftSum - arr[i];
            if ( leftSum == rightSum){
                return i ;
            }
            leftSum = leftSum + arr[i];
        }
        return - 1;
    }

    public static int approach1(int[] arr){
        for (int i = 1 ; i <= arr.length - 2 ; i++){
            int ls = 0 ;
            int rs = 0 ;
            for (int j = 0 ;j <= i - 1; j++){
                ls = ls + arr[j];

            }
            for (int j = i + 1; j <= arr.length - 1; j++){
                rs = rs + arr[j];
            }
            if (ls == rs ){
                return i ;
            }
        }
        return -1;
    }


}
