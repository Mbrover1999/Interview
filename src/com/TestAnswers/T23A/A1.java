package com.TestAnswers.T23A;

import java.util.Stack;

public class A1{
    public static void main(String[] args) {
        System.out.println(countPairs(3));
    }
    public static int countPairs(int n){
        return countPairs(n, 0, 0, "");
    }

    public static int countPairs(int n, int openerCount, int closerCount, String str){
        if(openerCount == closerCount && closerCount == n){
            if(isValid(str)){
                System.out.println(str);
                return 1;
            }
            else {
                return 0;
            }
        }
        if(openerCount == closerCount){
            return countPairs(n, openerCount + 1, closerCount, str + "(") +
                    countPairs(n, openerCount, closerCount + 1, str + ")");
        }
        if(openerCount == n){
            return countPairs(n, openerCount, closerCount + 1, str + ")");
        }
        if(closerCount == n){
            return countPairs(n, openerCount + 1, closerCount, str + "(");
        }
        return countPairs(n, openerCount + 1, closerCount, str + "(")
                + countPairs(n, openerCount, closerCount + 1, str + ")");


    }

    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(stack.empty()){
                if(str.charAt(i) == ')'){
                    return false;
                }
                stack.push(str.charAt(i));
                continue;
            }
            if(str.charAt(i) == '('){
                stack.push(str.charAt(i));
                continue;

            }
            if(str.charAt(i) == ')'){
                if(stack.peek() != '('){
                    return false;
                }
                stack.pop();
                continue;
            }

        }
        return stack.empty();
    }

}