/*
2. [ 1, 45, 5 ,7, 9 , 5]

[ 2,1,5,6,1,9 ]

Find only unique elements from these 2 arary .

Output: [2, 6, 7, 45]
 */

import java.util.TreeSet;

public class UniqueElementOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 45, 5, 7, 9, 5, 0 ,0,0};
        int[] arr2 = {2, 1, 5, 6, 1, 9, -3,0};
        findUniqueElement(arr1,arr2);
    }
    public static void findUniqueElement(int[] arr1, int[] arr2){
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        for(Integer i : arr1){
            if(set1.contains(i))
                set1.remove(i);
            else
                set1.add(i);
        }
        for (Integer i : arr2){
            set2.add(i);
        }
        for(Integer i : arr2){
            if (set1.contains(i)){
                set1.remove(i);
            }
        }
        for(Integer i : arr1){
            if (set2.contains(i)){
                set2.remove(i);
            }
        }
        for (Integer i : set1){
            set2.add(i);
        }
        System.out.println(set2);


    }
}
