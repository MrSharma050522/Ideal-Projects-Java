package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatingElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ;i<n;i++){
            arr[i]=s.nextInt();
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ;i<n;i++){
            int curr = arr[i];
            if(hm.containsKey(curr)){
                int freq = hm.get(curr);
                int updatedFre = freq+1;
                hm.put(curr,updatedFre);
            } else {
                hm.put(curr,1);
            }
        }

        for(Integer i : hm.keySet()){
            if(hm.get(i) == 1){
                System.out.print(i+" ");
            }
        }
    }
}
