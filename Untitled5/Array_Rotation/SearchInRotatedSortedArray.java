package Array_Rotation;

public class SearchInRotatedSortedArray {
    public static void main(String[] args){
        int num[] = {7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,0,1,2,4,5,6};
        System.out.println(search(num, 11));
    }
    public static int search(int[] num, int target) {
        int n = num.length;
        int low = 0, high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(num[mid] == target)
                return mid;
            else if(num[low]<=num[mid]){
                if(target >= num[low] && target < num[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if(target>num[mid] && target<=num[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
}
