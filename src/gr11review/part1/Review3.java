package gr11review.part1;

import java.io.*;

public class Review3 {
  public static void main(String[] args) throws IOException {
    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 20; i < 100; i++) {
      if (i % 2 == 1) {
        System.out.println(i);
      }
    }
    System.out.println();
    for (int i = 29; i >= 2; i--) {
      System.out.println(i);
    }
  }
}
