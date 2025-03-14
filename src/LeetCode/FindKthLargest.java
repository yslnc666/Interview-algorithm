package LeetCode;

// https://leetcode.cn/problems/kth-largest-element-in-an-array/description/
public class FindKthLargest {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 7, 4};
        int k = 2;
        System.out.println(findKthLargest(nums, k));    // 5
    }

    public static int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        return quickSelect(nums, 0, n - 1, n - k);
    }

    public static int quickSelect(int[] nums, int left, int right, int k) {
        if (left == right) {
            return nums[k];
        }
        int temp = nums[left], i = left - 1, j = right + 1;
        while (i < j) {
            do i++;
            while (nums[i] < temp);
            do j--;
            while (nums[j] > temp);
            if (i < j) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        if (k <= j) return quickSelect(nums, left, j, k);
        else return quickSelect(nums, j + 1, right, k);
    }
}
