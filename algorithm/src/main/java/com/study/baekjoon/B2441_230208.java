package com.study.baekjoon;

/*
  별 찍기 - 4

  문제
  첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제

  하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

  입력
  첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

  출력
  첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2441_230208 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++) {
      for (int j = n - i; j < n; j++) {
        System.out.print(" ");
      }
      for (int j = i; j < n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
