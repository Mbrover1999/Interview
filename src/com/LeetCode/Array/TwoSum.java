package com.LeetCode.Array;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,4,5,8,2};
        int target = 7;
        int[] arr2 = twoSum(arr, target);
        for(int num : arr2){
            System.out.println(num);
        }
    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
            HashSet<Integer> lol = new HashSet<>();
            lol.add(3);

            for(int num : lol){

            }
            HashMap<Integer, Integer> lo = new HashMap<>();
            int[] result1 = new int[4553535];

        }
        return result;
    }


}
