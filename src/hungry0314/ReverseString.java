package hungry0314;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'm') {
                arr[i] = 'w';
            } else if (arr[i] == 'w') {
                arr[i] = 'm';
            }
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }

}
