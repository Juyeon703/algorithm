package com.study.baekjoon;


/*
  2×n 타일링
  -> 다이나믹 프로그래밍

  문제
  2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.

  아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.

  입력
  첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)

  출력
  첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11726_230201 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n+1];
    arr[1] = 1;
    if (n >= 2) {
      arr[2] = 2;
      for (int i = 3; i < arr.length; i++) {
        arr[i] = (arr[i - 1] + arr[i - 2]) % 10007;
      }
    }
    System.out.println(arr[n]);
  }
}
