package Char_Stacks;

public class StackDriverClass {
    public static void main(String[] args) {
        StacksUsingLL stacksUsingLL = new StacksUsingLL();

        System.out.println(stacksUsingLL.size()); // 0
        System.out.println(stacksUsingLL.isEmpty()); // true
        stacksUsingLL.push(1); // {1}
        stacksUsingLL.push(2); // {1, 2}
        System.out.println(stacksUsingLL.peek()); // 2
        System.out.println(stacksUsingLL.pop()); // {1} return 2
        System.out.println(stacksUsingLL.size()); // size = 1
        stacksUsingLL.push(3); // {1, 3}
        stacksUsingLL.push(4); // {1, 3, 4}
        System.out.println(stacksUsingLL.pop()); // {1, 3} return 4
        stacksUsingLL.push(5); // {1, 3, 5}
        System.out.println(stacksUsingLL.size()); // size = 3
        System.out.println(stacksUsingLL.isEmpty()); // false
        stacksUsingLL.push(6); // {1, 3, 5, 6}
        System.out.println(stacksUsingLL.pop()); // {1, 3, 5} return 6
        System.out.println(stacksUsingLL.peek()); // 5

        System.out.println("-------------------------------------------------------------------------------");

        StacksUsingArray stacksUsingArray = new StacksUsingArray();
        System.out.println(stacksUsingArray.size()); // 0
        System.out.println(stacksUsingArray.isEmpty()); // true
        stacksUsingArray.push(1); // {1}
        stacksUsingArray.push(2); // {1, 2}
        System.out.println(stacksUsingArray.peek()); // 2
        System.out.println(stacksUsingArray.pop()); // {1} return 2
        System.out.println(stacksUsingArray.size()); // size = 1
        stacksUsingArray.push(3); // {1, 3}
        stacksUsingArray.push(4); // {1, 3, 4}
        System.out.println(stacksUsingArray.pop()); // {1, 3} return 4
        stacksUsingArray.push(5); // {1, 3, 5}
        System.out.println(stacksUsingArray.size()); // size = 3
        System.out.println(stacksUsingArray.isEmpty()); // false
        stacksUsingArray.push(6); // {1, 3, 5, 6}
        System.out.println(stacksUsingArray.pop()); // {1, 3, 5} return 6
        System.out.println(stacksUsingArray.peek()); // 5
    }
}
