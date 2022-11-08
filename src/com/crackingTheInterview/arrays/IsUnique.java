package com.crackingTheInterview.arrays;

public class IsUnique {
    public static void main(String[] args) {
        System.out.println(isUnique("gfdsfsvsqvesdacq"));
    }
    public static boolean isUnique(String s){
        int i = 0;
        int counter = 0;
        int j = s.length() - 1;
        while(i != s.length() - 2){
            System.out.println(counter++);
            if(i == j){
                i++;
                j = s.length() - 1;
            }
            if(s.charAt(i) == s.charAt(j)){
                return false;
            }
            j--;

        }
        return true;
    }
}
