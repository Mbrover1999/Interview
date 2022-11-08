package com.LeetCode;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(lol("", "ahbgdc"));


    }
    public static boolean lol(String s, String t){
        if(s.equals(t)){
            return true;
        }else if(t.equals("")) {
            return false;

        }
        StringBuilder lol = new StringBuilder();
        for (int i = 0; i < t.length(); i++) {
            if(s.contains(""+t.charAt(i))){
                lol.append(t.charAt(i));
            }

        }
        System.out.println(lol);
        return lol.toString().equals(s);
    }
}
