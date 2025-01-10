package com.crackingTheInterview.arrays;

public class IsUnique {
    public static void main(String[] args) {
        System.out.println(isUnique("abcde"));
        System.out.println(isUnique("abccde"));
    }

    public static boolean isUnique(String str) { // without using additional data structures
        int i = 0;
        while (i < str.length()) {
            int j = i + 1;
            while (j < str.length()) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
                j++;
            }
            i++;
        }
        return true;
    }
}
//    public static boolean isUnique(String str){
//        boolean[] char_set = new boolean[128]; // assuming ASCII
//        for(int i = 0; i < str.length(); i++){
//            int val = str.charAt(i);
//            if(char_set[val]){
//                return false;
//            }
//            char_set[val] = true;
//
//        }
//        return true;
//    }
//}

