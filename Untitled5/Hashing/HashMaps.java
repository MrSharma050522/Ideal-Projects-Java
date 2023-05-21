package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps {
    public static void main(String[] args) {
        // Creating a hashmap object called capitalCities
        HashMap<String ,String > capitalCities = new HashMap<>();

        // Adding keys and value (State , City )
        capitalCities.put("Uttar Pradesh","Lucknow");
        capitalCities.put("Maharashtra","Mumbai");
        capitalCities.put("Bihar","Patna");
        capitalCities.put("Goa","Panaji");
        capitalCities.put("West Bengal","Kolkata");
        capitalCities.put("Rajasthan","Jaipur");
        capitalCities.put("Bihar","Patna");
        capitalCities.put("Uttar Pradesh","Lucknow");
        System.out.println(capitalCities);
        // to Access an item
        System.out.println(capitalCities.get("Bihar"));
        // to Remove an item
        capitalCities.remove("Bihar");
        System.out.println(capitalCities);
        System.out.println(capitalCities.containsKey("Rajasthan "));
        // to Remove all items
//        capitalCities.clear();
//        System.out.println(capitalCities);
        // Hash Map size

        System.out.println( capitalCities.size());
        Set<String> keys = capitalCities.keySet();
        System.out.println(keys);
        for(String key : capitalCities.keySet()){
            String val = capitalCities.get(key);
            System.out.println(key+ " -> "+ val);
        }
        // Loop through a HashMaps
        for(String i :capitalCities.keySet()){
            System.out.println(i);
        }
        for (String i : capitalCities.values()){
            System.out.println(i);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        HashMap<String , Integer> people = new HashMap<>();
        people.put("Sandeep ",22);
        people.put("Priya",24);
        people.put("John",32);
        people.put("Steve",30);
        people.put("Angel",33);
        for(String i : people.keySet()){
            System.out.println("Name: "+i+","+" Age: "+people.get(i));
        }
        for(Map.Entry<String ,Integer> ss : people.entrySet()){
            System.out.println(ss.getKey() +"->"+ss.getValue());
        }
    }
}
