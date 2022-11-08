package com.dataStBook;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class AnagramApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        ArrayList<Integer> lol = new ArrayList<>();
        Character lil = 'a';
        String input = scanner.next();
        HashSet<Character> sfaf = new HashSet<>();
        int size = input.length();
        int count = 0;
        System.out.println(input);
    }

}
