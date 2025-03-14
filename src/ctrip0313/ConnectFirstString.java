package ctrip0313;

import java.util.Scanner;

// 01
public class ConnectFirstString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int len = s.length();
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; index < len; i++) {
            index += i;
            if (index < len) {
                sb.append(s.charAt(index));
            }
        }
        System.out.println(sb.toString());
        in.close();
    }
}
