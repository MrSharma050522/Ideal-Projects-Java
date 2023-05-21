package Char_Lectures;/*
Medium level problem
Amazon , Microsoft , or any top tech product based companies.
string : "abc"
Find its subsequences

1. abc
Subsequence : in order , can ignore any character
a, b, c, ab, bc, ac , abc, ""

2. abcd
a, b, c, d, ab, ac, ad, ba, bc, bd, abc, acd, bcd, abcd, ""
"", d, c, cd, b, bd, bc, bcd, a, ad, acd, ab, abd, abc, abcd

3. abcde
"", e, d, de, c, ce, cd, cde, b, be, bd, bde, bc ,bce, bcd, bcde, a, ae, ad, ade, ac ,ace, acd, acde, ab,
abe, abd, abde, abc, abce, abcd, abcde,

a -> "", a      =>  2 ^ 1
ab -> "", a, b, ab     =>  2 ^ 2
abc -> "", c, b, bc, a, ac, ab, abc    => 2 ^ 3
abcd -> "", d, c, cd, b, bd, bc, bcd, a, ad, acd, ab, abd, abc, abcd  =>  2 ^ 4



string of length n -> subsequences size = 2 ^ n

         0 1 2 3
string : a b c d
cd = string.substring(2)

ab = string.substring(0, 2) => [0 - 1]   # here 2 is not included means it goes to 1 index only. Start
                                                  index is included but end index is not included .


Recursion1 : bcd (string.substring(1))
smallAns[] = { "", d, c, cd, b, bd, bc, bcd }

ans[]={ "", d, c, cd, b, bd, bc, bcd, a, ad, acd, ab, abd, abc, abcd }


 */

public class SubsequenceProblem {
    public static void main(String[] args) {
        String[] ans1 = getSubsequences("abcde");
        String[] ans = getSubsequences("abcd");

        for (int i = 0 ; i < ans.length; i++){
            System.out.print(ans[i] +  " ");
        }
        System.out.println();

        for (int i = 0 ; i < ans1.length; i++){
            System.out.print(ans1[i] +  " ");
        }
        System.out.println();
    }
    public static String[] getSubsequences(String str){
        // Step 1 : Base case
        if ( str.length() == 0 ){
            String[] ans = new String[1];
            ans[0] = "";
            return ans ;
        }


        // Step 2 : Ask Recursion1 to do something for you
        String[] smallAns = getSubsequences(str.substring(1));

        /*
        Step 3 : Do some work
        1. Copy all the element of smallAns to your ans[]
        2. Append the first character to each element of smallAns[]
         */

        String[] ans = new String[2 * smallAns.length];
        int idx = 0 ;

        // Copy all the element of smallAns to your ans[]
        for (int i = 0 ; i < smallAns.length; i++){
            ans[idx] = smallAns[i];
            idx++;

        }
        // Append the first character to each element of smallAns[]
        for (int i = 0 ; i < smallAns.length; i++){
            ans[idx] = str.charAt(0) + smallAns[i];
            idx++;


        }
        return ans;


    }


}
