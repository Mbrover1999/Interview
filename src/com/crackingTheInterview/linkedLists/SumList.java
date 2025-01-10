package com.crackingTheInterview.linkedLists;

import java.util.LinkedList;

public class SumList {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.add(7); //617 + 295 = 912
        list1.add(1);
        list1.add(6);
        list2.add(5);
        list2.add(9);
        list2.add(2);
        LinkedList<Integer> list3;
        list3 = sumList(list1, list2);
        for (int i = 0; i < list3.size(); i++) {
            System.out.print(list3.get(i) + (i == list3.size() - 1 ? "" : " - "));
        }

    }
    public static LinkedList<Integer> sumList (LinkedList<Integer> list1, LinkedList<Integer> list2){
        LinkedList<Integer> sumList = new LinkedList<>();
        int leftOvers = 0;
        for (int i = 0; i < list1.size(); i++) {
            int sum = list1.get(i) + list2.get(i) + leftOvers;
            if(sum >= 10){
                sumList.add(sum % 10);
                leftOvers = sum / 10;
            }else {
                sumList.add(sum % 10);
                leftOvers = 0;
            }
        }
        return sumList;
    }
}
