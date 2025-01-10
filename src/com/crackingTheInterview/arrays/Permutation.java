package com.crackingTheInterview.arrays;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(isPermutation("abdc","abcf"));
    }
    // Sorting the strings and comparing them
//    public static boolean isPermutation(String s1, String s2){
//        System.out.println(s1);
//        s1 = helperSort(s1);
//        s2 = helperSort(s2);
//        return s1.equals(s2);
//    }
//    public static String helperSort(String s){
//        char[] chars = s.toCharArray();
//        Arrays.sort(chars);
//        return new String(chars);
//    }

    // Counting the number of characters in each string and comparing them

    public static boolean isPermutation(String s1, String s2){
        int s1_char_sum = 0;
        int s2_char_sum = 0;
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i = 0; i < s1.length(); i++){
            s1_char_sum += s1.charAt(i);
            s2_char_sum += s2.charAt(i);
        }
        if(s1_char_sum != s2_char_sum){
            return false;
        }
        return true;
    }

}
