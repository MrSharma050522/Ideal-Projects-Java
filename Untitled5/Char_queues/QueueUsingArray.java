package Char_queues;

public class QueueUsingArray {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear = -1;
        Queue(int n){
            arr = new int[n];
            this.size = n;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        // enqueue
        public static void add(int data){
            if(rear == size-1){
                System.out.println("full queue");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        // dequeue
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front = arr[0];
            for(int i = 0 ;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        // peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue(6);
        queue.add(1);
        queue.add(2);
        queue.add(6);
        queue.add(8);
        queue.add(5);
        queue.add(3);
        queue.add(7);
        queue.add(4);
        queue.add(9);
        System.out.println(queue.isEmpty());
        System.out.println(queue.remove());
        System.out.println(queue.size);
        System.out.println(queue.isEmpty());
        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
