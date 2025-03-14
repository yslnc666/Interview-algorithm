package ctrip0313;
import java.util.Scanner;

public class ArrayWeightSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        int[] w = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            w[i] = solve(a[i]);
            total += w[i];
        }
        int res = Integer.MAX_VALUE;
        for (int l = 0, r = 0, cur = 0; r < n; r++) {
            cur += w[r];
            while (r - 1 + l > k) {
                cur -= w[l];
                l++;
            }
            if (r - 1 + l == k) {
                res = Math.min(res, cur);
            }
        }
        System.out.println(total - res);
        in.close();
    }
    public static int solve(int x) {
        int num = 0;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                num++;
                while (x % i == 0) {
                    x /= i;
                }
            }
        }
        if (x > 1) {
            num++;
        }
        return num;
    }
}
