
//  Agenda : 1. Loop and Functions


import java.util.Scanner;

public class FunctionsAndForLoop {
    public static void main(String[] args) {




        // Print Hello Sandeep Sharma  7 times .
        System.out.println("Hello Sandeep Sharma ");
        System.out.println("Hello Sandeep Sharma ");
        System.out.println("Hello Sandeep Sharma ");
        System.out.println("Hello Sandeep Sharma ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");




        /*
        Loops
        1. Initialisation
        2. Make a condition where you need to stop
        3. Do your work
        4. Increment
         */
        /*
        while loop
         */
          // Ques : print hello 8 times
        int i = 1;
        while (i <= 8){
            System.out.println("Hello Sandeep Sharma");
            i++;
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // For Loops
        // in for loops initialisation , condition , and increment are all
        // in the same line or we say small bracket


        for (int j = 1; j <= 10 ; j++){
            System.out.println("Hello Tanmay Sharma ");
        }


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Given a number , print its table.


        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        for (int  k = 1; k <= 10 ; k++){
            System.out.println(num * k );

        }








    }

}
