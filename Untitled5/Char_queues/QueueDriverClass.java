package Char_queues;

public class QueueDriverClass {
    public static void main(String[] args) {
        QueueUsingLL queueUsingLL = new QueueUsingLL();

        System.out.println(queueUsingLL.size()); // 0
        System.out.println(queueUsingLL.isEmpty()); // true
        queueUsingLL.add(1); // {1}
        queueUsingLL.add(2); // {1, 2}
        System.out.println(queueUsingLL.peek()); // 1
        System.out.println(queueUsingLL.poll()); // {2} return 1
        System.out.println(queueUsingLL.size()); // 1
        queueUsingLL.add(3); // {2, 3}
        queueUsingLL.add(4); // {2, 3, 4}
        System.out.println(queueUsingLL.poll()); // {3, 4} return 2
        queueUsingLL.add(5); // {3, 4, 5}
        System.out.println(queueUsingLL.size()); // 3
        System.out.println(queueUsingLL.isEmpty()); // false
        queueUsingLL.add(6); // {3, 4, 5, 6}
        System.out.println(queueUsingLL.poll()); // {4, 5, 6} return 3
        System.out.println(queueUsingLL.peek()); // 4
    }

}
