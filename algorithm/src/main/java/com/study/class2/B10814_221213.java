package com.study.class2;
/*
  나이순 정렬
  -> 정렬

  - 문제
  온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다.
  이때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.

  - 입력
  첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)

  둘째 줄부터 N개의 줄에는 각 회원의 나이와 이름이 공백으로 구분되어 주어진다.
  나이는 1보다 크거나 같으며, 200보다 작거나 같은 정수이고, 이름은 알파벳 대소문자로 이루어져 있고, 길이가 100보다 작거나 같은 문자열이다.
  입력은 가입한 순서로 주어진다.

  - 출력
  첫째 줄부터 총 N개의 줄에 걸쳐 온라인 저지 회원을 나이 순, 나이가 같으면 가입한 순으로 한 줄에 한 명씩 나이와 이름을 공백으로 구분해 출력한다.

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B10814_221213 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[][] arr = new String[n][2];
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
        arr[i][0] = st.nextToken();
        arr[i][1] = st.nextToken();
    }
    // 숫자를 compareTo로 쓰지않기ㅠ
//    Arrays.sort(arr2, new Comparator<String[]>() {
//      @Override
//      public int compare(String[] o1, String[] o2) {
//        return o1[0].compareTo(o2[0]);
//      }
//    });
//    Arrays.sort(arr, (o1, o2) -> o1[0].compareTo(o2[0]));
//    Arrays.sort(arr, Comparator.comparing(o1 -> o1[0]));

    Arrays.sort(arr, new Comparator<String[]>() {
      @Override
      public int compare(String[] o1, String[] o2) {
        return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
      }
    });
    Arrays.sort(arr, (o1, o2) -> Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]));
    Arrays.sort(arr, Comparator.comparingInt(o1 -> Integer.parseInt(o1[0])));
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i][0] + " " + arr[i][1]);
    }
    // 이차원 배열에서 두번째 요소도 고려하고 싶다면
//    Arrays.sort(arr, new Comparator<String[]>() {
//      @Override
//      public int compare(String[] o1, String[] o2) {
//        if(o1[0].equals(o2[0])) {
//          return o1[1].compareTo(o2[1]);
//        } else {
//          return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
//        }
//      }
//    });
//    Arrays.sort(arr, (o1, o2) -> {
//      if(o1[0].equals(o2[0])) {
//        return o1[1].compareTo(o2[1]);
//      } else {
//        return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
//      }
//    });
//    Arrays.sort(arr, ((o1, o2) -> o1[0].equals(o2[0]) ? o1[1].compareTo(o2[1]) : Integer.parseInt(o1[0]) - Integer.parseInt(o2[0])));
  }
}


