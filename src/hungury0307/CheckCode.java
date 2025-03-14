package hungury0307;

import java.util.Scanner;

public class CheckCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 定义样本数组 s0
        String[][] s0 = {
                {"#000#", "#0#0#", "#0#0#", "#0#0#", "#000#"},
                {"##0##", "##0##", "##0##", "##0##", "##0##"},
                {"#000#", "###0#", "#000#", "#0###", "#000#"},
                {"#000#", "###0#", "#000#", "###0#", "#000#"},
                {"#0#0#", "#0#0#", "#000#", "###0#", "###0#"},
                {"#000#", "#0###", "#000#", "###0#", "#000#"},
                {"#000#", "#0###", "#000#", "#0#0#", "#000#"},
                {"#000#", "###0#", "###0#", "###0#", "###0#"},
                {"#000#", "#0#0#", "#000#", "#0#0#", "#000#"},
                {"#000#", "#0#0#", "#000#", "###0#", "#000#"}
        };

        // 读取图片数量
        int n = scanner.nextInt();
        scanner.nextLine(); // 清除换行符

        // 存储最终结果
        StringBuilder res = new StringBuilder();

        // 逐张处理图片
        for (int i = 0; i < n; i++) {
            // 读取5行图片数据
            String[] matrix = new String[5];
            for (int j = 0; j < 5; j++) {
                matrix[j] = scanner.nextLine();
            }

            // 扫描并将数字字符替换为 '0'
            for (int row = 0; row < 5; row++) {
                matrix[row] = matrix[row].replaceAll("[0-9]", "0");
            }

            // 将 matrix 与 s0 中的每个模式比对
            for (int j = 0; j < 10; j++) {
                if (isMatch(matrix, s0[j])) {
                    res.append(j);
                    break; // 假设每个矩阵只匹配一个模式
                }
            }
        }

        // 输出结果
        System.out.println(res);
    }

    // 比较两个矩阵是否相等
    private static boolean isMatch(String[] matrix, String[] pattern) {
        for (int i = 0; i < 5; i++) {
            if (!matrix[i].equals(pattern[i])) {
                return false;
            }
        }
        return true;
    }
}