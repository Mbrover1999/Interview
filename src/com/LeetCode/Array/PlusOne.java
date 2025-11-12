package com.LeetCode.Array;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9, 9, 9};
        int[] arr2 = plusOne(arr);
        for (int num : arr2) {
            System.out.println(num);
        }

    }
    public static int[] plusOne(int[] digits){

        boolean carryOver = true;
        boolean didWeOverFlow = false;
        int current_last_digit = digits.length - 1;
        int[] result = new int[current_last_digit + 2];

        System.arraycopy(digits, 0, result, 0, digits.length);


        while(carryOver){ // O(n)

            if(digits[current_last_digit] + 1 == 10){

                if(current_last_digit == 0){
                    didWeOverFlow = true;
                    result[current_last_digit] = 1;
                    carryOver = false;
                    continue;
                }
                result[current_last_digit] = 0;
                current_last_digit--;
                continue;
            }
            result[current_last_digit] = result[current_last_digit] + 1;
            carryOver = false;

        }
        return didWeOverFlow ? result : Arrays.copyOfRange(result, 0, result.length - 1);
    }
}
