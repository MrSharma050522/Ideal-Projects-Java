import java.util.HashMap;

public class RemoveDuplicateFromStringArrays {
    public static void main(String[] args) {
        String[] arr = {"aabscs" , "abcd" ,null, "aaaa","","aaabbb","abababa"};
        String[] res = new String[arr.length];
        for(int i = 0 ;i<arr.length;i++){
            String curr = arr[i];
            HashMap<Character,Integer> hm = new HashMap<>();
            for(int j = 0; j< (curr != null ? curr.length() : 0); j++){
                char temp = curr.charAt(j);
                if(hm.containsKey(temp)){
                    int freq = hm.get(temp);
                    int newFreq = freq + 1;
                    hm.put(temp,newFreq);
                } else {
                    hm.put(temp,1);
                }
            }
            for(Character ch : hm.keySet()){
                System.out.print(ch);
            }
            System.out.print(" ");

        }
    }
}