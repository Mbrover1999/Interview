package com.LeetCode.Strings;

public class ReverseString {
    public static void main(String[] args) {

    }
    public static void reverseString(char[] s) {

        int r = 0;
        int l = s.length - 1;
        char temp;
        while (r < l){

            temp = s[r];
            s[r] = s[l];
            s[l] = temp;
            r++;
            l--;

        }




    }
}
