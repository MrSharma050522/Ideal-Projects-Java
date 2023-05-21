import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
// to take the input from the user
        System.out.println("Type your number here and lets get it printed :");
        int i = sc.nextInt();
        System.out.println("The Number you have typed is :" + i );

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
// this is simple use of if else statements
        int x = 10 ;
        if(x == 10 ){
            System.out.println("X  is 10 ");
        }else {
            System.out.println(" X is not 10");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

// use of and && , or || logical operators
        System.out.println("Type a number to see whether it is inside the range of 100 and 200");

        int c = sc.nextInt();
        if (c >= 100  &&  c <= 200){
            System.out.println("inside the range");
        }else {
            System.out.println("outside the range ");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

// use of or || operator
        System.out.println("Type your number here and see whether it is a good number or not, if it is 3,5,8 it is good else bad :");
        int s = sc.nextInt(); ;
        if ( s == 3 || s == 5 ||  s == 8 ){
            System.out.println("Good number ");
        }else {
            System.out.println("Bad number");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

// use of not operator
        System.out.println(" type your number here to check it is = 10 or not , and say godd or bad number ");
        int g = sc.nextInt();
        if ( g != 10 ){
            System.out.println("The number is bad number ");

        }else{
            System.out.println("The number is a good number ");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

// use of ternary operator
        String res = "";

       int r = 12 ;
        if (r%2 == 0 ){
            res = "EVEN";

        }else {
            res = "ODD";
        }
        System.out.println(res);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

// now use of ternary operator instead of if else statement
        System.out.println("Using ternary operator to check even or odd of a number ");
        res = (r%2 ==0 ) ? "EVEN" : "ODD";
        System.out.println(res);



        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" using ternary operator to check even or odd");
        int  sr = sc.nextInt();

        res = (sr % 2 == 0) ? "The Number you typed is : EVEN ":"The Number you typed is : ODD";
        System.out.println(res);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}