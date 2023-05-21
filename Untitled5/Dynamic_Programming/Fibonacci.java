package Dynamic_Programming;

import java.util.HashMap;

public class Fibonacci {
    static HashMap<Integer,Long> hm = new HashMap<>();
    public static void main(String[] args) {
        int n = 100;

        hm.put(0,0L);
        hm.put(1,1L);
        System.out.println("Top Down :");
        System.out.println(fibonacci_TopDown(n));

        System.out.println("Bottom Up :");
        System.out.println(fibonacci_BottomUp(n));

    }


    public static long fibonacci_TopDown(Integer x ){
        if(hm.containsKey(x)){
            return hm.get(x);
        }
//        if(x <=1){
//            hm.put(x,x);
//            return  hm.get(x);
//        }
        long ret = fibonacci_TopDown(x-1) + fibonacci_TopDown(x-2);
        hm.put(x,ret);
        return ret;
    }


    public static Long fibonacci_BottomUp(int x ){
        Long arr[] = new Long[x+1];
        arr[0] = 0L;
        arr[1] = 1L;
        for(int i = 2;i<= x;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[x];
    }

}
