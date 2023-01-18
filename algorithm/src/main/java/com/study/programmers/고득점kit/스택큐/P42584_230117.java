package com.study.programmers.고득점kit.스택큐;

// 고득점kit - level2
// 스택/큐 - 주식 가격


public class P42584_230117 {
  public static void main(String[] args) {
    int[] prices2 = {1, 2, 3, 2, 3};
    int[] prices = {5, 6, 5, 2, 4}; // 3 1 1 1 0
    solution(prices);
  }

  public static int[] solution(int[] prices) {
    int[] answer = new int[prices.length];

    for (int i = 0; i < prices.length; i++) {
      for (int j = i + 1; j < prices.length ; j++) {
        answer[i]++;
        if (prices[i] > prices[j]) break;
      }
    }

    return answer;
  }
}
