package Assignment_Solutions;

/*
Problem Statement
Given an integer N, in one operation you can subtract any odd divisor from the number other than the number itself.
You have to find the minimum number of operation needed to convert the number to 1.
Input
The input contains a single integer N.

Constraints:-
1 <= N <= 10000
Output
Print the minimum number of operations needed to convert the given number to 1.
Example
Sample Input:-
10

Sample Output:-
5

Explanation:-
10- >5- >4- >3- >2- >1

Sample Input:-
20

Sample Output:-
7

number -> 1
Replace no via its odd divisor rather than the no itself

10

1, 2, 5, 10 (1, 5)

10 - 1 = 9               10 - 5 = 5
9                        1, 5
1, 3                     5 - 1 = 4
9 - 1= 8
9 - 3 = 6

20  - 1, 5,
19 - 1             15 - 1, 3, 5,
18                 14              12          10 -> 1 (5)

20

traverse from 1 to 4
if (20 % 1 == 0)   -> 1 and 20 / 1
if (20 % 2 == 0) -> 2 and 20 / 2
if (20 % 3 == 0) - no
if (20 % 4 == 0) - 4 and 20 / 4


49
1 - 7

(49 % 7 == 0) - 7 and 49/7


20
<1, 5>

19       15

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class YetAnotherReduceTo1Problem {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans = reduceToOne(n);
        System.out.println(ans);
    }

    public static int reduceToOne(int n) {
        if (n <= 1) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        List<Integer> oddDivisors = getOddDivisors(n);
        for (int i = 0; i < oddDivisors.size(); i++) {
            int reducedNumber = n - oddDivisors.get(i);
            int smallAns = reduceToOne(reducedNumber);
            min = Math.min(min, smallAns);
        }
        return min + 1;
    }

    /*
    type of array, size
    int[] arr = new int[size]

    list : type of list,
    List<Integer> list = new ArrayAndLinkedLists<>();
     */
    public static List<Integer> getOddDivisors(int n) {
        List<Integer> oddDivisorsList = new ArrayList<>();
        /*
        n = 20
        i = 1; 1 * 1 <= 20
        i = 2; 2 * 2 <= 20
        i = 3; 3 * 3 < = 20
        i = 4, 16 <= 20 ; i = 5
        i = 5, 25 >= 20
         */
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (isValidDivisor(i, n)) {
                    oddDivisorsList.add(i);
                }
                if (i != (n / i)) {
                    if (isValidDivisor(n / i, n)) {
                        oddDivisorsList.add(n / i);
                    }
                }
            }
        }
        return oddDivisorsList;
    }

    public static boolean isValidDivisor(int divisor, int n) {
        return divisor % 2 != 0 && divisor != n;
    }



}
