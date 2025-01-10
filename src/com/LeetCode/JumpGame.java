package com.LeetCode;

public class JumpGame {

    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        int index = 0;
        int jumpValue = nums[index];
        System.out.println(jumpGame(nums, index, jumpValue) == 1 ? "true": "false");
    }
    public static int jumpGame(int[] nums, int index, int jumpValue){
        
        if (index == nums.length - 1){
            return 1;
        }
        if(jumpValue == 0 && index != nums.length - 1){
            return -1;
        }
        if(jumpValue + index > nums.length - 1){
            return -1;
        }
        int res = jumpGame(nums, index + jumpValue, jumpValue);
        if (res == 1){
            return 1;
        }
        if(jumpValue - 1 == 0){
                return -1;
            }else {
            return jumpGame(nums, index, jumpValue - 1);
        }

        }

    }

