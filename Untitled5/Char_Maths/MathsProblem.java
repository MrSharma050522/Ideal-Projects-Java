package Char_Maths;

import java.util.Scanner;
//Here we are learning from java tutorial in hindi from channel code with harry

public class MathsProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //        int num1 = 4 , num2 = 7;
//        System.out.println(Math.max(num1, num2));
//        System.out.println(Math.min(num1, num2));
//        System.out.println(Math.sqrt(36));
//        System.out.println(Math.abs(-36));
//        System.out.println(Math.abs(36));
//        System.out.println(Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());

//        System.out.println("Enter Age");
//        int age = s.nextInt();

        // If else conditionals
//        if (age > 20 ){
//            System.out.println("you an adult ");
//        } else if (age > 5 ){
//            System.out.println("you are a not  kid ");
//
//        } else {
//            System.out.println(" you are a kid ");
//        }
        // Switch statement in Java
//        switch (age) {
//            case 12:
//                System.out.println("You are 12 years old");
//                break;
//            case 56:
//                System.out.println("You are 56 years old");
//                break;
//            case 16:
//                System.out.println("You are 16 years old");
//                break;
//            default:
//                System.out.println("you did not match any of the cases");
//
//        }


//
//            switch(age){
//            case 1 :
//                System.out.println("Sunday");
//                break ;
//            case 2 :
//                System.out.println("Monday");
//                break;
//            case 3 :
//                System.out.println("Tuesday");
//                break;
//            case 4 :
//                System.out.println("Wednesday");
//                break ;
//            case 5 :
//                System.out.println("Thursday");
//                break;
//            case 6 :
//                System.out.println("Friday");
//                break;
//            case 7 :
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("nothing matched ");
//
//        }

        // Loops
        /*
        While Loop
        While (condition){
        // this code will keep executing untill the condition is true
        }
         */
//        int i =0 ;
//        while(i < 11){
//            System.out.println(i);
//            i += 1;
//        }

//        do While Loop
//        do {
//
//            // this code will keep executing untill the condition is true
//        } While (condition) ;
//
//        int i =0 ;
//        do{
//            System.out.println(i);
//            i += 1;
//        } while(i < 100);

        /*
        For Loop
        for (st1;st2;st3){
           // Code to be executed
        }
         */
//        for ( int i = 0; i<10;i++){
//            if (i == 2 ){
//                continue ;
//            }
//            System.out.println(i);
//        }
//

    // Java oneDArrays
//        int[] marks = {1, 2, 4, 5};
//        marks[2] = 34; // this will update marks [2]
//        System.out.println(marks[3]);
//        System.out.println(marks[2]);
//
//
//
//
//        // classical way to iterarte an array
//        for (int i = 0 ; i < marks.length; i++){
//            System.out.println(marks[i]);
//        }
//
//        System.out.println("This is for each loop ");
//        // For each loop
//        for (int value:marks){
//            System.out.println(value);
//        }
//
//        int[][] matrix = {{1, 2, 3,}, {4, 5, 6,}};
//        System.out.println(matrix[0][1]);
//
//
//        String[] cars = {"Mahindra" , "Maruti", "Toyota" , "Tata" , "Ford", "Renault"};
//        for (String value:cars){
//            System.out.println(value);
//        }
        // Try - Catch  -> here we say to do that work if it is showing error then
        //                  dont stop print it and then move to next code
//        String[] cars = {"Mahindra" , "Maruti", "Toyota" , "Tata" , "Ford", "Renault"};
//        try {
//            System.out.println(cars[7]);
//        }
//        catch(Exception e ){
//            System.out.println(e);
//        }
//        System.out.println("this line of code is not affected by above index out of bound problem ");


        float number1, number2;
        System.out.println("Enter first number ");
        Scanner s1 = new Scanner(System.in);
        number1 = s1.nextInt();
        System.out.println("Enter second number ");
        Scanner s2 = new Scanner(System.in);
        number2 = s2.nextInt();
        System.out.print("You have entered ");
        System.out.print(number1);
        System.out.print(" and ");
        System.out.print(number2);
        String prompt = "enter 0 for addition , 1 for subtraction , 2 for multiplication and " +
                         "3 for division";
        System.out.println(prompt);
        int input = s.nextInt();
        switch(input){
            case 0 :
                System.out.println("Adding these numbers ");
                System.out.print("The result is :");
                System.out.println(number1 + number2);
                break;
            case 1 :
                System.out.println("Subtracting these numbers ");
                System.out.print("The result is :");
                System.out.println(number1 - number2);
                break;
            case 2 :
                System.out.println("Multiplying these numbers ");
                System.out.print("The result is :");
                System.out.println(number1 * number2);
                break;
            case 3 :
                System.out.println("Dividing these numbers ");
                System.out.print("The result is :");
                System.out.println(number1 / number2);
                break;
            default:
                System.out.println("Invalid Input");
        }








    }
}
