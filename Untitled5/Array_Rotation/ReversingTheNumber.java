package Array_Rotation;
// Palindrome_Number number
// for reversing the number remove the if condition
public class ReversingTheNumber {
    public static void main(String[] args) {
        int n = 123456789;
        int r,temp;
        int sum = 0 ;
        temp = n ;
        while (n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
//        if(sum==temp){
//            System.out.println("Palindrome_Number hai ");
//        } else {
//            System.out.println("Palindrome_Number nahi h ");
//        }
            System.out.println(sum);
    }
}
