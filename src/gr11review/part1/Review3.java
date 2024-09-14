package gr11review.part1;

import java.io.*;

/**
 * A simple program to print the odd numbers between 20-100
 * then print the numbers between 29-2 in descending order.
 * 
 * @author: R. Shi
 *
 */
public class Review3 {
    public static void main(String[] args) throws IOException {

        // declare reader
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        // print odd numbers between 20-100
        for (int i = 20; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        // print numbers beteen 29-2 in descending order
        System.out.println();
        for (int i = 29; i >= 2; i--) {
            System.out.println(i);
        }
    }
}
