package com.LeetCode.Strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {


        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int r = 0;
        int l = s.length() - 1;
        while (r < l){
            if(s.charAt(r) != s.charAt(l)){
                return false;
            }
            r++;
            l--;
        }

        return true;

    }
}
