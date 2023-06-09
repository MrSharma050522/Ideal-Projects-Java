package Char_Hashing;

public class DriverClassHashmap <K, V> {
    public static void main(String[] args) {
        MyHashMap<Integer, Boolean> map = new MyHashMap<>();
        map.put(1, false); // {1, false}
        map.put(2, true); // {1, false} {2, true}
        map.put(3, false); // {1, false} {2, true} {3, false}
        map.put(1, true); // {1, true} {2, true} {3, false}
        map.put(2, false); // {1, true} {2, false} {3, false}

        System.out.println(map.containsKey(1)); // true
        System.out.println(map.containsKey(4)); // false
        System.out.println(map.get(2)); // false
        System.out.println(map.get(8)); // null
        map.remove(1); // {2, false} {3, false}
        System.out.println(map.containsKey(1)); // false
        map.put(4, true); // {2, false} {3, false} {4, true}
        map.remove(4); // {2, false} {3, false}
        System.out.println(map.get(4)); // null

        System.out.println("Ok");
    }
}
