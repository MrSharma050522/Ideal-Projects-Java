package Hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class ImplementHashMap {
    public static class HashMap<K,V>{
        private K key;



        private class HMNode {
            K key ;
            V value ;

            HMNode (K key , V value ){
                this.key = key  ;
                this.value = value ;
            }
        }
        private int size;//n
        private LinkedList<HashMap.HMNode>[] buckets; // N = buckets.length;
        public HashMap(){
            initialBuckets(4);
            size = 0;
        }
        private void initialBuckets(int N){
            buckets = new LinkedList[N];
            for(int bi = 0 ;bi<buckets.length;bi++){
                buckets[bi] = new LinkedList<>();
            }
        }
        public void put(K key ,V value) throws Exception{
            int bi = hashfn(key);
            int di = getIndexWithinBucket(key, bi );
            if(di != -1){
                HashMap.HMNode node = buckets[bi].get(di);
                node.value = value;
            } else {
                HashMap.HMNode node = new HashMap.HMNode(key, value);
                buckets[bi].add(node);
                size++;
            }
            double lambda = size * 1.0 / buckets.length;
            if(lambda > 2.0){
                rehash();
            }
        }
        private  void rehash() throws Exception{
            LinkedList<HashMap.HMNode>[] oba = buckets;
            initialBuckets(oba.length * 2);
            size = 0 ;
            for(int i = 0 ;i<oba.length;i++){
                for(HashMap.HMNode node : oba[i]){
                    put((K) node.key, (V) node.value);
                }
            }
        }
        private int hashfn(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }
        private int getIndexWithinBucket(K key, int bi ){
            int di = 0 ;
            for(HashMap.HMNode node : buckets[bi]){
                if(node.key.equals(key)){
                    return di ;
                }
                di++;
            }
            return -1;
        }

        public boolean containsKey(K key){
            int bi = hashfn(key);
            int di = getIndexWithinBucket(key, bi );
            if(di != -1){
                return true;
            } else {
                return false ;
            }
        }
        public V get(K key) throws Exception{
            int bi = hashfn(key);
            int di = getIndexWithinBucket(key, bi );
            if(di != -1){
                HashMap.HMNode node = buckets[bi].get(di);
                return (V) node.value;
            } else {
                return null;
            }
        }
        public V remove(K Key) throws Exception{
            int bi = hashfn(key);
            int di = getIndexWithinBucket(key, bi );
            if(di != -1){
                HashMap.HMNode node = buckets[bi].get(di);
                buckets[bi].remove(di);
                size--;
                return (V) node.value;
            } else {
                return null;
            }
        }
        public ArrayList<K> keyset() throws Exception{
            ArrayList<K> keys = new ArrayList<K>();

            for (int i = 0 ;i<buckets.length;i++){
                for(HashMap.HMNode node : buckets[i]){
                    keys.add((K) node.key);
                }
            }
            return keys;

        }
        public void display() {
            System.out.println("Display Begins");
            for (int bi = 0; bi < buckets.length; bi++) {
                System.out.print("Bucket" + bi + " ");
                for (HashMap.HMNode node : buckets[bi]) {
                    System.out.print( node.key + "@" + node.value + " ");
                }
                System.out.println(".");
            }
            System.out.println("Display Ends");
        }
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("put")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                Integer val = Integer.parseInt(parts[2]);
                map.put(key, val);
            } else if (str.startsWith("get")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.get(key));
            } else if (str.startsWith("containsKey")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.containsKey(key));
            } else if (str.startsWith("remove")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.remove(key));
            } else if (str.startsWith("size")) {
                System.out.println(map.size);
            } else if (str.startsWith("keyset")) {
                System.out.println(map.keyset());
            } else if (str.startsWith("display")) {
                map.display();
            }
            str = br.readLine();
        }
    }
}
/*
put india 135
put pak 80
put china 200
put us 10
put uk 20
put aus 5
put canada 3
put utopia 0
put nigeria 3
put india 138
put sweden 1

 */