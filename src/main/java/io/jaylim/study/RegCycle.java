package io.jaylim.study;

import java.util.Scanner;

public class RegCycle {

  private final int origin;

  private static int cnt = 0;


  public RegCycle(int origin) {
//    // Inspect input
//    assert (origin >= 0) && (origin <= 99) : "input is out of range";

    this.origin = origin;
  }

  public int func(int N) {

    this.cnt++;

    // 1. Parsing
    int a = N / 10;
    int b = N % 10;

    // 2. Cycle
    int sum = a + b;
    a = b;
    b = sum % 10;
    int M = 10*a + b;

    // 3. check
    if (origin == M) {
      return cnt;
    }
    return func(M);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    RegCycle regCycle = new RegCycle(num);

    System.out.println(regCycle.func(num));

  }
}
