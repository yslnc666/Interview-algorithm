package LeetCode;

import java.util.Scanner;

// https://leetcode.cn/problems/longest-substring-without-repeating-characters/description/
// 输入: s = "abcabcbb"
// 输出: 3
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        int res = 0;
        int len = s.length();
        char[] array = s.toCharArray();
        int left = 0, right = 0;
        while (right < len) {
            if (check(array, left, right)) {
                res = Math.max(res, right - left + 1);
            } else {
                left++;
            }
            right++;
        }
        return res;
    }

    private static boolean check(char[] array, int left, int right) {
        int[] hashTable = new int[26];
        for (int i = left; i <= right; i++) {
            hashTable[array[i] - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (hashTable[i] > 1) {
                return false;
            }
        }
        return true;
    }
}
