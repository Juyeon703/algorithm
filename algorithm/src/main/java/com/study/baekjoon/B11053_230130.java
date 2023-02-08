package com.study.baekjoon;


/*
  가장 긴 증가하는 부분 수열
  -> 다이나믹 프로그래밍

  문제
  수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.

  예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 가장 긴 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다.

  입력
  첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.

  둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)

  출력
  첫째 줄에 수열 A의 가장 긴 증가하는 부분 수열의 길이를 출력한다.
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11053_230130 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int[] result = new int[n];
    result[0] = 1;
    for (int i = 1; i < n; i++) {
      result[i] = 1;
      for (int j = 0; j < i; j++) {
        if (arr[i] > arr[j])
          result[i] = Math.max(result[j] + 1, result[i]);
      }
    }
    int max = 0;
    for (int i = 0; i < n; i++) {
      if (result[i] > max) max = result[i];
    }
    System.out.println(max);
  }
}
