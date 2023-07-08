package com.LeetCode;

public class K {
    public static void main(String[] args) { //3 0 0 4 7 9 0 0 0 0 11 15 0 19 20 0 0 31 40 0
        int[] arr = {3, 0, 0, 4, 7, 9, 0, 0, 0, 0, 11, 15, 0, 19, 20, 0, 0, 31, 40, 0};
        System.out.println(kAlmostSearch(arr, 31));
    }
    public static int kAlmostSearch(int[] arr, int num){
        int i = 0;
        while (i < arr.length){
            if(arr[i] == num){
                return i;
            }
            i++;
        }
        return -1;
    }
}
