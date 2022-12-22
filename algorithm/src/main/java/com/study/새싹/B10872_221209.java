package com.study.새싹;
/*
  팩토리얼
  -> 수학, 구현, 조합론

  - 문제
  0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

  - 입력
  첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.

  - 출력
  첫째 줄에 N!을 출력한다.
*/

import java.util.Scanner;

public class B10872_221209 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result *= i;
    }
    System.out.println(result);
    scanner.close();
  }
}
