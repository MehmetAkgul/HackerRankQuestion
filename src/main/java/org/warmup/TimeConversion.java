package org.warmup;

/**
 * Created by Mehmet AKGUL on 9/11/23.
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
 * - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 * Example
 * <p>
 * Return '12:01:00'.
 * <p>
 * Return '00:01:00'.
 * Function Description
 * Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.
 * timeConversion has the following parameter(s):
 * string s: a time in  hour format
 * Returns
 * string: the time in  hour format
 * Input Format
 * A single string  that represents a time in -hour clock format (i.e.:  or ).
 * Constraints
 * All input times are valid
 */
public class TimeConversion {
    public static void main(String[] args) {

        String s = "12:00:00PM";

        if (s.substring(8).equals("AM")) {
            System.out.println(s.substring(0, 8));

        } else {
            String h = s.substring(0, 2);
            System.out.println(h);
            String other = s.substring(2, 8);

            StringBuilder result = new StringBuilder();
            int time = 12 + Integer.parseInt(h);
            result.append(time);
            result.append(other);
            System.out.println(result);

        }


    }
}
