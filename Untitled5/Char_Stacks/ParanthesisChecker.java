package Char_Stacks;

import java.util.Scanner;
import java.util.Stack;

/*
Given an expression string x. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
For example, the function should return 'true' for exp = “[()]{}{[()()]()}” and 'false' for exp = “[(])”.

Example 1:

Input:
{([])}
Output:
true
Explanation:
{ ( [ ] ) }. Same colored brackets can form
balaced pairs, with 0 number of
unbalanced bracket.
Example 2:

() - true
({}) = true
([)] = false
{}() = true

( -> )
{ -> }
[ -> ]

{([])}
How do we say that the expressions string is balanced?
Ans : For every open bracket, we have a closed bracket.
( ), { }, [ ]

[x + 5], (x + y) * 2 {x + (x + y)} - balanced
{x + [y + z)}
{x + [y + z)} - not balanced

{ ( [ ] ) }
0 1 2 3 4 5
If my string is balanced, I am left with no characters.

stack : { (
currBracket = ]
1. If encounter an open bracket, push that in stack.
2. If encounter a closed bracket :
    a. if closed bracket = ')' , check whether the peek element is '('
        if true, pop stack and go ahead
        if false, return not balanced.
    b. if closed bracket = '}' , check whether the peek element is '{'
        if true, pop stack and go ahead
        if false, return not balanced.
    c. if closed bracket = ']' , check whether the peek element is '['
        if true, pop stack and go ahead
        if false, return not balanced.

At the end, if expressions are balanced, stack will be empty
If not balanced, stacks won't be empty.

 */
public class ParanthesisChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();

        for (int z = 0; z < testCases; z++) {
            String expression = s.next();
            boolean ans = isBalanced(expression);
            System.out.println(ans);
        }
    }

    /*
    )
    stack :
    List<Integer>
    int double char

     */
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char curr = expression.charAt(i);
            if (curr == '(' || curr == '{' || curr == '[') {
                stack.push(curr);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (curr == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (curr == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (curr == ']' && stack.peek() == '[') {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
