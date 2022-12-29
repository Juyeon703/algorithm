package com.study.baekjoon;

/*
  한수
  -> 브루트포스 알고리즘

  문제
  어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
  등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
  N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.

  입력
  첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

  출력
  첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1065_221228 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int count = 99;

    if (n < 100) System.out.println(n);
    else {
      for (int i = 100; i <= n; i++) {
        if (i == 1000) break;
        int[] arr = new int[3];
        int j = 0;
        int temp = i;
        while (temp > 0) {
          arr[j] = temp % 10;
          temp /= 10;
          j++;
        }
        if (arr[0] - arr[1] == arr[1] - arr[2]) count++;
      }
      System.out.println(count);
    }
  }
}
