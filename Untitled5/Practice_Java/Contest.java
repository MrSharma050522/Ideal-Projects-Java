package Practice_Java;

import java.util.Scanner;

public class Contest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t= s.nextInt();
        while(t-->=0){
            int n = s.nextInt();
            System.out.println(getLargestNumber(n));
        }
    }
    static int firstDigit(int n) {
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }
    static int getCount(int n) {
        int count = 0;
        while (n != 0) {
            int leadDigit = firstDigit(n);
            n -= leadDigit;
            count++;
        }
        return count;
    }
    static int getLargestNumber(int k) {
        int left = k;
        int right = k * 10;
        int mid = (left + right) / 2;
        int len = getCount(mid);
        while (len != k) {
            mid = (left + right) / 2;
            len = getCount(mid);
            if (len > k) {
                right = mid;
            } else {
                left = mid;
            }
        }
        while (len == k) {
            if (len != getCount(mid + 1)) {
                break;
            }
            mid++;
        }
        return (mid);
    }
}
// 3 2 20 29
