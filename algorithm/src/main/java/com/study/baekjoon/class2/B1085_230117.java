package com.study.baekjoon.class2;
/*
직사각형에서 탈출
  -> 수학, 기하학

  문제
  한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
  직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.

  입력
  첫째 줄에 x, y, w, h가 주어진다.

  출력
  첫째 줄에 문제의 정답을 출력한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1085_230117 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    int w = Integer.parseInt(st.nextToken());
    int h = Integer.parseInt(st.nextToken());
    int result = Math.min(Math.min(h-y, y), Math.min(w - x, x));
    System.out.println(result);
  }
}
