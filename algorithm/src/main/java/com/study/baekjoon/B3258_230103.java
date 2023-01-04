package com.study.baekjoon;
/*
  컴포트
  -> 구현, 브루트포스 알고리즘, 시뮬레이션

  문제
  원 모양으로 나열된 N개의 필드를 가진 게임판이 있다. 각 필드는 1~N까지 시계방향으로 숫자가 매겨져 있다.
  몇개의 필드에는 장애물이 놓여져 있다.

  아람이는 1에서 게임을 시작한다. Z번째 필드에 도착하는 것이 이 게임의 목표이다.
  도착점은 K만큼씩 시계방향으로 이동해 도달해야 한다. 도착점으로 가는 길에 장애물이 있는 필드를 밟아서는 안 된다.

  예를들어 N=13, K=3 그리고 Z=9라고 했을 때 아람이는 1,4,7,10,13,3,6 그리고 9 의 필드를 지나게 된다.
  도착점으로 가는 경로 중 장애물이 있는 필드가 하나라도 있으면 안 된다.

  게임판의 정보가 주어졌을 때 도착점에 도착할 수 있는 가장 작은 K를 찾는 프로그램을 작성하시오.

  입력
  입력의 첫째 줄에는 N(2 ≤ N ≤ 1000), Z(2 ≤ Z), M(0 ≤ M ≤ N-2) 이 주어진다.

  N은 필드의 수이고 Z는 도착해야하는 필드의 번호를 의미한다.

  다음 줄에 M개의 서로 다른 정수가 주어진다. 이 정수는 장애물이 있는 필드의 번호를 나타낸다.

  1번과 Z번째 필드에는 장애물이 놓이지 않는다.

  출력
  출력의 첫 번째 줄에 위에서 정의되어진 K를 출력한다.
*/

import java.io.*;
import java.util.StringTokenizer;

public class B3258_230103 {
  static int n, z, m;
  static boolean[] tf;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken()); // 필드의 수
    z = Integer.parseInt(st.nextToken()); // 도착해야하는 필드
    m = Integer.parseInt(st.nextToken()); // 장애물 필드 개수

    tf = new boolean[n + 1];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < m; i++) {
      tf[Integer.parseInt(st.nextToken())] = true;
    }
//    for (boolean b : tf) {
//      System.out.print(b + " ");
//    }
//    System.out.println();
    System.out.println(function());

  }

  static int function() {
    for (int k = 1; k < n; k++) {
      boolean[] visited = tf.clone();
      int start = 1;
//      System.out.println(k + "실행");
      while (true) {
        if (start == z) return k;

//        System.out.println("실행됨" + start);
        if (visited[start]) break;
        else visited[start] = true;
        start += k;
        if (start > n) start -= n;
      }
    }
    return -1;
  }
}
