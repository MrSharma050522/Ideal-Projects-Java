package Char_Lectures;

public class oneDArray {
    /*
    adding of two array here
     */

    public static void main(String[] args) {
        int[] a = new int[3];
        int[] b = new int[2];

        a[0] =1;
        a[1] =3;
        a[2] =4;

        b[0] = 2;
        b[1] =1;
        int[] ans = new int[3];
        for(int i=0;i<a.length;i++){
            if(i<b.length){
                ans[i] = a[i] + b[i];
            }
            else
                ans[i] = a[i];
        }

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }




    }


}
