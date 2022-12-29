package com.study.baekjoon.class1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
  최소, 최대

  -  문제
  N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

  - 입력
  첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
  모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

  - 출력
  첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
*/

public class B10818_221129 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }
    int min = arr[0];
    int max = arr[0];
    for (int i = 0; i < n; i++) {
      if (min > arr[i]) {
        min = arr[i];
      } else if (max < arr[i]) {
        max = arr[i];
      }
    }
    System.out.println(min + " " + max);
    scanner.close();
  }

  static void 배열정렬() {
    // Array
    int[] intArr = new int[]{1, 3, 5, 2, 4};                                //Primitive Type
    double[] doubletArr = new double[]{1.1, 3.3, 5.5, 2.2, 4.4};        //Primitive Type
    String[] stringArr = new String[]{"A", "C", "F", "E", "D"};             //Reference type(Wrapper Class)

    //Sort
    Arrays.sort(intArr);
    Arrays.sort(doubletArr);
    Arrays.sort(stringArr);
    Arrays.sort(intArr, 2, 5);  // intArr[2]~intArr[4]의 값 (5,2,4) 만 정렬 (toIndex 이전 index까지)

    Integer[] integerArr = new Integer[]{1, 3, 5, 2, 4};
    String[] stringArr2 = new String[]{"A", "C", "B", "E", "D"};

    Arrays.sort(integerArr, Comparator.reverseOrder());     //내림차순
    Arrays.sort(stringArr2, Collections.reverseOrder());    //내림차순
    // Collections.sort();
    // Collections.reverse();

    String str = "ACBED";
    String[] stringArr3 = str.split("");   // new String[] {"A","C","F","E","D"}  배열로 변환

    String streamSortASC = Stream.of(stringArr3).sorted().collect(Collectors.joining());    //오름차순
    String streamSortDESC = Stream.of(stringArr3).sorted(Comparator.reverseOrder()).collect(Collectors.joining()); // 내림차순

    //Lambda
    String streamSortASC_Lambda = Stream.of(stringArr3).sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.joining());  //오름차순
    String streamSortDESC_Lambda = Stream.of(stringArr3).sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.joining()); // 내림차순
  }

  static void stringTokenizer() {
    String str = "a b c";
    String str2 = "a,b,c";
    String str3 = "a:b-c-d";
    StringTokenizer st = new StringTokenizer(str); //띄어쓰기 기준으로 문자열 분리
    StringTokenizer st2 = new StringTokenizer(str2, ","); // 구분자,를 기준으로 문자열 분리
    StringTokenizer st3 = new StringTokenizer(str3, "-:", true); //구분자를 기준으로 문자열 분리 + 구분자도 토큰으로 사용(false는 사용 안함)
    while(st3.hasMoreTokens()) {
      System.out.println(st3.nextToken());
    }
  }
}
