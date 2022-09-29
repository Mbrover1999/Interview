package com.LeetCode;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr1 = {0,1,0,3,12};
        int[] newArr = moveZeros(arr1);
        for(int num : newArr){
            System.out.println(num);
        }
    }
    public static int[] moveZeros(int[] nums){
        int k = 0;
        for(int i = 0; i < nums.length; i++){
           if(nums[i] != 0){
               nums[k++] = nums[i];
           }
        }
        for (int i = k; i < nums.length; i++){
            nums[i] = 0;
        }
        return nums;
    }
}
