package Bit_Manipulation;
/*
Convert the numbers in binary
3 ->
17 ->
29 ->

Binary no : 0 and 1
Decimal : 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
101001(binary) -> 41(decimal)
Step : Traverse from right to left
1 -> 1 * 2 ^ 0 = 1
0 -> 0 * 2 ^ 1 = 0
0 -> 0 * 2 ^ 2 = 0
1 -> 1 * 2 ^ 3 = 8
0 -> 0 * 2 ^ 4 = 0
1 -> 1 * 2 ^ 5 = 32
1 + 0 + 0 + 8 + 0 + 32 = 41

Is 101 a decimal? yes
Is 101 a binary? yes
Is 321 a binary? No

XOR :
1 or 1 = 1
1 and 1 = 1
0 and 1 = 0
0 and 0 = 0
1 or 0 = 1
0 or 0 = 0

xor(^) : same value answer is 0 and different value ans is 1
1 ^ 0 = 1
0 ^ 1 = 1
1 ^ 1 = 0
0 ^ 0 = 0

 */

public class BitManipulation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 3};
        System.out.println(findUnique(arr));
    }

    /*
    Find the unique element in an array where every element appears twice except one element
    arr : {1, 2, 3, 2, 1, 4, 3}
    1 ^ 2 = 01 ^ 10 = 11 = 3
    3 ^ 3 = 11 ^ 11 = 00 = 0
    0 ^ 2 = 00 ^ 10 = 10 = 2
    2 ^ 1 = 10 ^ 01 = 11 = 3
    3 ^ 4 = 011 ^ 100 = 111 = 7
    7 ^ 3 = 111 ^ 011 = 100 = 4

    6 ^ 2 = 4
    110 ^ 010 = 100 = 4
    ans = 4
    Solve the problem in one traversal and in constant space.
     */

    public static int findUnique(int[] arr) {
        int res = 0;
        for (int i : arr) {
            res = res ^ i;
        }
        return res;
    }
}
