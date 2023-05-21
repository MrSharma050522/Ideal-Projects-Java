public class mock2 {
    public static void main(String[] args) {
        //{1, 3, 4, 7, 10},
        //
        //x = 15
        int[] arr = {1, 3, 4, 7, 10};
        int x = 15;
        int k =0 ;
        int l =0;
        int j = arr.length-1;

        int maxsum = 0;
        for(int i =0;i<arr.length;i++){
            int sum = arr[i]+arr[j];
            if(sum==x){
                k=i;
                l=j;
            }else if(sum > x  ){
                j--;
            }else if(sum < x && maxsum < sum ){
                k=i;
                l=j;
                maxsum=sum;
            }

        }
        System.out.println(k+" "+l);
    }
}
