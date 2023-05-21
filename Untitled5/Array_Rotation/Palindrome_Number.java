package Array_Rotation;

public class Palindrome_Number {
    public static void main(String[] args) {
        int n = 5432345;
        int r,  temp ;
        int sum = 0;
        temp = n;
        while (n>0){
            r=n%10;
            sum = ( sum * 10 )+r;
            n = n /10;
        }
        if(sum==temp){
            System.out.println("Palindrome_Number number ");
        } else {
            System.out.println("not ");
        }

    }
}
