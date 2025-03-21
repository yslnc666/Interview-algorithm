package BigTechExam.ant0320;

import java.util.*;

/*
1
5 3
1 2 4 5 3
2
1 2
2
*/
public class TwoOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();
        while (T-- > 0) {
            int n = in.nextInt();
            long q = in.nextLong();
            long[] nums = new long[n];
            for (int i = 0; i < n; i++) {
                nums[i] = in.nextLong();
            }
            in.nextLine();

            for (long i = 0; i < q; i++) {
                long[] operation = new long[2];
                long res = 0;
                operation[0] = in.nextLong();
                if (operation[0] == 1) {
                    operation[1] = in.nextLong();
                    long v = operation[1];
                    for (int j = 0; j < nums.length; j++) {
                        nums[j] = Math.min(nums[j], v);
                    }
                } else {
                    for (int k = 0; k < nums.length; k++) {
                        res += nums[k];
                    }
                    System.out.println(res);
                }
                in.nextLine();
            }
        }

    }
}
