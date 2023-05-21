import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {


        /*
        Given two number ,  print their sum
         */
        Scanner s = new Scanner(System.in);
        int fir = s.nextInt();
        int sec = s.nextInt();


        int total = fir + sec;
        System.out.println(total);

        /*
        Function : If you want to use any code elsewhere in the project . Use function .
        1. return type
        2. function name
        3. no of arguments

         */
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Function calling





    /*
    Given 10 numbers as an input , count the number of digits of each number .

     */

        int num = 123;
        int digits = countDigits(num);

        System.out.println(digits);


        int num2 = 12322;
        digits = countDigits(num2);
        System.out.println(digits);


        int num3 = 123233222;
        digits = countDigits(num3);
        System.out.println(digits);

    }
    public static int countDigits(int num ){
        int digits = 0 ;
        while ( num > 0 ){
            digits = digits + 1 ;
            num = num / 10 ;
        }
        return digits;

    }


}
