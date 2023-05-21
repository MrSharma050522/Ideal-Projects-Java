package Priority_Queue;

import java.util.Collections;
import java.util.PriorityQueue;
/*
Priority Queue is a heap sort
 */

public class PriorityQueueJCF {
    public static void main(String[] args) {
        // Here priority queue gives priority to smalller values
        PriorityQueue<Integer> pq = new PriorityQueue();

        // For giving priority to larger value we can use her this syntax :
        PriorityQueue<Integer> pqs = new PriorityQueue<>(Collections.reverseOrder() );


        int[] ranks = {22,99,3,11,88,4,1,2,5,12,13,17,20};
        for(int i :ranks){
            pqs.add(i);
        }
        for(int i:ranks){
            pq.add(i);
        }
        while (!pq.isEmpty() ){
            System.out.println(pq.peek()+ " ");
            pq.remove();
        }
        System.out.println("_________________");
        while (!pqs.isEmpty() ){
            System.out.println(pqs.peek()+ " ");
            pqs.remove();
        }
    }
}
