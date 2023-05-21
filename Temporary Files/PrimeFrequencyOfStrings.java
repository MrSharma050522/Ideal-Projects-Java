import java.util.HashMap;
import java.util.Scanner;

public class PrimeFrequencyOfStrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                int of = map.get(ch);
                map.put(ch,of+1);
            }else{
                map.put(ch,1);
            }
        }
        int sum =0 ;
        int mul = 1;

        /*Method-1*/
        for (Character x : map.keySet()){
            if(isPrime(map.get(x))){
                sum += map.get(x);
                mul *= map.get(x);
            }
        }


        /*Method-2*/
        /*
        Object[] arr = map.values().toArray();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(isPrime((int)arr[i]) ){
                sum += (int) arr[i];
                mul *= (int) arr[i];
            }
        }
         */
        System.out.println(sum+" "+mul);

    }
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
