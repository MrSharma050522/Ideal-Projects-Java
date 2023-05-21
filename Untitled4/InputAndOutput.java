import java.util.Scanner;

// take two number add them
public class InputAndOutput {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        String str1 = sc.nextLine();
        System.out.println(str1);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");



        // Take input of integer(int)
        int num = sc.nextInt();
        System.out.println(num);


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        /// take input of long
        long longNum = sc.nextLong();
        System.out.println(longNum);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // take input of boolean
        boolean boolVal = sc.nextBoolean();
        System.out.println(boolVal);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        // take input of string
        String str = sc.next();
        System.out.println(str);




        ;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");








        int num1 = 5;
        int num2 = 10 ;

        int ans = num1 + num2 ;
        System.out.println(ans);



        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");






        ///and operator

        boolean bool1  = true;
        boolean bool2 = false;
        boolean andAns = bool1 && bool2;
        boolean orAns = bool1 || bool2;
        System.out.println(andAns);
        System.out.println(orAns);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        // assignment operator
        System.out.println(15>7);
        System.out.println(15<7);
        System.out.println(13444> 3234);
        System.out.println(344<34884);


        int firNo = sc.nextInt();
        int secNo = sc.nextInt();
        int total = firNo + secNo;
        System.out.println(total);


    }





}