package com.study.baekjoon.class1;

/*
  단어 공부
  -> 구현 문자열

  문제
  알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
  단, 대문자와 소문자를 구분하지 않는다.

  입력
  첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

  출력
  첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
  단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1157_221231 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int[] arr = new int[26];
    // 대문자 범위 65~90
    // 소문자 범위 97~122
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) <= 90) arr[str.charAt(i) - 'A']++;
      else arr[str.charAt(i) - 'a']++;
    }
    int max = 0;
    char result = '?';
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
        result = (char) (i + 65);
      }
      else if (arr[i] == max) result = '?';
    }
    System.out.println(result);
  }
}
