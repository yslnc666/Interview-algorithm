package practice;

import java.util.Scanner;

public class PerfectMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // 清除换行符

        // 读取矩阵
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            String row = scanner.nextLine();
            for (int j = 0; j < n; j++) {
                matrix[i][j] = row.charAt(j) - '0';
            }
        }

        // 构建前缀和数组
        int[][] prefixSum = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                prefixSum[i][j] = matrix[i - 1][j - 1] + prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1];
            }
        }

        // 输出结果
        for (int size = 1; size <= n; size++) {
            int count = 0;
            for (int r = 1; r + size - 1 <= n; r++) {
                for (int c = 1; c + size - 1 <= n; c++) {
                    int r2 = r + size - 1;
                    int c2 = c + size - 1;
                    int ones = prefixSum[r2][c2] - prefixSum[r - 1][c2] - prefixSum[r2][c - 1] + prefixSum[r - 1][c - 1];
                    int zeros = size * size - ones;
                    if (ones == zeros) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}