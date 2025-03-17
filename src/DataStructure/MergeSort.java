package DataStructure;

public class MergeSort {

    // 归并排序方法
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2; // 计算中间位置

            // 递归地对左半部分和右半部分进行排序
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // 合并两个有序的子数组
            merge(arr, left, mid, right);
        }
    }

    // 合并两个有序子数组的方法
    private static void merge(int[] arr, int left, int mid, int right) {
        // 计算两个子数组的长度
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // 创建临时数组
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // 将数据复制到临时数组
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        // 合并两个临时数组
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // 将左半部分剩余的元素复制到原数组
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // 将右半部分剩余的元素复制到原数组
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // 测试代码
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("排序前的数组:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1); // 调用归并排序

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
