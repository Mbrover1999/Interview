package com.TestAnswers.T22B;

public class A1 {

    public static void main(String[] args) {
        System.out.println(calc(3, 48, 6));
    }

    public static int calc(int num, int result, int maxOp) {
        return calc(num, result, maxOp, num, "" + num, 0);
    }

    public static int calc(int num, int result, int maxOp, int currentRes, String str, int currentOp) {

        if (currentOp <= maxOp && currentRes == result) {
            System.out.println("--------------------------------------------------");
            System.out.println(str + " = " + result);
            System.out.println("--------------------------------------------------");
            return 1;

        }
        if (currentOp > maxOp) {
            return 0;
        }

        currentOp++;

        return calc(num, result, maxOp, currentRes + num, str + " + " + num, currentOp) + // "+"
                calc(num, result, maxOp, currentRes - num, str + " - " + num, currentOp) + // "-"
                calc(num, result, maxOp, currentRes * num, str + " * " + num, currentOp) + // "*"
                calc(num, result, maxOp, currentRes / num, str + " / " + num, currentOp); // "/"
    }

}
