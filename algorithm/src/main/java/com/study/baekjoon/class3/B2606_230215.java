package com.study.baekjoon.class3;

/*
  바이러스
  -> 그래프 이론, 그래프 탐색, 너비우선탐색, 깊이 우선탐색

  문제
  신종 바이러스인 웜 바이러스는 네트워크를 통해 전파된다.
  한 컴퓨터가 웜 바이러스에 걸리면 그 컴퓨터와 네트워크 상에서 연결되어 있는 모든 컴퓨터는 웜 바이러스에 걸리게 된다.

  예를 들어 7대의 컴퓨터가 <그림 1>과 같이 네트워크 상에서 연결되어 있다고 하자.
  1번 컴퓨터가 웜 바이러스에 걸리면 웜 바이러스는 2번과 5번 컴퓨터를 거쳐 3번과 6번 컴퓨터까지 전파되어 2, 3, 5, 6 네 대의 컴퓨터는 웜 바이러스에 걸리게 된다.
  하지만 4번과 7번 컴퓨터는 1번 컴퓨터와 네트워크상에서 연결되어 있지 않기 때문에 영향을 받지 않는다.

  어느 날 1번 컴퓨터가 웜 바이러스에 걸렸다.
  컴퓨터의 수와 네트워크 상에서 서로 연결되어 있는 정보가 주어질 때, 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 출력하는 프로그램을 작성하시오.

  입력
  첫째 줄에는 컴퓨터의 수가 주어진다.
  컴퓨터의 수는 100 이하이고 각 컴퓨터에는 1번 부터 차례대로 번호가 매겨진다.
  둘째 줄에는 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수가 주어진다.
  이어서 그 수만큼 한 줄에 한 쌍씩 네트워크 상에서 직접 연결되어 있는 컴퓨터의 번호 쌍이 주어진다.

  출력
  1번 컴퓨터가 웜 바이러스에 걸렸을 때, 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 첫째 줄에 출력한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2606_230215 {

  static int[][] arr;
  static boolean[] visited;
  static int computer;
  static int count;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    computer = Integer.parseInt(br.readLine());
    int line = Integer.parseInt(br.readLine());
    arr = new int[computer + 1][computer + 1];
    visited = new boolean[computer + 1];

    for (int i = 0; i < line; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      arr[a][b] = arr[b][a] = 1;
    }

//    for (int i = 1; i <= computer; i++) {
//      for (int j = 1; j <= computer; j++) {
//        System.out.print(arr[i][j] + " ");
//      }
//      System.out.println();
//    }
//    System.out.println();
//    for (int i = 0; i < visited.length; i++) {
//      System.out.print(visited[i] +" ");
//    }
//    System.out.println();

    System.out.println(dfs(1));
  }

  public static int dfs(int start) {

    visited[start] = true;

    System.out.println();
    for (int i = 0; i < visited.length; i++) {
      System.out.print(visited[i] + " ");
    }
    System.out.println();

    for (int j = 1; j <= computer; j++) {
      if (arr[start][j] == 1 && visited[j] == false) {
        count++;
        dfs(j);
      }
    }
    return count;
  }
}
