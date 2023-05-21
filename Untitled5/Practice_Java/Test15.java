package Practice_Java;

import java.util.Collections;
import java.util.Vector;

public class Test15 {
    public static void main(String[] args) {
        int[] a = {2,-6,-3,8,4,1,};
        int n = a.length;
        sortEl(a,n);
    }

    public static void sortEl(int[] a, int n){
        Vector<Integer> res = new Vector<>();
        for(int i=0;i<n;i++){
            if (a[i] >=0);
            res.add(a[i]);
        }
        Collections.sort(res);

        int j=0;
        for(int i=0;i<n;i++){
            if(a[i] >=0){
                a[i]= res.get(j);
                j++;
            }
        }

        for(int i=0;i<n;i++)
            System.out.print(a[i] + " ");

    }

}
