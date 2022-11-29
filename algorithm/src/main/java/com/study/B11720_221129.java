package com.study;

/*
  숫자의 합

  - 문제
  N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

  - 입력
  첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

  - 출력
  입력으로 주어진 숫자 N개의 합을 출력한다.
*/

import java.util.Scanner;

public class B11720_221129 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String str = scanner.next();
    int sum = 0;
    // 1) split 사용하기
    String[] arr = str.split("");
    for (String s: arr) {
      sum += Integer.parseInt(s);
    }
    // 2) charAt 사용하기
    for (int i = 0; i < n; i++) {
      sum += str.charAt(i) - '0'; // charAt()은 해당 문자의 아스키코드 값을 반환하므로 반드시 -48 또는 -'0'을 해줘야함
    }
    System.out.println(sum);
    scanner.close();
  }
}
