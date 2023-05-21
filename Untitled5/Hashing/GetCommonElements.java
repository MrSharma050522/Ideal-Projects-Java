package Hashing;

import java.util.HashMap;

public class GetCommonElements {
    public static void main(String[] args) {
        int[] a1 = {1,1,2,2,2,3,5};
        int[] a2 = {1,1,1,2,2,4,5};
        HashMap<Integer,Integer> fmap = new HashMap<>();
        for(int i : a1){
            if(fmap.containsKey(i)){
                int of = fmap.get(i);
                int nf = of +1;
                fmap.put(i,nf);
            } else{
                fmap.put(i,1);
            }
        }
        for(int j :a2){
            if(fmap.containsKey(j)){
                System.out.print(j+" ");
                fmap.remove(j);
            }
        }
    }
}
