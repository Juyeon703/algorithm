package com.study.class2;

/*
  직각삼각형
  -> 수학, 기하학, 피타고라스 정리

  - 문제
  과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다.
  주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.

  - 입력
  입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다.
  각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며, 각 입력은 변의 길이를 의미한다.

  - 출력
  각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다.
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B4153_221210 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    while (true) {
      String str = br.readLine();
      st = new StringTokenizer(str);
      if (str.equals("0 0 0")) {
        break;
      }
      int[] arr = new int[3];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = Integer.parseInt(st.nextToken());
      }
      Arrays.sort(arr);
      if (arr[2] * arr[2] == arr[0] * arr[0] + arr[1] * arr[1]) System.out.println("right");
      else System.out.println("wrong");
    }
  }
}
