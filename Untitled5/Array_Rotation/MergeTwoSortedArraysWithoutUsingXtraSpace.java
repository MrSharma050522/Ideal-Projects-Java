package Array_Rotation;

public class MergeTwoSortedArraysWithoutUsingXtraSpace {
    public static void main(String[] args) {
        int[] x = {1,4,7,8,10};
        int[] y = {2,3,9};
        int m = x.length;
        int n = y.length;
        int p = m+n;
        int[] arr = new int[p];
        int i = 0 ,j=0;
        int idx = 0;
        while (i<m&&j<n){
            if(x[i]<y[j]){
                arr[idx++]=x[i++];
            } else{
                arr[idx++]=y[j++];
            }
        }
        while(i<m){
            arr[idx++]=x[i++];
        }
        while(j<n){
            arr[idx++]=y[j++];
        }
        for(int a = 0 ; a<m;a++){
            System.out.print(arr[a]+",");
        }
        System.out.println();
        for(int k = p-n ; k<p;k++){
            System.out.print(arr[k]+",");
        }
        System.out.println();

    }
}
