package com.TestAnswers.T23A;

public class B1 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 23, 90, 67};
        System.out.println(peak(arr));
    }
    public static int peak(int [] arr){
        for (int i = 1; i < arr.length; i++) { //O(n)
            if(arr[i-1] <= arr[i] && arr[i+1] <= arr[i]){
                return arr[i];
            }
        }
        return -1;
    }
}
