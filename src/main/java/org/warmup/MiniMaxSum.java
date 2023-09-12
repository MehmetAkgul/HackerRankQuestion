package org.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 * Example
 * <p>
 * The minimum sum is  and the maximum sum is . The function prints
 * 16 24
 * Function Description
 * Complete the miniMaxSum function in the editor below.
 * miniMaxSum has the following parameter(s):
 * arr: an array of  integers
 * Print
 * Print two space-separated integers on one line: the minimum sum and the maximum sum of  of elements.
 * Input Format
 * A single line of five space-separated integers.
 */
public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1,3,5,7,9));
        Collections.sort(arr);
        long minSum = 0;
        long maxSum = 0;
        for (int i = 0; i < 4; i++) {
            minSum += arr.get(i);
        }

        for (int j = 4; j > 0; j--) {
            maxSum += arr.get(j);
        }
        System.out.println(minSum + " " + maxSum);

    }

}
