package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

/**
 * A simple program to compute the price, tax, and total after tax of a list of
 * items
 * 
 * @author: R. Shi
 *
 */
public class Review6 {

    public static void main(String[] args) throws IOException {
        //
        // declare reader
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat format = new DecimalFormat("0.00");

        // declare variables
        double dblPrice = 0;
        double dblSubtotal = 0;

        // take input and add it to price until 0 is entered
        do {
            System.out.print("Enter the price for an item: ");
            dblPrice = Double.parseDouble(scan.readLine());
            dblSubtotal = dblSubtotal + dblPrice;
        } while (dblPrice != 0);

        // print results
        System.out.println("Subtotal: $" + format.format(dblSubtotal));
        System.out.println("Tax: $" + format.format((dblSubtotal * 0.13)));
        System.out.println("Total: $" + format.format((dblSubtotal * 1.13)));
    }
}
