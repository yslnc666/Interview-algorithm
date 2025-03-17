package DataStructure;

import java.util.Arrays;

public class RadixSort {

    // 基数排序方法
    public static void radixSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // 如果数组为空或只有一个元素，无需排序
        }

        // 找到数组中的最大值，确定最大位数
        int max = Arrays.stream(arr).max().getAsInt();

        // 从最低位开始，依次对每一位进行计数排序
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    // 计数排序方法（用于基数排序的每一位排序）
    private static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n]; // 存储排序后的数组
        int[] count = new int[10]; // 计数数组，用于存储每个数字的出现次数

        // 统计当前位（exp）上每个数字的出现次数
        for (int num : arr) {
            int digit = (num / exp) % 10;
            count[digit]++;
        }

        // 将计数数组转换为前缀和数组
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // 根据当前位将元素放入 output 数组
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // 将 output 数组复制回原数组
        System.arraycopy(output, 0, arr, 0, n);
    }

    // 测试代码
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        System.out.println("排序前的数组:");
        printArray(arr);

        radixSort(arr); // 调用基数排序

        System.out.println("排序后的数组:");
        printArray(arr);
    }

    // 辅助方法：打印数组
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}