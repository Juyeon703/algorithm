package com.study.baekjoon.class1;

 /*

  단어의 개수

  - 문제
  영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까?
  이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

  - 입력
  첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다.
  단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.

  - 출력
  첫째 줄에 단어의 개수를 출력한다.
*/

import java.util.Scanner;
import java.util.StringTokenizer;

public class B1152_221130 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    scanner.close();
    // 1)
    StringTokenizer st = new StringTokenizer(str);
    int num = 0;
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
      num++;
    }
    System.out.println(num);
    // 1.5)
    StringTokenizer st2 = new StringTokenizer(str);
    System.out.println(st2.countTokens());
    // 2)
    str = str.trim(); // 왼쪽에 있는 공백, 오른쪽에 있는 공백을 다 제거해줌, 가운데 공백은 제거 안함
    if (str == "") { // 엔터만 쳤을 때 1 나와서
      System.out.println(0);
      return;
    }
    String[] arr = str.split(" ");
    System.out.println(arr.length);
  }
}
