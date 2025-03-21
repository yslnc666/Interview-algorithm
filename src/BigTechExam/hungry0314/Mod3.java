package BigTechExam.hungry0314;

import java.util.Scanner;

public class Mod3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int n = in.nextInt();
            if (n <= 3) {
                System.out.println(-1);
            } else {
                long total = 0;
                for (int i = 1; i <= n; i++) {
                    total += 1L * (i % 3) * (i % 3);
                }
                if (total % 3 == 0) {
                    for (int i = 1; i <= n; i++) {
                        System.out.print(i + " ");
                    }
                } else if (total % 3 == 1) {
                    System.out.print("2 1 ");
                    for (int i = 3; i <= n; i++) {
                        System.out.print(i + " ");
                    }
                } else {
                    System.out.print("3 4 1 2 ");
                    for (int i = 5; i <= n; i++) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }
        }
        in.close();
    }
}
