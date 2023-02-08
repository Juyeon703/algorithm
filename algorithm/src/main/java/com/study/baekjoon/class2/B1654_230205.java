package com.study.baekjoon.class2;


/*
  랜선 자르기
  -> 이분 탐색, 매개변수 탐색

  문제
  집에서 시간을 보내던 오영식은 박성원의 부름을 받고 급히 달려왔다.
  박성원이 캠프 때 쓸 N개의 랜선을 만들어야 하는데 너무 바빠서 영식이에게 도움을 청했다.

  이미 오영식은 자체적으로 K개의 랜선을 가지고 있다. 그러나 K개의 랜선은 길이가 제각각이다.
  박성원은 랜선을 모두 N개의 같은 길이의 랜선으로 만들고 싶었기 때문에 K개의 랜선을 잘라서 만들어야 한다.
  예를 들어 300cm 짜리 랜선에서 140cm 짜리 랜선을 두 개 잘라내면 20cm는 버려야 한다. (이미 자른 랜선은 붙일 수 없다.)

  편의를 위해 랜선을 자르거나 만들 때 손실되는 길이는 없다고 가정하며, 기존의 K개의 랜선으로 N개의 랜선을 만들 수 없는 경우는 없다고 가정하자.
  그리고 자를 때는 항상 센티미터 단위로 정수길이만큼 자른다고 가정하자.
  N개보다 많이 만드는 것도 N개를 만드는 것에 포함된다. 이때 만들 수 있는 최대 랜선의 길이를 구하는 프로그램을 작성하시오.

  입력
  첫째 줄에는 오영식이 이미 가지고 있는 랜선의 개수 K, 그리고 필요한 랜선의 개수 N이 입력된다.
  K는 1이상 10,000이하의 정수이고, N은 1이상 1,000,000이하의 정수이다. 그리고 항상 K ≦ N 이다.
  그 후 K줄에 걸쳐 이미 가지고 있는 각 랜선의 길이가 센티미터 단위의 정수로 입력된다. 랜선의 길이는 231-1보다 작거나 같은 자연수이다.

  출력
  첫째 줄에 N개를 만들 수 있는 랜선의 최대 길이를 센티미터 단위의 정수로 출력한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1654_230205 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int k = Integer.parseInt(st.nextToken()); // 가지고 있는 랜선 개수
    int n = Integer.parseInt(st.nextToken()); // 필요한 랜선 개수
    long[] arr = new long[k];

    long max = 0;

    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(br.readLine());
      max = Math.max(max, arr[i]);
    }

    long min = 1; // 탐색 길이 최솟값

    // min = 0, max 는 입력받은 LAN선 중 가장 긴 길이를 갖는다.
    while (min <= max) {

      // 범위 내에서 중간 길이를 구한다.
      long mid = (max + min) / 2;
      System.out.println("mid = " + mid);

      long count = 0;

      // 구해진 중간 길이로 잘라서 총 몇 개가 만들어지는지를 구한다.
      for (int i = 0; i < arr.length; i++) {
        count += (arr[i] / mid);
      }
      System.out.println("count = " + count);
      /*
       *  [upper bound 형식]
       *
       *  mid길이로 잘랐을 때의 개수가 만들고자 하는 랜선의 개수보다 작다면
       *  자르고자 하는 길이를 줄이기 위해 최대 길이를 줄인다.
       *  그 외에는 자르고자 하는 길이를 늘려야 하므로 최소 길이를 늘린다.
       */
      if(count < n) {
        max = mid - 1;
      }
      else {
        min = mid + 1;
      }
    }

    System.out.println(max);
  }
}
