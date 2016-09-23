package io.jaylim.study.onlinejudge.fibonacci;

import java.util.Scanner;

/**
 * Created by 엘지 on 2016-08-14.
 */
public class Fibonacci {

  public static void main(String[] args) {

    int max = 0;

    Scanner scanner = new Scanner(System.in);
    int cnt = scanner.nextInt();
    int[] zeros;
    int[] ones;

    while (0 != cnt--) {

      // Initialize
      int num = scanner.nextInt();

      if (num == 0 || num == 1) {
        System.out.println((1-num) + " " + num);
        continue;
      }

      zeros = new int[num+1];
      ones = new int[num+1];

      // Base case : n = 0, 1;
      zeros[0] = 1; zeros[1] = 0;
      ones[0] = 0; ones[1] = 1;

      //
      for (int i = 2; i <= num; i++) {
        zeros[i] = zeros[i-1] + zeros[i-2];
        ones[i] = ones[i-1] + ones[i-2];
      }

      System.out.println(zeros[num] + " " + ones[num]);
    }

  }
}
