package com.LeetCode.Array;

public class JumpGame {

    public static void main(String[] args) {
    int[] nums = {1,0,0,0,3,0,0,1};
    System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums){
        boolean hole = false; // did we meet a hole
        int hole_index = 0;
        for(int i = nums.length - 2; i >= 0; i--){//backtracking from the second from last element
            int currentNum = nums[i];
            if(currentNum == 0){ // if we met a hole
                if(!hole){ // first hole? if yes, change the flag and save the location
                    hole_index = i;
                    hole = true;
                }
            }else if(hole){ // not a hole, but we encountered a hole before
                if(i + currentNum > hole_index){ // can we pass it?
                    hole = false;
                }
            }
        }
    return !hole; // return if the hole problem is gone
    }
}
