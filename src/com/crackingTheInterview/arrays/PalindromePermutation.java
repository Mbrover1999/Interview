package com.crackingTheInterview.arrays;

public class PalindromePermutation {
    public static void main(String[] args) {
        System.out.println(isPalindromePermutation("tactcoa"));// should return true
        System.out.println(isPalindromePermutation("tactcod"));// should return false
    }
    public static boolean isPalindromePermutation(String srt){
        int [][] char_set = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1][2];
        for(int i = 0; i < srt.length(); i++){
            int val = getCharNumber(srt.charAt(i));
            char_set[val][0]++;
        }
        for(int i = 0; i < char_set.length; i++){
            System.out.println(char_set[i][0]);
        }
        boolean odd = false;
        for (int[] ints : char_set) {
            if (ints[0] % 2 == 1) {
                if (odd) {
                    return false;
                }
                odd = true;
            }
        }
        return true;
    }

    public static int getCharNumber(Character c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if(a <= val && val <= z){
            return val - a;
        }
        return -1;

    }

}
