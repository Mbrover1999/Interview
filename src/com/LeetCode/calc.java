package com.LeetCode;

public class calc {
    public static void main(String[] args) {
            System.out.println(calcFunction(3, 36, 4));

    }
    public static int calcFunction(int num, int sum, int maxOp){
        return calcFunction(num, sum, maxOp, num, 0, "" + num);
    }
    public static int calcFunction(int num, int sum, int maxOp, int result, int op, String resultsString){
        if(result == sum){
            System.out.println(resultsString);
            return 1;
        }
       if(op == maxOp){
           return 0;
       }
       return calcFunction(num, sum, maxOp, result + num, op + 1, resultsString + " + " + num) +
               calcFunction(num, sum, maxOp, result - num, op + 1, resultsString + " - " + num) +
               calcFunction(num, sum, maxOp, result * num, op + 1, resultsString + " * " + num) +
               calcFunction(num, sum, maxOp, result / num, op + 1, resultsString + " / " + num);
    }
}
