package com.Ztm;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[]arr = {1,2,3,9,26,14,74,125,63,235,76,2112,53245,7885,3466,2357,788644,24556567,235532234,657575333,656545,34364564,23246467};
        int sum = 23246468;
        int[] solution = twoSum(arr, sum);
        if(solution == null){
            System.out.println("There are no solution in the provided array for the sum of " + sum);
        }else {
            System.out.println("The answer is: " + Arrays.toString(solution));
        }

    }
    public static int[] twoSum(int[] arr, int sum){
        HashMap<Integer, Integer> passedValues = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            Integer currentValue = passedValues.get(arr[i]);
            if(currentValue != null){
                return new int[]{currentValue, i};
            }else {
                passedValues.put(sum - arr[i], i);
            }
        }
        return null;
    }

}

