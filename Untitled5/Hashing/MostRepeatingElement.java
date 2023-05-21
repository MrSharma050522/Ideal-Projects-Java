package Hashing;/*
Given an array of integers, find the most frequent element of the array.

[2,1,3,3,8,5,0,9,5,12,5]

ans : 5
 */

import java.util.HashMap;

public class MostRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {2,1,3,3,8,5,0,9,5,12,5};
        int n = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ;i<n;i++){
            int curr = arr[i];
            if(hm.containsKey(curr)){
                int freq = hm.get(curr);
                int updatedFre = freq+1;
                hm.put(curr,updatedFre);
            } else {
                hm.put(curr,1);
            }
        }
        int repe = arr[0];
        for(Integer i : hm.keySet()){
            if(hm.get(i) > hm.get(repe)){
                repe = i;
            }
        }
        System.out.println(repe);
    }
}
