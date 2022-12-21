package com.study;
/*
  이항계수
  -> 수학, 구현, 조합론
  문제
  자연수 \(N\)과 정수 \(K\)가 주어졌을 때 이항 계수
  \(\binom{N}{K}\)를 구하는 프로그램을 작성하시오.

  입력
  첫째 줄에 \(N\)과 \(K\)가 주어진다. (1 ≤ \(N\) ≤ 10, 0 ≤ \(K\) ≤ \(N\))

  출력
  \(\binom{N}{K}\)를 출력한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11050_221218 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    
    int up = 1;
    int down = 1;
    // n!/k!
    for (int i = n; i > k; i--) {
      up *= i;
//      System.out.print(i + " ");
    }
//    System.out.println();
    // (n-k)!
    for (int i = 1; i <= n - k; i++) {
      down *= i;
//      System.out.print(i + " ");
    }
//    System.out.println();
//    System.out.println("up = " + up);
//    System.out.println("down = " + down);
    int result = up/down;
//    System.out.println("result = " + result);
    System.out.println(result);
  }
}
