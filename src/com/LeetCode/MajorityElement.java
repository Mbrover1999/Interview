package com.LeetCode;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        String lol = "fsfsfs";
        HashMap<Integer, Integer> counterMap = new HashMap<>();
        for(int num : nums){
            if(!counterMap.containsKey(num)){
                counterMap.put(num, 1);
            }else{
                counterMap.put(num, counterMap.get(num) + 1);
            }
        }
        for(int value : counterMap.keySet()){
            if(counterMap.get(value) > nums.length/2){
                System.out.println(value);
                break;
            }
        }


    }
}
