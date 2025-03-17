package DataStructure;

public class InsertionSort {

    // 直接插入排序方法
    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // 如果数组为空或只有一个元素，无需排序
        }

        // 从第二个元素开始，依次插入到前面已排序的部分
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // 当前需要插入的元素
            int j = i - 1;

            // 将比 key 大的元素向后移动
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // 插入 key 到正确的位置
            arr[j + 1] = key;
        }
    }

    // 测试代码
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("排序前的数组:");
        printArray(arr);

        insertionSort(arr); // 调用插入排序

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