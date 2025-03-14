package LeetCode;

import java.util.Scanner;

// https://leetcode.cn/problems/maximum-subarray/description/
public class MaxSubArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[9];
        for (int i = 0; i < 9; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        int pre = 0;
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            res = Math.max(res, pre);
        }
        return res;
    }
}
