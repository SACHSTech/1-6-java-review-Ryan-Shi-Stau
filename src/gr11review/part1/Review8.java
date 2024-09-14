package gr11review.part1;

import java.io.*;


/**
 * A simple program to simulate 1000 slot pulls from 0-9 with 3 digits, and
 * count how many times 3 of the same digit comes up
 * 
 * @author: R. Shi
 *
 */
public class Review8 {

    public static void main(String[] args) throws IOException {
        // declare reader
       
        // declare variables
        int int1;
        int int2;
        int int3;
        int intTriple = 0;

        // loop 1000 times
        for (int i = 0; i < 1000; i++) {

            // generate 3 random numbers
            int1 = (int) (Math.random() * 10);
            int2 = (int) (Math.random() * 10);
            int3 = (int) (Math.random() * 10);

            // print the 3 random numbers
            System.out.println(int1 + " " + int2 + " " + int3);

            // if it's a triple count it
            if (int1 == int2 && int2 == int3) {
                intTriple++;
            }
        }

        // print amount of triples
        System.out.println(intTriple);

    }
}
