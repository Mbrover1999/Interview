package com.crackingTheInterview.arrays;

public class OneAway {
    public static void main(String[] args) {
       System.out.println(OneAway("pale", "ple")); // should return true
        System.out.println(OneAway("pale", "bake")); // should return false
        System.out.println(OneAway("pale", "bale")); // should return true
        System.out.println(OneAway("pales", "pale")); // should return true
    }

    public static boolean OneAway(String str1, String str2) { // O(n)
        if (str1.equals(str2)) {
            return true;
        }
        if (Math.abs(str1.length() - str2.length()) > 1) {
            return false;
        }
        int i = 0;
        int j = 0;
        int counter = 0;
        while (i != str1.length()  && j != str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                counter++;
                i++;
                j++;
                continue;
            }
            if (str1.length() > str2.length()) {
                i++;
            } else if (str1.length() < str2.length()) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (counter == str1.length() - 1 || counter == str2.length() - 1) {
            return true;
        }
        return false;
    }
}
