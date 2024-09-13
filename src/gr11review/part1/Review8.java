package gr11review.part1;

import java.io.*;
import java.lang.Math;

public class Review8 {

  public static void main(String[] args) throws IOException {
    // declare reader
    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

    // declare variables
    int int1 = 0;
    int int2 = 0;
    int int3 = 0;
    int intTriple = 0;

    for (int i = 0; i < 1000; i++) {
      int1 = (int) (Math.random() * 10);
      int2 = (int) (Math.random() * 10);
      int3 = (int) (Math.random() * 10);

      System.out.println(int1 + " " + int2 + " " + int3);

      if (int1 == int2 && int2 == int3) {
        intTriple++;
      }
    }
    System.out.println(intTriple);

  }
}
