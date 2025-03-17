package DataStructure;

public class SelectionSort {

    // 直接选择排序方法
    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // 如果数组为空或只有一个元素，无需排序
        }

        int n = arr.length;

        // 遍历数组，每次选择最小的元素放到已排序部分的末尾
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // 假设当前元素是最小的

            // 在未排序部分中找到最小元素的下标
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // 将最小元素与当前元素交换
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    // 测试代码
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("排序前的数组:");
        printArray(arr);

        selectionSort(arr); // 调用直接选择排序

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
