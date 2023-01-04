package com.study.baekjoon;

/*
  복면산
  -> 브루트포스, 백트래킹
  문제
  복면산이란 수학 퍼즐의 일종으로, 어떤 계산식의 각 숫자들을 특정 문자로 바꾸면 각 문자가 어떤 숫자인지 맞추는 퍼즐이다.

  대표적으로 SEND+MORE=MONEY가 있다.

  SEND
  + MORE
  ------
  MONEY
  S=9, E=5, N=6, D=7, M=1, O=0, R=8, Y=2로 바꾸면 식이 성립한다.

  9567
  + 1085
  ------
  10652
  복면산 문제가 주어질 때, 답이 존재하는지 여부를 출력하시오.

  단, 같은 문자는 같은 숫자에 대응되어야 하며, 서로 다른 문자는 서로 다른 숫자를 나타낸다. 또한, 수는 0으로 시작할 수 있다.

  입력
  세 단어가 공백을 두고 주어진다. 첫 번째 단어와 두 번째 단어를 더한 결과가 세 번째 단어임을 의미한다.

  단어는 공백 없이 알파벳 대문자로만 이루어져 있으며 각 단어의 길이는 18자리를 넘지 않는다.

  출력
  계산식에 해답이 존재한다면 YES를, 그렇지 않다면 NO를 한 줄에 출력한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class B15811_230104 {
  static String str1, str2, str3;
  static int[] abc;
  static HashSet<Character> set;
  static boolean result = false;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    str1 = st.nextToken();
    str2 = st.nextToken();
    str3 = st.nextToken();
    if (distinct() > 10) System.out.println("NO");
    else {
      abc = new int[26];
      Arrays.fill(abc, -1);
      int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
      int[] output = new int[set.size()];
      boolean[] visited = new boolean[10];
      permutation(arr, output, visited, 0, set.size());
      if (result) System.out.println("YES");
      else System.out.println("NO");
    }
  }

  static void verification(int[] output) {
    Iterator<Character> iterator = set.iterator();
    for (int i = 0; i < set.size(); i++) {
      abc[iterator.next() - 'A'] = output[i];
    }
    if (calc(str1) + calc(str2) == calc(str3)) result = true;
    System.out.println("result = " + result);
  }

  // 순열 구하기
  // n개 중에서 r개를 순서있게 뽑기
  static void permutation(int[] arr, int[] output, boolean[] visited, int depth, int r) {
    if (!result) { // result가 ture가 된 순간 멈춤
      if (depth == r) {
        for (int a : output) {
          System.out.print(a);
        }
        System.out.println();
        verification(output);
        return;
      }
      for (int i = 0; i < 10; i++) {
        if (!visited[i]) {
          visited[i] = true;
          output[depth] = arr[i];
          permutation(arr, output, visited, depth + 1, r);
          visited[i] = false;
        }
      }
    }
  }

  static int calc(String str) {
    int sum = 0;
    int j = 1;
    for (int i = str.length() - 1; i >= 0; i--) {
      sum += (abc[str.charAt(i) - 'A'] * j);
      j *= 10;
    }
    System.out.println(str + ": " + sum);
    return sum;
  }

  static int distinct() {
    set = new HashSet<>();
    for (int i = 0; i < str1.length(); i++) {
      set.add(str1.charAt(i));
    }
    for (int i = 0; i < str2.length(); i++) {
      set.add(str2.charAt(i));
    }
    for (int i = 0; i < str3.length(); i++) {
      set.add(str3.charAt(i));
    }
    return set.size();
  }
}
