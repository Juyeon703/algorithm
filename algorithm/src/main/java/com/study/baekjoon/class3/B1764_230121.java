package com.study.baekjoon.class3;

/*
  듣보잡
  -> 자료구조, 문자열, 정렬, 해시를 사용한 집합과 맵

  문제
  김진영이 듣도 못한 사람의 명단과, 보도 못한 사람의 명단이 주어질 때, 듣도 보도 못한 사람의 명단을 구하는 프로그램을 작성하시오.

  입력
  첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다.
  이어서 둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과, N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다.
  이름은 띄어쓰기 없이 알파벳 소문자로만 이루어지며, 그 길이는 20 이하이다. N, M은 500,000 이하의 자연수이다.

  듣도 못한 사람의 명단에는 중복되는 이름이 없으며, 보도 못한 사람의 명단도 마찬가지이다.

  출력
  듣보잡의 수와 그 명단을 사전순으로 출력한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1764_230121 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken()); // 듣도 못한 사람
    int m = Integer.parseInt(st.nextToken()); // 보도 못한 사람
    HashSet<String> set = new HashSet<>();
    List<String> result = new ArrayList<>();
    for (int i = 0; i < n + m; i++) {
      if (i < n) {
        set.add(br.readLine());
      } else {
        String str = br.readLine();
        if (set.contains(str)) {
          result.add(str);
        }
      }
    }
    StringBuilder sb = new StringBuilder();
    sb.append(result.size()).append('\n');
    Collections.sort(result);
    for (String s : result) {
      sb.append(s).append('\n');
    }
    System.out.println(sb);
  }
}
