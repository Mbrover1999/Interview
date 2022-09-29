package com.LeetCode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9,9,9,9,9};
        int[] arr2 = plusOne(arr);
        for (int num : arr2) {
            System.out.println(num);
        }

    }

    public static int[] plusOne(int[] digits) {
        int[] newArr = new int[digits.length + 1];
        System.arraycopy(digits, 0, newArr, 0, digits.length);
        boolean overflow = false;
        for (int i = digits.length - 1; i >= 0; i--){
            if(digits[i] == 9){
                if(i == 0){
                    overflow = true;
                    newArr[0] = 1;
                    newArr[digits.length] = 0;
                    break;
                }else {
                    newArr[i] = 0;
                }
            }else {
                newArr[i]++;
                break;
            }
        }
        if(overflow){
            return newArr;
        }else {
            return Arrays.copyOfRange(newArr, 0, digits.length);
        }
//        int[] newArr = new int[digits.length + 1];
//        long num = 0;
//        int k = 0;
//        for (int i = digits.length - 1; i >= 0; i--, k++) {
//            int zeros = (int) Math.pow(10, i);
//            num += (long) digits[k] * zeros;
//        }
//        num = num + 1;
//        String number = String.valueOf(num);
//        k = 0;
//        for(int i = 0; i < number.length(); i++) {
//            int j = Character.digit(number.charAt(i), 10);
//            newArr[k] = j;
//            k++;
//        }
//        return Arrays.copyOfRange(newArr, 0, k);
    }
}
