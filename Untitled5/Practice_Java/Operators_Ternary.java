package Practice_Java;

import java.util.Scanner;

public class Operators_Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Using assignment operator such as += , -= , *= , /= and %=
        int a = sc.nextInt();
        a+=3;    // 10 + 3 = 13
        System.out.println(a);
        a-=4;  // 13 - 4 = 9
        System.out.println(a);
        a*=2;  // 9 * 2 = 18
        System.out.println(a);
        a/=2;  // 18 / 2 = 9
        System.out.println(a);
// use or ternary operator

        int  sr = sc.nextInt();
        String res = "";

        res = (sr % 2 == 0) ? "The Number you typed is : EVEN ":"The Number you typed is : ODD";
        System.out.println(res);
// Finding square root of a given number
        a = sc.nextInt();


        System.out.println("The square root of the number is : " + Math.sqrt(a));
    }
}
