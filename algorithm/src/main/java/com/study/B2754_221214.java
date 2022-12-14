package com.study;
/*
  학점 계산
  -> 구현, 문자열
  문제
  어떤 사람의 C언어 성적이 주어졌을 때, 평점은 몇 점인지 출력하는 프로그램을 작성하시오.

  A+: 4.3, A0: 4.0, A-: 3.7

  B+: 3.3, B0: 3.0, B-: 2.7

  C+: 2.3, C0: 2.0, C-: 1.7

  D+: 1.3, D0: 1.0, D-: 0.7

  F: 0.0

  입력
  첫째 줄에 C언어 성적이 주어진다. 성적은 문제에서 설명한 13가지 중 하나이다.

  출력
  첫째 줄에 C언어 평점을 출력한다.
*/

import java.util.Scanner;

public class B2754_221214 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.next();
    if (str.equals("F")) {
      System.out.println(0.0);
    } else {
      double score = 69 - str.charAt(0);
      switch (str.charAt(1)) {
        case '+':
          score += 0.3;
          break;
        case '-':
          score -= 0.3;
          break;
      }
      System.out.println(score);
    }
  }
}
