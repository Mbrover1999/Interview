package com.LeetCode;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(59));// should return true

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
