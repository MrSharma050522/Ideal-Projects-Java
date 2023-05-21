package Hashing;
import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // unordered and unique collection does not contains duplicates
        // Adding element to he set using add() method

        set.add("Sandeep");
        set.add("D");
        set.add("F");
        set.add("W");
        set.add("Z");
        set.add("Sharma");
        set.add("Aniket");
        set.add("Tanmay");
        set.add("Sharma");
        System.out.println(set);
        // checking whether a element is present or not
        System.out.println(set.contains("Sharma"));
        System.out.println(set.contains("Dani"));
        set.remove("Sharma");
        System.out.println(set);
        // Iterating through the Set
        for(String i : set){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // Here Iterator is being used
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("------------------------------------------------------------------------");

        Set<Integer> a = new HashSet<>();

        // adding all element to list
        // Arrays.asList() gives you a brand new list, but its not the usual type of ArrayList.
        // It's a special type of list with a fixed size array underneath, which means you can't add or remove elements in it.
        // It's stuck at the original size of coins although you can modify the values in it.

        a.addAll(Arrays.asList(new Integer[] {1,3,2,4,8,9,0}));
        Set<Integer> b = new HashSet<>();
        b.addAll(Arrays.asList(new Integer[] {1,3,7,5,4,0,7,5}));

        // To find union

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println(union);

        // To find intersection
        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println(intersection);

        // To find the symmetric difference -> here it removes all the elements of b  which are present in a
        // means jo b me hoga vaisa element a se hata dega
        Set<Integer> differnce = new HashSet<>(a);
        differnce.removeAll(b);
        System.out.println(differnce);

        System.out.println("------------------------------------------------------------------------");

        // Linked HashSet
        /*
        When the iteration order is needed to be maintained this class is used.
        When iterating through a HashSet the order is unpredictable,
        while a LinkedHashSet lets us iterate through the elements in the order in which they were inserted.
         */

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("India ");
        linkedHashSet.add("Australia ");
        linkedHashSet.add("England");
        linkedHashSet.add("America");

        // adding duplicates but will not be added
        linkedHashSet.add("England");

        System.out.println(linkedHashSet);
        // removing item
        linkedHashSet.remove("England");

        System.out.println(linkedHashSet);
        // // Iterating over linked hash set items
        Iterator<String> i = linkedHashSet.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("------------------------------------------------------------------------");


        // Tree Set
        /*
        It behaves like a simple set with the exception that it stores elements in a sorted format.
        TreeSet uses a tree data structure for storage. Objects are stored in sorted, ascending order.
        But we can iterate in descending order using the method TreeSet.descendingIterator()

        Iterator<Integer>
                iterator = treeSet.descendingIterator();
         */

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Mango");
        treeSet.add("PineApple");
        treeSet.add("Apple");
        treeSet.add("Pomegranate");
        treeSet.add("Orange");
        treeSet.add("Banana");
        System.out.println(treeSet);




        // All the methods of Sets are also applied here but the only difference is
        // that it is in sorted manner




    }
}
