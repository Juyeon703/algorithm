package com.study.baekjoon.class2;

/*
  수 찾기
  -> 자료구조, 정렬, 이분 탐색

  - 문제
  N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.

  - 입력
  첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다.
  다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다. 다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다.
  모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.

  - 출력
  M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1920_221204 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arrN = new int[n];
    for (int i = 0; i < n; i++) {
      arrN[i] = Integer.parseInt(st.nextToken());
//      System.out.println(arrN[i]);
    }
    Arrays.sort(arrN); // 이분 탐색 시 정렬해줘야함
    int m = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    int[] arrM = new int[m];
    for (int i = 0; i < m; i++) {
      arrM[i] = Integer.parseInt(st.nextToken());
      // 이분탐색 내장함수
      // -> 정렬한다음에 사용해야하고 찾는게 성공시에는 해당인덱스를 못찾을시에는 음수를 반환한다고 합니다.
     if (Arrays.binarySearch(arrN, arrM[i]) < 0) sb.append(0).append('\n');
     else sb.append(1).append('\n');
    }
    System.out.println(sb.toString());
  }

  public static void main2(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arrN = new int[n];
    for (int i = 0; i < n; i++) {
      arrN[i] = Integer.parseInt(st.nextToken());
//      System.out.println(arrN[i]);
    }
    int m = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    int[] arrM = new int[m];
    for (int i = 0; i < m; i++) {
      int result = 0;
      arrM[i] = Integer.parseInt(st.nextToken());
      for (int j = 0; j < arrN.length; j++) {
        if (arrM[i] == arrN[j]) result = 1;
      }
//      System.out.println(arrM[i] +","+result);
      sb.append(result).append('\n');
    }
    System.out.println(sb.toString());
  }
}
