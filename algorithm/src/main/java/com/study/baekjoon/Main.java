package com.study.baekjoon;

import java.util.Arrays;
import java.util.Scanner;
// 토큰 테스트 wincred
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean[] arr = new boolean[31];
    Arrays.fill(arr, false);
    arr[0] = true;
    for (int i = 0; i < 28; i++) {
      arr[scanner.nextInt()] = true;
    }
    for (int i = 0; i < arr.length; i++) {
      if (!arr[i]) System.out.println(i);
    }
  }
}