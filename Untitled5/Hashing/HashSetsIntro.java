package Hashing;

import java.util.HashSet;

public class HashSetsIntro {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(9);
        numbers.add(9);
        numbers.add(6);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(7);
        numbers.add(8);
        System.out.println(numbers);
        // Check if an Item Exists
        System.out.println(numbers.contains(12));
        // Remove an item
        numbers.remove(4);
        System.out.println(numbers);
        // To remove all items , use the clear() method
        // numbers.clear();
        // HashSet size
        System.out.println(numbers.size());
        // Loop through HashSet
        for(int i : numbers){
            System.out.println(i+" ");
        }
        for(int i = 1 ;i<20;i++){
            if(numbers.contains(i)){
                System.out.println(i+" was found in the set ");
            } else {
                System.out.println(i+" was not found in the set ");
            }
        }



    }
}
