package io.jaylim.study.onlinejudge.contisum;

import java.util.Scanner;

/**
 * @author Jay Lim
 * @since  8/29/2016
 */
public class ContinuousSum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int cnt = scanner.nextInt();

    int globalMax = 0;
    int localMax = 0;

    for (int i = 0; i < cnt; i++) {

      int origin = scanner.nextInt();

      if (origin <= 0) {
        if (localMax > globalMax) {
          globalMax = localMax;
        }
        localMax = 0;
        continue;
      }

      localMax += origin;
    }

    System.out.println(globalMax);
  }
}
