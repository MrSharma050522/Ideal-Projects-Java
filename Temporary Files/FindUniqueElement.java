import java.util.HashMap;
import java.util.Map;

public class FindUniqueElement {
    static void findNonRepeatingElement(int nums[]) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i:nums) {
            if(hashMap.get(i) == null) hashMap.put(i,1);
            else hashMap.put(i,hashMap.get(i)+1);
        }

        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()) {
            if(entry.getValue()==1)
                System.out.print(entry.getKey()+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr1 = { 1,45,5,7,9,5,0,0,0};
        int[] arr2 = {2,1,5,6,1,9,0,-3};
        int n1 = arr1.length;
        int n2 = arr2.length;

        int n3=n1+n2;
        int [] arr= new int[n3];
        System.arraycopy(arr1, 0, arr, 0, n1);
        System.arraycopy(arr2, 0, arr, n1, n2);
        findNonRepeatingElement(arr);
    }
}
