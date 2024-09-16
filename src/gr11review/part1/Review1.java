package gr11review.part1;

import java.io.*;

/**
 * A program that takes the month number and the day number to calculate
 * the amount of days that have passed in the year (assuming no leap year)
 * 
 * @author: R. Shi
 *
 */
public class Review1 {
    public static void main(String[] args) throws IOException {
        // declare reader
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        // declare variables
        int intMonth;
        int intMonths[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int intDay;
        int intDaynum = 0;

        // get variables from user
        System.out.print("Enter the month number: ");
        intMonth = Integer.parseInt(scan.readLine());
        System.out.print("Enter the day number: ");
        intDay = Integer.parseInt(scan.readLine());

        // add months
        for (int i = 0; i < intMonth - 1; i++) {
            intDaynum = intDaynum + intMonths[i];
        }

        // print final result
        System.out.println(intDaynum + intDay);
    }
}
