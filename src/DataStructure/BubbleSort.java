package DataStructure;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {13, 24, 5, 1, 32, 124, 55};
        bubbleSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
               if (nums[j] > nums[j + 1]) {
                   int temp = nums[j];
                   nums[j] = nums[j + 1];
                   nums[j + 1] = temp;
               }
            }
        }
    }
}
