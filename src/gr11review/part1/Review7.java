package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

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

    // take sentence from use
    strInput = scan.readLine();

    for (int i = 0; i < strInput.length(); i++) {
      if (strInput.substring(i, i + 1).equals("a")) {

        intA++;
      }
      if (strInput.substring(i, i + 1).equals(" ")) {

        intSpaces++;
      }
      if (i % 2 == 0) {
        strDash = strDash + "-";
      }
      intCharacters++;
    }
    System.out.println("There are " + intCharacters + " characters in the sentence.");
    System.out.println("There are " + intSpaces + " spaces in the sentence.");
    System.out.println("There are " + intA + " letter a in the sentence.");
    System.out.println(strDash);
  }
}
