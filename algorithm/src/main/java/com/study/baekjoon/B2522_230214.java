package com.study.baekjoon;

/*
  별 찍기 - 12

  문제
  예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

  입력
  첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

  출력
  첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2522_230214 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 1; i < n; i++) {
      for (int j = 1; j <= n-i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}


