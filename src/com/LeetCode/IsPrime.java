package com.LeetCode;

import java.util.HashSet;

public class IsPrime {
    public static void main(String[] args) {
        int[] arr = {1, 543, 75, 11, 12, 54, 254, 6464, 2354, 65, 7, 21, 23, 22, 65, 34, 86, 45, 7, 65, 64, 67};
        System.out.println(isPrime(arr));// should return true

    }

    public static HashSet<Integer> isPrime(int[] arr){
        HashSet<Integer> primeSet = new HashSet<>();
        for(int i = 0; i < arr.length;  i++){
            if(isPrime(arr[i])){
                primeSet.add(arr[i]);
            }

        }
        return primeSet;


    }



    public static boolean isPrime(int num){
        if(num == 1 || num == 0){
            return false;
        }
        if(num == 2){
            return true;
        }
        for(int i = 2; i <= Math.sqrt((double) num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
