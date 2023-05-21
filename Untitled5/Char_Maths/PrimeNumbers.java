package Char_Maths;
/*
Check whether a no is prime or not?
Prime no : which is only divisible by 1 and the no itself.
Ip : 14 - false
Ip : 17 - true

17 : only divisible 1 and 17
Loop from i = {2 - 16(n - 1)} and check whether the number is divisible by i.

17
17 % 16 == 0? never
17 % 15 == 0? never
80, 40 is the largest number which can divide number
2 - (n-1)
2 - n/2

Solve this problem in O(sqrt(n)) time complexity.

40 :
40 % 2 == 0, do we need to check whether 40 is divisible by 20.
60 % 5 == 0, do I need to check 60 % 12?

Traverse from 2 to sqrt(n) and check whether the no is divisible or not?

Tell me how many numbers between 1 to n are prime.
n = 10, {2, 3, 5, 7} = 4
TC : O(n) * O(sqrt(n))

Try to optimise it.

 */
public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(isPrime1(17));
        System.out.println(isPrime1(14));
        System.out.println("*************");
        System.out.println(isPrime2(17));
        System.out.println(isPrime2(14));
        System.out.println("*************");
        System.out.println(isPrime3(17));
        System.out.println(isPrime3(14));
        System.out.println("*************");
        System.out.println(sieveOfEratosthenes(20));
        System.out.println(sieveOfEratosthenes(30));
    }

    // 20 : 2, 3, 5, 7, 11, 13, 17, 19
    // 30: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29
    // TC : O(nlog(logn))
    public static int sieveOfEratosthenes(int num) {
        boolean[] sieve = new boolean[num + 1];
        // Boolean automatically initialises with false, initialise the array with true
        for (int i = 2; i <= num; i++) {
            sieve[i] = true;
        }
        // i = 3 -> 6, 9, 12, 15, 18............
        // O(n log(logn))
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // if i is prime
            if (sieve[i]) {
                // Make all multiples of i as false
                for (int j = 2 * i; j <= num; j = j + i) {
                    sieve[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (sieve[i]) {
                count += 1;
            }
        }
        return count;
    }

    // TC : O(sqrt(n))
    public static boolean isPrime3(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // TC : O(n / 2) = O(n)
    // SC : O(1)
    public static boolean isPrime2(int num) {
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // TC: O(num)
    // SC: O(1) constant.
    public static boolean isPrime1(int num) {
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
