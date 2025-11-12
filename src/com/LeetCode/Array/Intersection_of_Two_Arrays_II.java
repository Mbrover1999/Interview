package com.LeetCode.Array;

import java.util.Arrays;
import java.util.HashMap;

public class Intersection_of_Two_Arrays_II {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        int[] arr3 = interscetion(arr1, arr2);
        for (int num : arr3) {
            System.out.println(num);
        }


    }

    public static int[] interscetion(int[] nums1, int[] nums2) {
        int[] arr3 = new int[Math.min(nums1.length, nums2.length)];
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int num : nums1) {
            if (counter.containsKey(num)) {
                counter.put(num, (counter.get(num) + 1));
            } else {
                counter.put(num, 1);
            }

        }
        int i = 0;
        for (int num : nums2) {
            if (counter.containsKey(num)) {
                if (counter.get(num) > 0) {
                    arr3[i] = num;
                    i++;
                    counter.put(num, (counter.get(num) - 1));
                }

            }
        }
        return Arrays.copyOfRange(arr3, 0, i);

    }
}
