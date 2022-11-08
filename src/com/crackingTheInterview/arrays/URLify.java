package com.crackingTheInterview.arrays;

public class URLify {
    public static void main(String[] args) {
        char[] chars = {'a', ' ', 'g', '5', ' ', 'g', ' ',' ', ' ', ' ', ' ', ' '};
        System.out.println(urllify(chars));
    }
    public static String urllify(char[] chars){
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == ' '){
                chars[i] = '%';
                System.out.println(new String(chars));
                shift(chars, i);
                chars[i+1] = '2';
                chars[i+2] = '0';
                System.out.println(new String(chars));

            }
        }
        return new String(chars);
    }
    public static void shift(char[] chars, int index){
        int counter = 0;
        while (counter != 3) {
            for (int i = chars.length - 2; i >= index; i--) {
                chars[i + 1] = chars[i];
            }
            counter++;
        }
    }
}
