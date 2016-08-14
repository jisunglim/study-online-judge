package io.jaylim.study;

import java.util.Scanner;

/**
 * Created by 엘지 on 2016-08-14.
 */
public class RegCycle2 {


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int origin = scanner.nextInt();

    int result = origin;
    int cnt = 0;

    do {

      int tens = result / 10;
      int ones = result % 10;

      int sum = tens + ones;
      tens = ones;
      ones = sum % 10;

      result = tens * 10 + ones;

      cnt++;

    } while (origin != result);

    System.out.println(cnt);
  }
}
