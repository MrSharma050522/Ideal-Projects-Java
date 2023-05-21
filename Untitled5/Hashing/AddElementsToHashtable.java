package Hashing;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*
The Hashtable class implements a hash table, which maps keys to values.
Any non-null object can be used as a key or as a value.
To successfully store and retrieve objects from a hashtable,
the objects used as keys must implement the hashCode method and the equals method.

Features of Hashtable

It is similar to HashMaps but is synchronized.
Hashtable stores key/value pair in hash table.
In Hashtable, we specify an object that is used as a key, and the value we want to associate to that key.
The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table.
The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
HashMaps does not provide any Enumeration, while Hashtable provides not fail-fast Enumeration.
 */
public class AddElementsToHashtable {
    public static void main(String[] args) {
        // No need to mention the generic type twice ,
        Hashtable<Integer,String > ht1 = new Hashtable<>();

        //This creates a hash table that has an initial size specified by initialCapacity
        // and the default load factor is 0.75.
        //         Hashtable<Integer, String> ht = new Hashtable<>(4);


        // This version creates a hash table that has an initial size specified by size and fill ratio specified by fillRatio.
        // fill ratio: Basically, it determines how full a hash table can be before
        // it is resized upward and its Value lies between 0.0 to 1.0.
        //      Hashtable<Integer, String> ht = new Hashtable<>(4,0.34f);




        // Initialization of a Hashtable using Generics ,
        Hashtable<Integer,String> ht2 = new Hashtable<Integer,String>(2);

        // Initialization of Hashtable with initial size and fill ratio ,
        Hashtable<Integer,String > ht3 = new Hashtable<>(3,0.89f);

        // Inserting the Elements using .put() method ,
        ht1.put(1,"one");
        ht1.put(2,"two");
        ht1.put(3,"three");

        ht2.put(4,"four");
        ht2.put(5,"five");
        ht2.put(6,"six");
        ht2.put(7,"seven");
        ht2.put(8,"eight");
        ht2.put(9,"nine");
        ht2.put(10,"ten");

        ht3.put(11,"Eleven");
        ht3.put(11,"Eleven");
        ht3.put(11,"Eleven");
        ht3.put(11,"Eleven");
        ht3.put(11,"Eleven");
        ht3.put(11,"Eleven");
        ht3.put(11,"Eleven");
        ht3.put(11,"Eleven");

        // Print mappings to the console ,
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);
        System.out.println("Mappings of ht3 : " + ht3);

        //This creates a hash table that is initialized with the elements in m.
        //      Hashtable<Integer, String> ht = new Hashtable<Integer, String>(Map m);


        // No need to mention the generic type twice ,
        Map<Integer,String> hm = new HashMap<>();

        // Inserting the Elements using .put() method ,

         hm.put(7,"Raju");
         hm.put(6,"Dev");
         hm.put(5,"Rohan");
         hm.put(4,"Sohan");
         hm.put(3,"Kavita");
         hm.put(2,"Shyam");
         hm.put(1,"Ram");
         hm.put(14,"Tripti");
         hm.put(9,"Sunita");

        // Initialization of Hashtable using Generics
        Hashtable<Integer,String> ht4 = new Hashtable<>(hm);

        // Print mappings to the console ,
        System.out.println("Mappings of ht4 : " + ht4);
    }

}

