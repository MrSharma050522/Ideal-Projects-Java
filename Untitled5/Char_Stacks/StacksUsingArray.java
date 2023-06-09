package Char_Stacks;

/*
Stacks :
1. Data structure where we store elements
2. LIFO principle : Last In First out.
3. Dynamic in nature.

{1, 2, 3, 4, 5}
Pick the element from stack : 5 (5 is the last element to be inserted in stack)

Stack :
1. insert element - push(el)
2. remove element : pop() -> remove the last element pushed.
3. top element : peek() -> returns the last element inserted.
4. size -> no of elements in the stack.
5. isEmpty() -> size == 0

Ex. stack -
stack.push(1)  - {1}
stack.push(2) - {1, 2}
stack.push(3) {1, 2, 3}
stack.push(4) {1, 2, 3, 4}
stack.peek() -> 4
stack.pop() -> {1, 2, 3}
stack.push(5) -> {1, 2, 3, 5}
stack.pop() -> {1, 2 , 3}
stack.size() -> 3
stack.peek() -> 3

 */
public class StacksUsingArray {
    int[] arr;
    int size;

    public StacksUsingArray() {
        this.arr = new int[5];
    }

    /*
    arr = [1, 2, 3 , 4, 5]
    newArray = new size[double the size of previous array]
    copy all the elements of previous arr to my new array.
    el : 1, 2, 3, 4, 5, 6
    size = 1, 2, 3, 4, 5

     */
    public void push(int el) {
        if (this.size >= this.arr.length) {
            resize();
        }
        this.arr[this.size] = el;
        this.size++;
    }

    private void resize() {
        int[] data = this.arr;
        this.arr = new int[2 * data.length];
        // Copy all the elements in my array.
        for (int i = 0; i < size; i++) {
            this.arr[i] = data[i];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!!");
            return -1;
        }
        return this.arr[this.size - 1];
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!!");
            return -1;
        }
        int toReturn = peek();
        this.size--;
        return toReturn;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }


}
