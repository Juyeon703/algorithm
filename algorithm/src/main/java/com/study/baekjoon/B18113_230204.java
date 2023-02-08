package com.study.baekjoon;

/*
  그르다 김가놈
  -> 이분 탐색

  문제
  정래는 김밥가게 “그르다 김가놈”에 납품할 김밥을 만드는 김밥 공장을 운영한다.
  정래는 김밥 양쪽 끝을 “꼬다리”라고 부른다. 그리고 꼬다리를 잘라낸 김밥을 “손질된 김밥”이라고 부른다.

  공장에서는 김밥 N개에 대해서, 김밥 꼬다리를 잘라내고 손질된 김밥을 김밥조각으로 만드는 작업을 한다.
  꼬다리를 잘라낼 때에는 양쪽에서 균일하게 K cm만큼 잘라낸다.
  만약 김밥의 길이가 2K cm보다 짧아서 한쪽밖에 자르지 못한다면, 한쪽만 꼬다리를 잘라낸다.
  김밥 길이가 K cm이거나 그보다 짧으면 그 김밥은 폐기한다.

  손질된 김밥들은 모두 일정한 길이 P로 잘라서 P cm의 김밥조각들로 만든다. P는 양의 정수여야 한다.
  정래는 일정한 길이 P cm로 자른 김밥조각을 최소 M개 만들고 싶다. P를 최대한 길게 하고 싶을 때, P는 얼마로 설정해야 하는지 구하시오.

  입력
  첫 번째 줄에 손질해야 하는 김밥의 개수 N, 꼬다리의 길이 K, 김밥조각의 최소 개수 M이 주어진다. (1 ≤ N ≤ 106, 1 ≤ K, M ≤ 109, N, K, M은 정수)

  두 번째 줄부터 김밥의 길이 L이 N개 주어진다. (1 ≤ L ≤ 109, L은 정수)

  출력
  김밥조각의 길이 P를 최대로 할 때, P를 출력한다. 만족하는 P가 없는 경우, -1을 출력한다.
  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B18113_230204 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken()); // 김밥 개수
    int k = Integer.parseInt(st.nextToken()); // 꼬다리 길이
    int m = Integer.parseInt(st.nextToken()); // 김밥조각 최소 개수
    List<Integer> list = new ArrayList<>();
    int max = 0;

    for (int i = 0; i < n; i++) {
      int value = Integer.parseInt(br.readLine());
//      if (value <= 2 * k) continue;
//      list.add(value - 2 * k);
      if (value > (2 * k)) {
        list.add(value - (2 * k));
        max = Math.max(max, value - (2*k));
      } else if (2*k > value && value>k) {
        list.add(value - k);
        max = Math.max(max, value - k);
      }
    }

    int start = 1;
    int end = max;
    int result = -1;

    while (end - start >= 0) {
      int mid = (end + start) / 2;
//      System.out.println("mid = " + mid);
      int sum = 0;
      for (int a : list) {
        sum += a / mid;
      }
      if (sum >= m) {
        result = mid;
//        System.out.println("result = " + result);
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    System.out.println(result);
  }
}
