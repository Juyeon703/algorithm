package com.study;

import java.util.Scanner;

/*
  별 찍기

  - 문제
  첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

  - 입력
  첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

  - 출력
  첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
*/
public class B2438_221128 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    scanner.close();
  }
}
