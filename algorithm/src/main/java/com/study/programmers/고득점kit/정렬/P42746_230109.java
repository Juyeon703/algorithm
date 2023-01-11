package com.study.programmers.고득점kit.정렬;

// 고득점kit level2
// 정렬 - 가장 큰 수
import java.util.Arrays;

public class P42746_230109 {
  public static void main(String[] args) {
    int[] numbers = {3, 30, 34, 5, 9};
    solution(numbers);
  }

  public static String solution(int[] numbers) {
    StringBuilder answer = new StringBuilder();
    String[] number = new String[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      number[i] = String.valueOf(numbers[i]);
    }
    Arrays.sort(number, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
    if (number[0].equals("0")) {
      return "0";
    } else {
      for (String s : number) {
        answer.append(s);
      }
      System.out.println(answer);
      return answer.toString();
    }
  }
}
