package com.LeetCode;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        int k = 3;
        rotate(nums, k);


    }
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int i = 0; // start
        int j = nums.length - 1; //end


        while(i < j)
        {

            int temp = nums[i];

            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;


        }

        // reversing block 1 first-k elements
        i = 0;
        j = k - 1;

        while(i < j && i < nums.length - 1){
            int temp = nums[i];

            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }

        // revering block 2 last-k elements

        i = k;
        j = nums.length - 1;

        while(i < j && i < nums.length){

            int temp = nums[i];

            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }

    }
}
