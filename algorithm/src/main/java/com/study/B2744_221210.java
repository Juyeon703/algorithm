package com.study;

/*
  대소문자 바꾸기
  -> 구현, 문자열

  - 문제
  영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.

  - 입력
  첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.

  - 출력
  첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를 출력한다.
  */

import java.util.Scanner;

public class B2744_221210 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] arr = scanner.next().split("");
    for (String s : arr) {
      if (s.equals(s.toLowerCase())) System.out.print(s.toUpperCase());
      else System.out.print(s.toLowerCase());
    }
    scanner.close();
  }
}