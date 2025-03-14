package LeetCode;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    // 快速排序的入口方法
    public static void quickSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    // 递归实现快速排序
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // 分区操作，返回基准值的正确位置
            int pivotIndex = randomizedPartition(arr, low, high);
            // 递归排序左半部分
            quickSort(arr, low, pivotIndex - 1);
            // 递归排序右半部分
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int randomizedPartition(int[] nums, int left, int right) {
        int i = new Random().nextInt(right - left + 1) + left;
        swap(nums, right, i);
        return partition(nums, left, right);
    }
    // 分区操作
    private static int partition(int[] arr, int low, int high) {
        // 选择基准值（这里选择最右边的元素）
        int pivot = arr[high];
        // 指向小于基准值的元素的边界
        int i = low - 1;

        // 遍历数组，将小于基准值的元素放到左边
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // 将基准值放到正确的位置
        swap(arr, i + 1, high);
        // 返回基准值的索引
        return i + 1;
    }

    // 交换数组中两个元素的位置
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 测试代码
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("排序前: " + Arrays.toString(arr));
        quickSort(arr);
        System.out.println("排序后: " + Arrays.toString(arr));
    }
}