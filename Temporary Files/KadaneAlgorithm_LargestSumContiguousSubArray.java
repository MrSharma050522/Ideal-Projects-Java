//{-2, -3, 4, -1, -2, 1, 5, -3}
//4 -1 -2 1 5 => 7

public class KadaneAlgorithm_LargestSumContiguousSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(subArrayWithMaxSum(arr));
    }
    public static int subArrayWithMaxSum(int[] arr){
       int maxSoFar = -1;
       int maxEnd = 0 ;

       for (int j : arr) {
           maxEnd = maxEnd + j;
           if (maxSoFar < maxEnd)
               maxSoFar = maxEnd;
           if (maxEnd < 0)
               maxEnd = 0;

       }
       return maxSoFar;

    }
}
