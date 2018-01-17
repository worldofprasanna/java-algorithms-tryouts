package com.tryout;

import java.util.*;

/**
 * Created by prasanna on 17/01/18.
 */
public class MinDifference {

    public static void main(String[] args) {
        int arr[] = {10, 50, 12, 100};
        printMinDifferenceV2(arr);
        int next[] = {5, 4, 3, 2};
        printMinDifferenceV2(next);

    }

    private static void printMinDifference(int[] arr) {
        int minDiff = Integer.MAX_VALUE;
        Map<Integer, Integer> output = new HashMap<>();
        for (int i=0; i<arr.length; i++)
            for (int j=i+1; j<arr.length; j++) {

                int diff = Math.abs(arr[i] - arr[j]);
                if (diff < minDiff) {
                    minDiff = diff;
                    output.clear();
                    output.put(arr[i], arr[j]);
                }else if (diff == minDiff)
                    output.put(arr[i], arr[j]);
            }
        output.forEach((v1, v2) -> System.out.println(v1+", "+v2));
    }

    private static void printMinDifferenceV2(int arr[]) {
        Arrays.sort(arr);
        Map<Integer, Integer> output = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.length-1;i++) {
            int diff = arr[i + 1] - arr[i];
            if (min > diff) {
                min = diff;
                output.clear();
                output.put(arr[i], arr[i+1]);
            } else if (min == diff)
                output.put(arr[i], arr[i+1]);
        }

        output.forEach((v1, v2) -> System.out.println(v1+", "+v2));
    }

}
