package gr11review.part1;

import java.io.*;

/**
 * A simple program to compute how many years it takes to earn a certain amount
 * of money
 * given the interest rate and the yearly invested amount
 * 
 * @author: R. Shi
 *
 */
public class Review5 {
    public static void main(String[] args) throws IOException {
        // declare reader
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        // declare variables
        double dblYearly = 0;
        double dblInterest = 0;
        double dblTarget = 0;
        double dblMoney = 0;
        int intYears = 0;

        // take variables from user (yearly invested amount, compound interest rate, target amount)
        System.out.print("Enter the yearly invested amount: ");
        dblYearly = Double.parseDouble(scan.readLine());

        System.out.print("Enter the compound interest rate: ");
        dblInterest = Double.parseDouble(scan.readLine());

        System.out.print("Enter the target amount: ");
        dblTarget = Double.parseDouble(scan.readLine());

        // while the money is less than the target, simulate a year of interest+investment
        while (dblMoney < dblTarget) {
            dblMoney = (dblMoney + dblYearly) * (dblInterest / 100 + 1);
            intYears = intYears + 1;
        }

        // print final result
        System.out.println("The target amount will be earned in " + intYears + " years.");
    }

}
