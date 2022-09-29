package com.dataStBook;

public class Recursion {
    public static void main(String[] args) {
        TriangleNumber(14);

    }
    public static int TriangleNumber(int num){
        if (num == 1){
            System.out.println(1);
            return 1;
        }else {
            int totalNum = num + TriangleNumber(num - 1);
            System.out.println(totalNum);
            return totalNum;
        }


    }
}
