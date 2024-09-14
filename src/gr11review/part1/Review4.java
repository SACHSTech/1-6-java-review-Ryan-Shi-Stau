package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

/**
 * A simple program to take a certain amount of items as well as the price, then
 * calculate the subtotal, the tax, and the total of all the items.
 * 
 * @author: R. Shi
 *
 */

public class Review4 {
    public static void main(String[] args) throws IOException {
        // declare reader and format
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat format = new DecimalFormat("0.00");

        // declare variables
        int intItems;
        double dblSubtotal = 0;

        // get amount of items from user
        System.out.print("How many items do you want to buy? ");
        intItems = Integer.parseInt(scan.readLine());

        // loop to get each item's price
        for (int i = 0; i < intItems; i++) {
            System.out.print("Enter the price for item " + (i + 1) + ": ");
            dblSubtotal = dblSubtotal + Double.parseDouble(scan.readLine());
        }

        // print totals
        System.out.println("Subtotal: $" + format.format(dblSubtotal));
        System.out.println("Tax: $" + format.format(dblSubtotal * 0.13));
        System.out.println("Total: $" + format.format(dblSubtotal * 1.13));
    }
}
