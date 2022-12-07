package com.study;

/*
    소수 찾기
    -> 수학, 정수론, 소수 판정, 에라토스테네스의 체

  - 문제
  주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

  - 입력
  첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

  - 출력
  주어진 수들 중 소수의 개수를 출력한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1978_221205 {
  static int count = 0;
  static int[] arr;


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    prime();
    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(st.nextToken());
      if (arr[num] != 0) count++;
    }
    System.out.println(count);
    br.close();
  }

  static void prime() {
    int number = 1000;
    arr = new int[number + 1];
    // 배열 초기화
    for (int i = 2; i < number + 1 ; i++) {
      arr[i] = i;
    }

    // 2부터 시작해서 i의 배수들을 배열에서 제거한다.
    for (int i = 2; i < number + 1; i++) {
      if (arr[i] == 0) continue; // 이미 지워진 수는 건너뛴다.
      for (int j = i * 2 ; j < number + 1 ; j += i) {
        arr[j] = 0;
      }
    }
  }
}

// 에라토스테네스의 체?
// : 소수를 판별하는 알고리즘, 대량으로 빠르고 정확하게 구하는 방법
// 원리
// - 에라토스테네스의 체는 가장 먼저 소수를 판별할 범위만큼 배열을 할당하여, 해당하는 값을 넣어주고, 이후에 하나씩 지워나가는 방법을 이용한다.
//  1. 배열을 생성하여 초기화한다.
//  2. 2부터 시작해서 특정 수의 배수에 해당하는 수를 모두 지운다.(지울 때 자기자신은 지우지 않고, 이미 지워진 수는 건너뛴다.)
//  3. 2부터 시작하여 남아있는 수를 모두 출력한다.
