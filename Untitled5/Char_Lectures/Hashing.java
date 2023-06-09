package Char_Lectures;

/*
Hashing :
arr : {1, 2, 3, 1, 2, 4, 3, 2}
Count the frequency of each element.
1 -> 2
2 -> 3
3 -> 2
4 -> 1
Count the frequency of 3 in the given array. - O(n)
Count the frequency of each element - O(n ^ 2)

Hashing concept ->
Count the frequency of 3 in the given array - O(1)
Count the frequency of each element - O(n)

Hashing : key value pair data structure which reduces the search time complexity.

Brute force : O(n ^ 2)

Hashing :
1. key value pair.
2. data structure which looks like a table and has key and a value
3. Key will always be the unique element of the array.
4. Value is something which we can manipulate for our own problem.

arr : {1, 2, 3, 1, 2, 4, 3, 2}

Hashmap:
key value(freq)
1      2
2      3
3      2
4      1

Hashmap -> which allows us to use hashing concept.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing {
    public static void main(String[] args) {
        /*
    How exactly can we implement a hashing.
     */
        int[] arr = {1, 2, 3, 1, 2, 4, 3, 2};
        implementHashMap(arr);
    }

    public static void implementHashMap(int[] arr) {
        /*
        freqMap.put(1, 2)
        freqMap.put(2, 1)
        freqMap.put(3, 1)
        freqMap.put(1, 8)
        arr = {1, 2, 3, 1, 2, 4, 3, 2}
        currEl = 1, 2, 3, 1
        freqMap:

        key(el of array, int)     value(freq of el of array, int)
        2                            1
        1                            2
        3                            1
         */
        Map<Integer, Integer> freqMap = new HashMap<>();
        // O(n)
        for (int i = 0; i < arr.length; i++) {
            int currElement = arr[i];
            if (freqMap.containsKey(currElement)) {
                int freq = freqMap.get(currElement); // freq = 1
                freq = freq + 1; // freq = 2
                freqMap.put(currElement, freq);
            } else {
                freqMap.put(currElement, 1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " -> " + freqMap.get(arr[i]));
        }

        System.out.println("*****************************");

        // Traversal of hashmap.
        /*
        1. Store the keys somewhere
        2. Traverse the keys.
        key value
        1    2
        2    3
        3    2
        4    1
        Step 1 : {1, 2, 3, 4}
        Set data structure.
        [ Set is like an arraylist but it contains unique elements ]
        Step 2:
         */
        // freqMap = {1 , 2    2, 3     3,2    4, 1}
        // freqMap.keySet() = {1, 2, 3, 4}
        Set<Integer> set = freqMap.keySet();

        /*
        For each loop
         */
        for (int key : set) {
            System.out.println(key + " -> " + freqMap.get(key));
        }
    }

}
