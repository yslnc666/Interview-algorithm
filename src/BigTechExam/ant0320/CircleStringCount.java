package BigTechExam.ant0320;

import java.util.Scanner;

public class CircleStringCount {
    static char[] arr = {'a', 'b', 'd', 'g', 'o', 'p', 'q'};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int res = 0;
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (isCircle(array[i])) {
                res++;
            }
        }
        System.out.println(res);
    }

    public static boolean isCircle(char c) {
        for (int i = 0; i < arr.length; i++) {
            if (c == arr[i]) {
                return true;
            }
        }
        return false;
    }
}
