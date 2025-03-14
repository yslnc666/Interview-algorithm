package ctrip0313;

import java.util.*;

// 02
public class BlackScore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {

            int n = in.nextInt();
            int[] nums = new int[n];
            long res = 0;
            for (int i = 0; i < n; i++) {
                nums[i] = in.nextInt();
            }

            Arrays.sort(nums);
            int len = nums.length - 1;
            int cnt = 0;
            while (len >= 0) {
                cnt++;
                res = Math.max(res, nums[len] + cnt);
                len--;
            }
            System.out.println(res);
        }
    }
}
