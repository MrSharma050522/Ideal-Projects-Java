package Queue_Data_Structure;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueJCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
//        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        System.out.println("_______");
        System.out.println(q.add(6));
        System.out.println("_______");
        System.out.println(q.add(7));

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
