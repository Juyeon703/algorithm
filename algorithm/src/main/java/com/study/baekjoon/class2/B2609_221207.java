package com.study.baekjoon.class2;

/*
  최대공약수와 최소공배수
  -> 수학, 정수론, 유클리드 호제법
  - 문제
  두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.

  - 입력
  첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.

  - 출력
  첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2609_221207 {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    System.out.println(GCD1(a, b));
    System.out.println(LCM(a, b));
//    System.out.println("최대 공약수 = " + gcd1(a, b));
//    System.out.println("최소 공배수 = " + lcm(a, b));
  }

  // 최대 공약수 : Greatest Common divisor
  // 반복문 방식
  static int GCD1(int a, int b) {
    while (b != 0) {
      int r = a % b; // 나머지
      // GCD(a, b) = GCD(b, r)이므로 변환한다.
      a = b;
      b = r;
    }
    return a;
  }
  // 재귀 방식
  static int GCD2(int a, int b) {
    if (b == 0) return a;
    // GCD(a, b) = GCD(b, r)이므로 (r = a % b)
    return GCD2(b, a % b);
  }

  // 최소공배수 : Least Common multiple
  static int LCM(int a, int b) {
    return a * b / GCD1(a, b);
  }
}
