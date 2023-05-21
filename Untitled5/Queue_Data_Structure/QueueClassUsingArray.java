package Queue_Data_Structure;

public class QueueClassUsingArray {
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
        Queue q = new Queue(6);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        System.out.println(q.isEmpty());
        System.out.println(q.remove());
        System.out.println(q.size);
        System.out.println(q.isEmpty());
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
