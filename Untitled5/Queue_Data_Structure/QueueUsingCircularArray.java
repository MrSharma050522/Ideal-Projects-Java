package Queue_Data_Structure;

public class QueueUsingCircularArray {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear = -1;
        static int front = -1;
        Queue(int n){
            arr = new int[n];
            this.size = n;
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;

        }
        public static boolean isFull(){
            return (rear+1) % size == front;
        }
        // enqueue
        public static void add(int data){
            if(isFull()){
                System.out.println("full queue");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear]=data;
        }
        // dequeue
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int result  = arr[front];
            if(rear == front){
                rear = -1;
                front = -1;
            } else {
                front = (front+1) % size;
            }

            return result;
        }
        // peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        QueueClassUsingArray.Queue q = new QueueClassUsingArray.Queue(6);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q.remove());
        System.out.println("______");
        q.add(7);
        System.out.println(q.remove());
        System.out.println("______");
        q.add(8);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
