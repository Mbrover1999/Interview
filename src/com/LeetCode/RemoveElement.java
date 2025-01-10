package com.LeetCode;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int[] arr2 = removeElement(arr, 2);
        for (int num: arr2) {
            System.out.println(num);
        }
    }
    public static int[] removeElement(int[] nums, int val){
        int k = 0;
        int temp;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k++;
            }


        }
        return nums;


    }

}
