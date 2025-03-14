package hungury0307;

import java.util.Scanner;

public class SwapString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int cnt0 = 0, n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '0') {
                cnt0++;
            }
        }
        System.out.println(1 + cnt0 * (n - cnt0));
    }
}
