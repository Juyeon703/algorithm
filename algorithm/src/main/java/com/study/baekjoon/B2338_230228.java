package com.study.baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class B2338_230228 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    BigInteger a = scanner.nextBigInteger();
    BigInteger b = scanner.nextBigInteger();
    System.out.println(a.add(b));
    System.out.println(a.subtract(b));
    System.out.println(a.multiply(b));
  }
}
