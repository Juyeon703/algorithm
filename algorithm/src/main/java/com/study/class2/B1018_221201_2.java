package com.study.class2;

import java.io.*;
import java.util.StringTokenizer;

/*
  - 문제
  지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 M×N 크기의 보드를 찾았다.
  어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다. 지민이는 이 보드를 잘라서 8×8 크기의 체스판으로 만들려고 한다.

  체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다. 구체적으로, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고, 변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다.
  따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다. 하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다.

  보드가 체스판처럼 칠해져 있다는 보장이 없어서, 지민이는 8×8 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠해야겠다고 생각했다.
  당연히 8*8 크기는 아무데서나 골라도 된다. 지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.

  - 입력
  첫째 줄에 N과 M이 주어진다. N과 M은 8보다 크거나 같고, 50보다 작거나 같은 자연수이다.
  둘째 줄부터 N개의 줄에는 보드의 각 행의 상태가 주어진다. B는 검은색이며, W는 흰색이다.

  - 출력
  첫째 줄에 지민이가 다시 칠해야 하는 정사각형 개수의 최솟값을 출력한다.
*/

// ##브루트 포스(Brute Force)
// -> 모든 경우의 수를 탐색하면서 요구조건에 충족되는 결과만을 가져온다.
// 이 알고리즘의 가장 큰 특징은 모든 영역을 전체 탐색하는 방법이다.

public class B1018_221201_2 {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(bf.readLine()); // readLine 예외처리 필요
    int n = Integer.parseInt(st.nextToken()); // 세로
    int m = Integer.parseInt(st.nextToken()); // 가로
    // 입력값 2차원 배열에 집어넣기
    boolean[][] arr = new boolean[n][m];
    for (int i = 0; i < n; i++) {
      String str = bf.readLine();
      for (int j = 0; j < m; j++) {
        if (str.charAt(j) == 'W') arr[i][j] = true;
        else arr[i][j] = false;
      }
    }
    // 8*8 크기로 자르기
    int min = 64;
    for (int i = 0; i < n - 7; i++) {
      for (int j = 0; j < m - 7; j++) {
//        System.out.println("[" + i + "," + j + "] = " + arr[i][j]);
        int count = Math.min(function(arr, i, j), 64 - function(arr, i, j));
        if (count < min) min = count;
      }
    }
//    System.out.println("min = " + min);
    bw.write(min + "\n");
    bw.flush();   //남아있는 데이터를 모두 출력시킴
    bf.close();
    bw.close();
  }

  static int function(boolean[][] arr, int startN, int startM) {
    int count = 0;
    boolean tf = arr[startN][startM]; // 첫번째 칸의 색
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if(arr[startN + i][startM + j] != tf) count++; // 올바른 색이 아닐경우 카운트 1 증가
        tf = (!tf); // 다음칸은 색이 바뀌므로 값 변경하기
      }
      tf = !tf;
    }
    System.out.println("count = " + count);
    return count;
  }
}
