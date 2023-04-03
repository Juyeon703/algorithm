package com.study.baekjoon.쇼미더코드;

/*
  팩토리얼 0의 개수

  문제
  N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.

  입력
  첫째 줄에 N이 주어진다. (0 ≤ N ≤ 500)

  출력
  첫째 줄에 구한 0의 개수를 출력한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1676_230223 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int two = 0;
    int five = 0;
    for (int i = 1; i <= n; i++) {
      int value = i;
      while (value % 2 == 0) {
        two++;
        value /= 2;
      }
      while (value % 5 == 0) {
        five++;
        value /= 5;
      }
    }
    System.out.println(Math.min(two, five));
  }
}
