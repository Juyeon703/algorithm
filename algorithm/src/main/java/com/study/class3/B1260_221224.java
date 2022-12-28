package com.study.class3;
/*
  DFS와 BFS
  -> 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색

  문제
  그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오.
  단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료한다.
  정점 번호는 1번부터 N번까지이다.

  입력
  첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다.
  다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다.
  어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.

  출력
  첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1260_221224 {

  static int[][] arr;
  static boolean[] check;
  static int n, m, v;
  static StringBuilder sb;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken()); // 정점의 개수
    m = Integer.parseInt(st.nextToken()); // 간선의 개수
    v = Integer.parseInt(st.nextToken()); // 탐색 시작

    arr = new int[n + 1][n + 1];

    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      arr[a][b] = arr[b][a] = 1;
    }

//    for (int j = 0; j < n + 1; j++) {
//      for (int l = 0; l < n + 1; l++) {
//        System.out.print(arr[j][l] + " ");
//      }
//      System.out.println();
//    }

    sb = new StringBuilder();

    check = new boolean[n + 1];
    dfs(v);

    sb.append('\n');

    check = new boolean[n + 1];
    bfs(v);
    System.out.println(sb);
  }


  static void dfs(int start) {
    check[start] = true;
//    System.out.println("<dfs tf>");
//    for (boolean tf : check) {
//      System.out.print(tf + " ");
//    }
//    System.out.println();

//    System.out.print(start + " ");
    sb.append(start).append(' ');

    for (int i = 0; i <= n; i++) {
      if (arr[start][i] == 1 && !check[i])
        dfs(i);
    }
  }

  static void bfs(int start) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(start);
    check[start] = true;
//    System.out.println("<bfs!! tf>");
//    for (boolean tf : check) {
//      System.out.print(tf + " ");
//    }
//    System.out.println();

    while (!queue.isEmpty()) {
      start = queue.poll();
//      System.out.print(start + " ");
      sb.append(start).append(' ');

      for (int i = 1; i <= n; i++) {
        if (arr[start][i] == 1 && !check[i]) {
          queue.add(i);
          check[i] = true;
//          System.out.println("<bfs!! tf>");
//          for (boolean tf : check) {
//            System.out.print(tf + " ");
//          }
//          System.out.println();
        }
      }
    }
  }
}
