package com.study.baekjoon;

/*
큰 수 만들기
  -> 그리디 알고리즘, 정렬
문제
  음이 아닌 정수가 N개 들어있는 리스트가 주어졌을 때, 리스트에 포함된 수를 나열하여 만들 수 있는 가장 큰 수를 구하는 프로그램을 작성하시오.

  입력
  첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄에는 리스트에 포함된 수가 주어진다.
  수는 공백으로 구분되어져 있고, 1,000,000,000보다 작거나 같은 음이 아닌 정수 이다.
  0을 제외한 나머지 수는 0으로 시작하지 않으며, 0이 주어지는 경우 0 하나가 주어진다.

  출력
  리스트에 포함된 수를 나열하여 만들 수 있는 가장 큰 수를 출력한다. 수는 0으로 시작하면 안되며, 0이 정답인 경우 0 하나를 출력해야 한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B16496_230109 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      arr[i] = st.nextToken();
    }
    Arrays.sort(arr, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
       return (o2 + o1).compareTo(o1 + o2);
      }
    });
    for (String s : arr) {
      sb.append(s);
//      System.out.print(s + " ");
    }
    System.out.println(sb.charAt(0) == '0' ? 0 : sb.toString());
  }
}
