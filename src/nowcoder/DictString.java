package nowcoder;
import java.util.*;

public class DictString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int len = s.length();
        List<String> subStrings = new ArrayList<>();
        for (int i = 0; i < len - 1; i++) {
            subStrings.add(s.substring(i, i + 2));
        }
        Collections.sort(subStrings);

        for (String ans : subStrings) {
            System.out.println(ans);
        }
    }
}

// ababa
/*
    ab
    ab
    ba
    ba
 */