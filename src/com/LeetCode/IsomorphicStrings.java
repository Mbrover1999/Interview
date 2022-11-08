package com.LeetCode;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "lol";
        String t = "mom";


        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int sCounter = 0;
        int tCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i == 0){
                continue;
            }
            Character sC = s.charAt(i);
            Character tC = t.charAt(i);
            if(sC.equals(s.charAt(i-1))){
                sCounter++;
            }else {
                sCounter = 0;
            }
            if(tC.equals(t.charAt(i-1))){
                tCounter++;
            }
            else {
                tCounter = 0;
            }
            if(sCounter != tCounter){
                return false;
            }

        }
        return true;
        }


    }
