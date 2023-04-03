package com.study.baekjoon;

/*
합 다국어

  시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
  1 초	128 MB	215178	139189	118651	65.004%
  문제
  n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

  입력
  첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

  출력
  1부터 n까지 합을 출력한다.
*/

import java.util.Scanner;

public class B8393_230225 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.println(sum);
  }
}
