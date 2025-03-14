package nowcoder;
import java.util.Objects;
import java.util.Scanner;

public class Bricks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        String[][] matrix = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = "*";
            }
        }

        int[] index = new int[m];
        for (int i = 0; i < k; i++) {
            int row = in.nextInt() - 1;
            int col = in.nextInt() - 1;
            if (Objects.equals(matrix[row][col], "*")) {
                int idx = index[col];
                matrix[idx][col] = ".";
                index[col]++;
            }
        }

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < m; j++) {
                sb.append(matrix[i][j]);
            }
            System.out.println(sb);
        }
    }
}

/*
3 3 4
3 1
3 3
2 3
1 3
----------------------------------------------------
.*.
**.
***
 */