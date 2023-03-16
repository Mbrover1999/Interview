package com.LeetCode;

public class LongestPalindromic {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        String res = "";
        int resLen = 0;
        for (int i = 0; i < s.length(); i++) {
            int r, l;
            r = l = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > resLen) {
                    res = s.substring(l, r + 1);
                    resLen = r - l + 1;
                }
                l--;
                r++;
            }
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > resLen) {
                    res = s.substring(l, r + 1);
                    resLen = r - l + 1;
                }
                l--;
                r++;
            }
        }
        return res;
    }
}
