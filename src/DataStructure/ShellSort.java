package DataStructure;

public class ShellSort {

    // 希尔排序方法
    public static void shellSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // 如果数组为空或只有一个元素，无需排序
        }

        int n = arr.length;

        // 初始增量（gap）为数组长度的一半，逐步缩小增量
        for (int gap = n / 2; gap > 0; gap /= 2) {

            // 对每个子序列进行插入排序
            for (int i = gap; i < n; i++) {
                int key = arr[i]; // 当前需要插入的元素
                int j = i;

                // 将比 key 大的元素向后移动
                while (j >= gap && arr[j - gap] > key) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                // 插入 key 到正确的位置
                arr[j] = key;
            }
        }
    }

    // 测试代码
    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 2, 3};
        System.out.println("排序前的数组:");
        printArray(arr);

        shellSort(arr); // 调用希尔排序

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