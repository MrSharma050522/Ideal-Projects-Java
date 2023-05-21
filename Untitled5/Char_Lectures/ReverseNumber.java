package Char_Lectures;/*
123 = 321
4672 = 2764

1234 = 4321

1. n = 1234
Step 1 : smallAns = Pass 123 to recursion (n / 10 )
Step 2 : Append last no to smallAns
last no = n % 10
4 * (1000) + 321
 */



public class ReverseNumber {
    public static void main(String[] args) {
        int n = 123456789;
        int r,  temp ;
        int sum = 0;
        temp = n;
        while (n>0){
            r=n%10;
            sum = ( sum * 10 )+r;
            n = n /10;
        }
        System.out.println(sum);
    }
}
