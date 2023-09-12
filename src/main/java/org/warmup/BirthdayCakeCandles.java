package org.warmup;

import java.util.Collections;
import java.util.List;

/**
 * Created by Mehmet AKGUL on 9/11/23.
 * <p>
 * <p>
 * You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.
 * Example
 * <p>
 * The maximum height candles are  units high. There are of them, so return .
 * Function Description
 * Complete the function birthdayCakeCandles in the editor below.
 * birthdayCakeCandles has the following parameter(s):
 * int candles[n]: the candle heights
 * Returns
 * int: the number of candles that are tallest
 * Input Format
 * The first line contains a single integer, , the size of .
 * The second line contains space-separated integers, where each integer describes the height of .
 */
public class BirthdayCakeCandles {
    public static void main(String[] args) {

        List<Integer> candles = new java.util.ArrayList<>(List.of(4, 4, 2, 1));

        int max = 0;
        int number = 0;
        for (int i = 0; i < candles.size() - 1; i++) {
            max = Math.max(candles.get(i), max);
        }
        for (Integer candle : candles) {
            if (max == candle) {
                number++;
            }
        }
        System.out.println(number);
        System.out.println("-------------");
        Collections.sort(candles);
        int count = 0;
        int maxHigth = candles.get(candles.size() - 1);
        for (int k = candles.size() - 1; k > 0; k--) {
            if (candles.get(k) == maxHigth) {
                count++;
            } else break;
        }
        System.out.println(count);
    }
}

