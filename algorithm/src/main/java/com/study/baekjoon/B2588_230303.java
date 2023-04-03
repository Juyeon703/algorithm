package com.study.baekjoon;

/*
곱셈

  문제
  (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.

  (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

  입력
  첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

  출력
  첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2588_230303 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    String b = br.readLine();
    System.out.println(a * Character.getNumericValue(b.charAt(2)));
    System.out.println(a * Character.getNumericValue(b.charAt(1)));
    System.out.println(a * Character.getNumericValue(b.charAt(0)));
    System.out.println(a * Integer.parseInt(b));
  }
}
