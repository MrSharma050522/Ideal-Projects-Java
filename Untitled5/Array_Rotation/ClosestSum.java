package Array_Rotation;

public class ClosestSum {
    public static void main(String[] args) {
        int[] arr = {10, 22, 28, 29, 30, 40};
        int x = 54 ;
//        findClosestSum(arr,x);
        int maxsum = -1;
        int k=0 ;
        int l=0;
        int n = arr.length;
        for(int i =0 ;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                int sum = arr[i]+arr[j]; //
                if(sum==x){
                    k  = arr[i];
                    l = arr[j];
                }else if(sum>x){
                    break;
                }else if(sum<x && sum>maxsum) {
                    k = arr[i];
                    l = arr[j];
                    maxsum = sum;
                }
            }
        }
        System.out.print(k+":"+l);
    }
    public static void findClosestSum(int[] arr, int x){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int maxsum = -1;
        int k = 0 ;
        int l = 0;
        while (i<j){
            int sum = arr[i]+arr[j];
            if(sum <x && sum > maxsum){
                k = arr[i];
                l = arr[j];
                maxsum = sum;
                i++;
            }else if (sum > x ){
                j--;
            }

        }
        System.out.print(k+":"+l);
    }
}
/*
Given a sorted array and a number x, find a pair in an array whose sum is closest to x and smaller than x.
{10, 22, 28, 29, 30, 40}, x = 54
Output: 22 and 30

int i = 0;
int j = arr.length;
while(i<n)    0(n)
{
int sum = arr[i]+arr[j];
	if(sum<x)
  	i++;
   if(sum>x)
   	j--;

}









break the question


1. arr[i]+arr[j] > x
				break;

2. arr[i]+arr[j] == x
			this is the best possible

3. arr[i]+arr[j] <  x

		varible = arr[i]+arr[j];



n2
n complexity

public void findPair(int[] arr , int k)
{
	int[] arr = {10, 22, 28, 29, 30, 40};
  int x = 54 ;
  int maxsum = -1;
  int i ;
  int j ;
  int n = arr.length;
  for(int i =0 ;i<n-1;i++){
  	for(int j =i+1;j<n;j++){
    int sum = arr[i]+arr[j]; //
    	if(sum==x)
      	return sum;
      if(sum>x)
      		break;
      if(sum<x && sum>maxsum)
      {
      		i = arr[i];
          j = arr[j];
      		maxsum = sum;
      }


      }
    }
    print(arr[i]+":"+arr[j])
    return maxsum;
  }



}


 */
