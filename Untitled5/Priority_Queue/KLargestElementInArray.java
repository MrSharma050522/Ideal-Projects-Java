package Priority_Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {3,6,8,67,23,14,56,87};
        int k = 4;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ;i< arr.length;i++){
            if(i<k){
                pq.add(arr[i]);
            } else {
                if(arr[i] > pq.peek()){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        while(!pq.isEmpty()){
            System.out.println(pq.remove());

        }
    }

}
