package com.study.programmers.고득점kit.완전탐색;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

// 고득점 kit - level2
// 완전 탐색 - 카펫
public class P42842_230102 {
  public static void main(String[] args) {
    int brown = 24;
    int yellow = 24;
    solution(brown, yellow);
  }
  public static int[] solution(int brown, int yellow) {
    int sum = brown + yellow;
    int x = 0;
    int y = 0;
    for (int i = 1; i <= yellow; i++) {
      if (yellow % i == 0) {
        x = Math.max(i, yellow/i);
        y = Math.min(i, yellow/i);
        if ((x+2) * (y+2) == sum) break;
      }
    }
    System.out.println((x+2)+" ,"+ (y+2));
    return new int[] {x+2, y+2};
  }
}

