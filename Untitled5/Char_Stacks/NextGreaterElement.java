package Char_Stacks;

import java.util.Stack;

/*
Next greater element.
Example 1:
ip : {1 3 2 4}
op : {3 4 4 -1}

Input:
N = 5, arr[] [6 8 0 1 3]
{8, -1, 1, 3, -1}
Output:
             0  1  2  3  4  5  6
Example 3 : [2, 7, 3, 5, 4, 6, 8]
stack : {8}
Traversal :
i = 0, currEl = 2, stack.push(el)

i = 1, currEl = 7
compare stack.peek with currEl.
stack.peek() >= currEl
stack.peek() < currEl, => currEl is next greater el for stack.peek(), stack.pop()
stack.push(currEl)

i = 2, currEl = 3
stack.peek(7)  >= currEl(3), stack.push(currEl)

i = 3, currEl = 5
stack.peek(3) < currEl, stack,pop()
stack.peek(7) >= currEL(5),
stack.push(5)

i = 4, currEl = 4
5 > 4, do nothing stack.push(currEL)

i = 5, currEl = 6
4 < 6, stack.pop()
5 < 6, stack.pop()
7 > 6, do nothing, push(6)

i = 6, currEl = 8
6 < 8, stack.pop()
7 < 8, stack.pop()
push(8)

arr :{ 7, 8, 5, 6, 6, 8, -1 }

 */
public class NextGreaterElement {
    public static void main(String[] args) {
        // 7 8 5 6 6 8 -1
        int[] arr = {2, 7, 3, 5, 4, 6, 8};
        int[] nextGreaterArr = nextGreaterElements(arr);
        for (int el : nextGreaterArr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();

        // Initialise the result array to -1
        int[] nextGreaterArr = new int[n];
        for (int i = 0; i < n; i++) {
            nextGreaterArr[i] = -1;
        }

        // Push first index (0) to the stack.
        stack.push(0);

        /*
        stack : {1st, }
        currEl = 7
         */
        for (int i = 1; i < n; i++) {
            int currEl = arr[i];
            while (!stack.isEmpty() && currEl > arr[stack.peek()]) {
                nextGreaterArr[stack.peek()] = currEl;
                stack.pop();
            }
            stack.push(i);
        }
        return nextGreaterArr;
    }
}
