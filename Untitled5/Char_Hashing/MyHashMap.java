package Char_Hashing;
/*
Hashmap :
1. contains (key, value) pair
2. keys must be unique.
3. key and value can be of any data type (Generic data type). Map<Integer, Integer>, Map<Character, Integer>

How can we implement our own hashmap?
Hashmap can be implemented using array.
Input : 1 true, 2 false, 3 true, 5 false, 2 true, 5 true

Prerequisite : I need to define the size of the array. arr[16]

Steps :
1. Key, value
 */
public class MyHashMap<K, V>  {
    MapNode<K, V>[] bucket;
    int size;

    public MyHashMap() {
        bucket = new MapNode[16];
    }

    public void put(K key, V value) {
        int validIndex = key.hashCode() % bucket.length;
        MapNode<K, V> head = bucket[validIndex];
        MapNode<K, V> prev = null;
        MapNode<K, V> curr = head;
        while (curr != null) {
            // When I need to override the value.
            if (curr.key.equals(key)) {
                curr.value = value;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
        MapNode<K, V> newNode = new MapNode<>(key, value);
        if (prev == null) {
            bucket[validIndex] = newNode;
        } else {
            prev.next = newNode;
        }
        size++;
        double loadFactor = (size * 1.0) / bucket.length;
        if (loadFactor > 0.7) {
            rehash();
        }
    }

    private void rehash() {
        MapNode<K, V>[] data = bucket;
        bucket = new MapNode[2 * data.length];

        // Copying all the elements of data array in my bucket array.
        for (MapNode<K, V> head : data) {
            while (head != null) {
                put(head.key, head.value);
            }
        }
    }

    /*
    1. Calculate the validIdx = key.hashCode() % bucket.length
    2. Go to that idx, traverse the LL on that idx and check whether the key is present or not?
     */
    public boolean containsKey(K key) {
        int validIdx = key.hashCode() % bucket.length;
        MapNode<K, V> head = bucket[validIdx];
        while (head != null) {
            if (head.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public V get(K key) {
        int validIdx = key.hashCode() % bucket.length;
        MapNode<K, V> head = bucket[validIdx];
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        if (!containsKey(key)) {
            return;
        }
        int validIdx = key.hashCode() % bucket.length;
        MapNode<K, V> head = bucket[validIdx];
        if (head.key.equals(key)) {
            bucket[validIdx] = head.next;
            return;
        }
        MapNode<K, V> prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                break;
            }
            prev = head;
            head = head.next;
        }
        prev.next = head.next;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }
}
