package com.crackingTheInterview.arrays;

public class IsUnique {
    public static void main(String[] args) {
        System.out.println(isUnique2("abcde"));
        System.out.println(isUnique2("abccde"));
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
    public static boolean isUnique2(String str) { // without using additional data structures
        int checker = 0;
        int value = -1;
       for(int i = 0; i < str.length(); i++){
           value = str.charAt(i) - 'a';
           if((checker & (1 << value)) > 0){
               return false;
           }

           checker |= (1 << value);
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

