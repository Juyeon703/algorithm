package com.study.baekjoon;

/*
  귀여운 라이언
  -> 두 포인터, 슬라이딩 윈도우

  문제
  꿀귀 라이언 인형과, 마찬가지로 꿀귀인 어피치 인형이 N개 일렬로 놓여 있다.
  라이언 인형은 1, 어피치 인형은 2로 표현하자. 라이언 인형이 K개 이상 있는 가장 작은 연속된 인형들의 집합의 크기를 구하여라.

  입력
  첫 줄에 N과 K가 주어진다. (1≤K≤N≤10^6)

  둘째 줄에 N개의 인형의 정보가 주어진다. (1 또는 2)

  출력
  K개 이상의 라이언 인형을 포함하는 가장 작은 연속된 인형들의 집합의 크기를 출력한다. 그런 집합이 없다면 -1을 출력한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15565_230118 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
  }
}
