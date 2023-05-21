package Apna_College_My_Practice;


public class PatternPrinting {
    public static void main(String[] args) {
       /*  Printing this pattern using the loop :
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *

        */

//        int n = s.nextInt();
//        int m = s.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= m; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

      /*
      Print this pattern
        *****
        *   *
        *   *
        *****

       */

//        int n = 4 ;
//        int m = 5 ;
//        for (int i = 1 ; i <= n ; i++){
//            for (int j = 1 ;j <= m; j++  ){
//                if ( i == 1 || j == 1 || j == m || i == n ){
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//
//        }

        /*
        Print this pattern :
        *
        * *
        * * *
        * * * *

         */

//        int n = s.nextInt();
//        for (int i = 1 ; i <= n ; i++  ){
//            for ( int j = 1 ; j <= i ; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }

        /*
        Print this pattern :
        * * * * * *
        * * * * *
        * * * *
        * * *
        * *
        *

         */

//        int n = s.nextInt();
//        for (int i = 1 ; i <= n ; i++){
//            for (int j = 1 ; j<= n-i+1; j++ ){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Or this can be also true
//        for (int i = n ; i>=1; i--){
//            for (int j = 1 ; j <= i ; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        /*
        Print this pattern :
                  *
                * *
              * * *
            * * * *
          * * * * *
        * * * * * *

         */
//        int n = s.nextInt();
//        for (int i = 1 ; i <= n ; i++){
//            for (int j = 1 ; j <= n-i ; j++){
//                System.out.print(" ");
//            }
//            for (int j = 1 ; j <= i ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
        Print this Pattern :
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6
         */

//        int n= s.nextInt();
//        for (int i = 1; i <= n; i++){
//            for (int j = 1 ; j <= i; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        /*
        Print this pattern :
        1 2 3 4 5  6
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
         */

//        int n = s.nextInt();
//        for (int i = 1 ; i <= n ; i++){
//            for (int j = 1 ; j <= n-i+1; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        // Or can be done in this way too:

//        int n = s.nextInt();
//        for (int i = n ; i >=1 ; i--){
//            for (int j = 1 ; j<=i; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        /*
        Print this pattern
        Floyd's Triangle
        1
        2  3
        4  5  6
        7  8  9  10
        11 12 13 14 15
        16 17 18 19 20 21
         */

//        int n = s.nextInt();
//        int num = 1;
//        for (int i = 1 ; i <=n ; i++){
//            for (int j = 1 ; j<=i; j++){
//                // num = num +1;
//                System.out.print(num + " ");
//                num++;
//            }
//            System.out.println();
//        }

        /*
        Print this pattern :
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
        0 1 0 1 0 1
         */

//        int n = s.nextInt();
//        // outer loop
//        for (int i = 1; i <= n ; i++){
//            // inner loop
//            for (int j = 1; j<=i;j++){
//                if((i+j)%2 == 0){ // even
//                    System.out.print("1 ");
//                } else { // odd
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }

        /*
        Print this pattern :
            1
           2 2
          3 3 3
         4 4 4 4
        5 5 5 5 5

         */

//        int n = 5 ;
//        for (int i = 1 ; i <= n ; i++){
//            for (int j = 1; j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for ( int j = 1 ; j<=i; j++){
//                System.out.print(i+" ");
//            }
//
//            System.out.println();
//        }

        /*
        Print this pattern:
              *****
             *****
            *****
           *****
          *****

         */

//        int n = 5;
//        for (int i = 1; i<=n ;i++){
//            for(int j = 1; j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j = 1; j<= n ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
        Print this pattern :
                1
               212
              32123
             4321234
            543212345
         */

//        int n = s.nextInt() ;
//        for (int i = 1; i<=n; i++){
//            for (int j = 1; j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j = i; j>=1;j--){
//                System.out.print(j);
//            }
//            for (int j = 2 ; j<=i;j++ ){
//                System.out.print(j);
//            }
//
//            System.out.println();
//
//
//
//        }

        /*
        Print this pattern :
        *        *
        **      **
        ***    ***
        ****  ****
        **********
        **********
        ****  ****
        ***    ***
        **      **
        *        *
         */

//        int n = s.nextInt() ;
//        // upper half
//        for ( int i = 1 ; i <= n ; i++){
//            //1st part
//            for (int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            // spaces
//            int spaces = 2 *(n-i);
//            for (int j = 1; j <=spaces; j++){
//                System.out.print(" ");
//            }
//            // 2nd part
//            for (int j = 1 ; j <=i ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        // lower half
//        for ( int i = n ; i>=1 ; i--){
//            //1st part
//            for (int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            // spaces
//            int spaces = 2 *(n-i);
//            for (int j = 1; j <=spaces; j++){
//                System.out.print(" ");
//            }
//            // 2nd part
//            for (int j=1 ; j <= i ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//

        /*
        Print this pattern :
             *
            ***
           *****
           *****
            ***
             *
         */

//        System.out.println("Number likh de be :");
//        int n = s.nextInt() ;
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for ( int j = 1 ; j<2 *(i-1); j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i=n; i>=1; i--){
//            for (int j=1; j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for ( int j = 1 ; j<2 *(i-1); j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
        Print this pattern :
              *****
             *   *
            *   *
           *   *
          *****
         */

//        int n = 5;
//        int m = 5;
//        for (int i=1; i<=5; i++){
//            for (int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for (int j=1; j<=m; j++){
//                if ( i == 1 || j == 1 || j == m || i == n ){
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        /*
        Print this pattern :
        11111
        222
        33
        4
         */

//        int n = 4 ;
//        for (int i=1;i<=n;i++){
//            for (int j= 1 ; j <=n-i+1;j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }

        /*
        Print this pattern :
            1
           1 2
          1 2 3
         1 2 3 4
        1 2 3 4 5
         */

//        int n = 5;
//        for (int i = 1 ; i<=n;i++){
//            for (int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for (int j = 1 ; j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        /*
        Print this pattern :
            1
           1 1
          1 2 1
         1 3 3 1
        1 4 6 4 1
         */

//        int n = 5;
//        printPascal(n);
//    }
//    public static void printPascal(int n) {
//        for (int i = 1; i <= n; i++) {
//            for (int j = 0; j <= n - i; j++) {
//
//                // for left spacing
//                System.out.print(" ");
//            }
//
//            // used to represent C(line, i)
//            int C = 1;
//            for (int j = 1; j <= i; j++) {
//
//                // The first value in a line is always 1
//                System.out.print(C + " ");
//                C = C * (i - j) / j;
//            }
//            System.out.println();
//        }

        /*
        Print this pattern :
            *        *
            **      **
            * *    * *
            *  *  *  *
            *   **   *
            *   **   *
            *  *  *  *
            * *    * *
            **      **
            *        *
         */

//        int n = 5;
//        for (int i = 1 ; i<=n;i++){
//            for (int j = 1;j<=i;j++){
//                if (j == 1 || j == i ){
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            int spaces = 2*(n-i);
//            for (int j = 1;j<=spaces ;j++){
//                System.out.print(" ");
//            } for (int j = 1;j<=i;j++){
//                if (j == 1 || j == i ){
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//
//        }
//        for (int i = n ; i>=1;i--){
//            for (int j = 1;j<=i;j++){
//                if (j == 1 || j == i ){
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            int spaces = 2*(n-i);
//            for (int j = 1;j<=spaces ;j++){
//                System.out.print(" ");
//            } for (int j = 1;j<=i;j++){
//                if (j == 1 || j == i ){
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//
//        }






    }
}
