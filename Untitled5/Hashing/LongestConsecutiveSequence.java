package Hashing;

import com.sun.security.jgss.GSSUtil;

import java.util.HashMap;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length ;i++){
            arr[i]=s.nextInt();
        }
//        int[] arr = {10  5  9 1  11   8  6  15  3  12 2};
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int val : arr) {
            map.put(val, true);
        }
        for (int val : arr) {
            if (map.containsKey(val - 1)) {
                map.put(val, false);
            }
        }
        int msp = 0;
        int ml = 0;
        for (int val : arr) {
            if (map.get(val) == true) {
                int tl = 1;
                int tsp = val;
                while (map.containsKey(tsp + tl)) {
                    tl++;
                }
                if (tl > ml) {
                    msp = tsp;
                    ml = tl;
                }
            }
        }
        for (int i = 0; i < ml; i++) {
            System.out.print(msp + i + " ");
        }
    }



}
