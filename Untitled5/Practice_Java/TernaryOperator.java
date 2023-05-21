package Practice_Java;

import java.util.Scanner;
/*
Replacement of if-else statement.
 */

public class TernaryOperator {
    public static void main(String[] args) {
        // Check whether is even or odd
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        if (n % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        // Ternary Operator : way of writing if else in single line
        String type = n % 2 == 0 ? "Even " : "Odd";
        System.out.println(type);
        System.out.println(evenOrOddIfElse(5));
        System.out.println(evenOrOddTernary(4));

    }
    public static String evenOrOddIfElse(int num ){
        if (num % 2 == 0){
            return "Even";
        }
        return "Odd";
    }
    public static String evenOrOddTernary(int num){
        return (num % 2 == 0 ) ? "Even" : "Odd";
    }
}
