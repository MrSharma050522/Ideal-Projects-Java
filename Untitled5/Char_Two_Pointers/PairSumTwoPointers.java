package Char_Two_Pointers;
/*

Two pointers :
It is problem solving technique which we used to majorly solve array problems.

Pair sum :
Given a sorted array
arr : {1, 2, 3, 4, 5, 6, 7, 8, 9}
sum = 10
Output : true
Check whether there exists two elements having the sum equals given sum.
4, 6 = 4 + 6 = 10
3 7 = 10
2 8
1 9

Approaches:
    0 1 2 3 4 5 6 7 8
1. {1 2 3 4 5 6 7  8 9}
for (int i = 0; i < n; i++) {
    for (int j = i + 1; j < n; j++) {
        if (arr[i] + arr[j] == sum) {
           return true;
        }
    }
}
outer loop complexity * inner loop complexity
n * n = n ^ 2
TC : O (n ^ 2)

Can we optimise it?

Approach 2 :
1 2 3 4 5 6 7 8 9
sum = 7

1 2 3 4 5 6 7 8 9
i           j j j

i = 0
j = 8
arr[i] + arr[j] = 10
10 > sum ; j--

i = 0, j = 7
arr[0] + arr[7] = 9
j--

i = 0, j = 6
arr[0] + arr[6] = 8
j--

i = 0 j = 5
arr[0] + arr[5] = 7

Algorithm -
1. Take two pointers i and j
Place i at start
Place j at end

2. Calculate arr[i] + arr[j]
if (arr[i] + arr[j] > sum) j--
else i++

3. If you find arr[i] + arr[j] = sum, return true

n * m  n ^ 2
n + m = n    ,    m
n = 100
m = 50
 */

public class PairSumTwoPointers {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 9, 20};
        System.out.println(checkSum(arr, 13));
        System.out.println(checkSum(arr, 21));
        System.out.println(checkSum(arr, 12));
    }

    // TC : O(n)
    // {1, 2, 3, 4, 5, 6}
    public static boolean checkSum(int[] arr, int givenSum) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int totalSum = arr[i] + arr[j];
            if (totalSum > givenSum) {
                j--;
            } else if (totalSum < givenSum) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }

}
