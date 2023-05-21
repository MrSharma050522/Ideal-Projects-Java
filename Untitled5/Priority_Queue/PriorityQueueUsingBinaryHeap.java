package Priority_Queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PriorityQueueUsingBinaryHeap {
    public static class PriorityQueue {
        ArrayList<Integer> arr;

        public PriorityQueue() {
            arr = new ArrayList<>();
        }


        public void add(int val) {
            arr.add(val);
            upHeapify(arr.size()-1);
        }


        private void upHeapify(int i ){
            int pi = (i-1)/2;
            if(arr.get(i)<arr.get(pi)){
                swap(i,pi);
                upHeapify(pi);
            }
        }


        private void swap(int i , int j ){
            int ith = arr.get(i);
            int jth = arr.get(j);
            arr.set(i,jth);
            arr.set(j,ith);
        }


        public int remove() {
            // write your code here
            if(this.size() == 0 ){
                System.out.println("Underflow");
                return -1;
            }
            swap(0,arr.size()-1);
            int val = arr.remove(arr.size()-1);
            downHeapify(0);
            return val;
        }


        private void downHeapify(int pi){
            int minIdx = pi;
            int li = (2 * pi) + 1;
            if(li < arr.size() && arr.get(li) < arr.get(minIdx)){
                minIdx = li ;
            }
            int ri = (2 * pi) + 2;
            if(ri < arr.size() && arr.get(ri) < arr.get(minIdx)){
                minIdx = ri ;
            }
            if(minIdx != pi){
                swap(pi,minIdx);
                downHeapify(minIdx);
            }

        }


        public int peek() {
            if(this.size() == 0){
                System.out.println("Underflow");
                return -1;
            } return arr.get(0);
        }


        public int size() {
            return arr.size();
        }

    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue qu = new PriorityQueue();

        String str = br.readLine();
        while (!str.equals("quit")) {
            if (str.startsWith("add")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if (str.startsWith("remove")) {
                int val = qu.remove();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("peek")) {
                int val = qu.peek();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(qu.size());
            }
            str = br.readLine();

        }
    }
}
/*
User Input is like this
add 10
add 30
add 3
add 76
add 23
remove
-3
peek
-10
size
-4
add 1
add 4
add 6
add 8
peek
-1
remove
-1
peek
-4
size
-7
quit
 */
