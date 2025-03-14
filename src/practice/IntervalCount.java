package practice;

import java.util.*;

public class IntervalCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取 n 和 k
        int n = scanner.nextInt();
        long k = scanner.nextLong();

        // 读取数组
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }

        long count = 0;
        long currentSum = 0;
        int left = 0;

        // 双指针法，右指针从左到右移动
        for (int right = 0; right < n; right++) {
            currentSum += arr[right];

            // 当区间 [left, right] 的和不小于 k 时，移动左指针缩小窗口
            while (currentSum >= k && left <= right) {
                // 以当前 right 为结尾，所有左端点在 [left, right] 的区间都满足条件
                count += (right - left + 1);

                // 尝试缩小窗口以寻找更多的可能区间
                currentSum -= arr[left];
                left++;
            }
        }

        // 输出结果
        System.out.println(count);
    }
}