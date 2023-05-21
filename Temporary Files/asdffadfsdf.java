public class asdffadfsdf {
    public static int findPeakElement(int[] nums, int left, int right) {
        int mid = (left + right) / 2;
        if ((mid == 0 || nums[mid - 1] <= nums[mid]) && (mid == nums.length - 1 || nums[mid + 1] <= nums[mid])) {
            return mid;
        }
        if (mid - 1 >= 0 && nums[mid - 1] > nums[mid]) {
            return findPeakElement(nums, left, mid - 1);
        }
        return findPeakElement(nums, mid + 1, right);
    }

    public static int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            System.exit(-1);
        }
        int index = findPeakElement(nums, 0, nums.length - 1);
        return nums[index];
    }

    public static void main(String[] args) {
        int[] nums = { 8, 9, 10, 2, 5, 6 };
        System.out.println("The peak element is " + findPeakElement(nums));
    }

}
