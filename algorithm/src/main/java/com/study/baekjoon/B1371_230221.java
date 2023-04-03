package com.study.baekjoon;

/*
가장 많은 글자

  문제
  영어에서는 어떤 글자가 다른 글자보다 많이 쓰인다. 예를 들어, 긴 글에서 약 12.31% 글자는 e이다.

  어떤 글이 주어졌을 때, 가장 많이 나온 글자를 출력하는 프로그램을 작성하시오.

  입력
  첫째 줄부터 글의 문장이 주어진다. 글은 최대 50개의 줄로 이루어져 있고, 각 줄은 최대 50개의 글자로 이루어져 있다.
  각 줄에는 공백과 알파벳 소문자만 있다. 문장에 알파벳은 적어도 하나 이상 있다.

  출력
  첫째 줄에 가장 많이 나온 문자를 출력한다. 여러 개일 경우에는 알파벳 순으로 앞서는 것부터 모두 공백없이 출력한다.
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1371_230221 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[26];
    String str;
    while ((str = br.readLine()) != null && !str.isEmpty()) {
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == ' ') continue;
        arr[str.charAt(i) - 'a']++;
      }
    }

    int max = 0;
    for (int a : arr) {
      max = Math.max(max, a);
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == max) System.out.print((char) (i + 'a'));
    }
  }
}
