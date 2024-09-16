package gr11review.part1;

import java.io.*;

/**
 * A simple program to output a joke based on an input between 0-3
 * 
 * @author: R. Shi
 *
 */
public class Review2 {
    public static void main(String[] args) throws IOException {

        // declare reader
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        // declare variables
        int intInput;

        // menu choice + get input from user
        System.out.println("0 - print a joke about your hair");
        System.out.println("1 - print a joke about your feet");
        System.out.println("2 - print a joke about your clothes");
        System.out.println("3 - print a joke about your teacher");
        System.out.print("Choose a menu option: ");
        intInput = Integer.parseInt(scan.readLine());

        // decision making tree with switch case
        switch (intInput) {
            case 0:
                System.out.println(
                        "Why did the barber come first in the race to finish cutting hair the fastest? Because he had taken a short cut!");
                break;
            case 1:
                System.out.println("What's a foot's favourite chocolate? Toe-blerone!");
                break;
            case 2:
                System.out.println(
                        "What did the policeman say to the criminal who hid in a laundry basket? You're under a vest!");
                break;
            case 3:
                System.out.println(
                        "Teacher: If I had 8 oranges in one hand and 10 apples in the other hand, what would I have? Student: Big hands!");
                break;
            default:
                System.out.println("Invalid menu option");
                break;
        }
    }
}
