package com.LeetCode.Array;

public class RemoveDupFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int counter = 0; // counter init
        int k = 1; // k init, size is at least one, at least one distinct number

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[counter]){ //check if it's the last copy of the last distinct number
                counter++; // set the place of the new distinct number next to the old one
                k++; // add one to the amount of distinct numbers
                nums[counter] = nums[i];
            }
        }

        return k;
    }
}
