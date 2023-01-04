package com.study.programmers.고득점kit.완전탐색;

// 고득점kit level1
// 완전탐색 - 최소직사각형
public class p86491_230102 {
  public static void main(String[] args) {
//    int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
//    int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
    int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
    solution(sizes);
  }

  static int solution(int[][] sizes) {
    int max = 0;
    int max2 = 0;
    for (int i = 0; i < sizes.length; i++) {
      if (sizes[i][0] > sizes[i][1]) {
        if (sizes[i][0] > max) max = sizes[i][0];
        if (sizes[i][1] > max2) max2 = sizes[i][1];
      } else {
        if (sizes[i][0] > max2) max2 = sizes[i][0];
        if (sizes[i][1] > max) max = sizes[i][1];
      }
    }
    System.out.println(max * max2);
    return max * max2;
  }
}
