import java.util.Arrays;

public class Mock4 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,3,4,3};
        int n = arr.length;
        System.out.println(repeat(arr,n));

    }
    public static int repeat(int[] arr,int n){
        for(int i=0 ;i<n;i++){
            int j;
            for(j=0;j<n;j++)
                if(i!=j && arr[i] == arr[j])
                    break;
                if(j==n)
                    return arr[i];


        }
        return -1;
    }
}
