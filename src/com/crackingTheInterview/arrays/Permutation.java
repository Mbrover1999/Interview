package com.crackingTheInterview.arrays;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(isPermutation("abdc","abcd"));
    }
    public static boolean isPermutation(String s1, String s2){
        System.out.println(s1);
        s1 = helperSort(s1);
        s2 = helperSort(s2);
        return s1.equals(s2);
    }
    public static String helperSort(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
