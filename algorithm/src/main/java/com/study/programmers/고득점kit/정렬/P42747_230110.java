package com.study.programmers.고득점kit.정렬;

// 고득점kit level2
// 정렬 - H-index

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class P42747_230110 {
  public static void main(String[] args) {
    int[] citations = {3, 0, 6, 1, 5};
    int[] citations2 = {4, 1};
    solution(citations);
  }

  public static int solution(int[] citations) {
    int answer = 0;
    Arrays.sort(citations);
    for (int a : citations) {
      System.out.print(a + " ");
    }
    System.out.println();
    for (int i = citations.length; i > 0; i--) {
      int count = 0;
      for (int j = 0; j < citations.length; j++) {
        if (citations[j] >= i) count++;
      }
      if (count >= i) {
        answer = i;
        break;
      }
    }
    return answer;
  }
}
