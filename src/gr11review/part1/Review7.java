package gr11review.part1;

import java.io.*;


/**
 * A simple program to count the characters, amount of times the letter a
 * appears, and how many spaces are in a string
 * 
 * @author: R. Shi
 *
 */

public class Review7 {
    public static void main(String[] args) throws IOException {

        // declare reader
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        // declare variables
        String strInput;
        int intCharacters = 0;
        int intSpaces = 0;
        int intA = 0;
        String strDash = "";

        // take sentence from user
        strInput = scan.readLine();

        // iterate through the string
        for (int i = 0; i < strInput.length(); i++) {

            // if string at i is "a" count it
            if (strInput.substring(i, i + 1).equals("a")) {

                intA++;
            }
            // if string at i is " " count it
            if (strInput.substring(i, i + 1).equals(" ")) {

                intSpaces++;
            }
            if (i % 2 == 0) {
                strDash = strDash + "-";
            }
            // count characters
            intCharacters++;
        }

        // print results
        System.out.println("There are " + intCharacters + " characters in the sentence.");
        System.out.println("There are " + intSpaces + " spaces in the sentence.");
        System.out.println("There are " + intA + " letter a in the sentence.");
        System.out.println(strDash);
    }
}
