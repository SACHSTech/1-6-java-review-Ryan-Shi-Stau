package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

public class Review4 {
  public static void main(String[] args) throws IOException {
    // declare reader and format
    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
    DecimalFormat format = new DecimalFormat("0.00");

    // declare variables
    int intItems;
    double dblSubtotal = 0;
    // get items
    System.out.print("How many items do you want to buy? ");
    intItems = Integer.parseInt(scan.readLine());

    // loop for each item
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
