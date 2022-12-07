package com.study;

import java.io.*;

/*
  백설 공주와 일곱 난쟁이
  -> 브루트포스 알고리즘

  - 문제
  매일 매일 일곱 난쟁이는 광산으로 일을 하러 간다. 난쟁이가 일을 하는 동안 백설공주는 그들을 위해 저녁 식사를 준비한다. 백설공주는 의자 일곱개, 접시 일곱개, 나이프 일곱개를 준비한다.

  어느 날 광산에서 아홉 난쟁이가 돌아왔다. (왜 그리고 어떻게 아홉 난쟁이가 돌아왔는지는 아무도 모른다) 아홉 난쟁이는 각각 자신이 백설공주의 일곱 난쟁이라고 우기고 있다.

  백설공주는 이런 일이 생길 것을 대비해서, 난쟁이가 쓰고 다니는 모자에 100보다 작은 양의 정수를 적어 놓았다. 사실 백설 공주는 공주가 되기 전에 매우 유명한 수학자였다.
  따라서, 일곱 난쟁이의 모자에 쓰여 있는 숫자의 합이 100이 되도록 적어 놓았다.

  아홉 난쟁이의 모자에 쓰여 있는 수가 주어졌을 때, 일곱 난쟁이를 찾는 프로그램을 작성하시오. (아홉 개의 수 중 합이 100이 되는 일곱 개의 수를 찾으시오)

  - 입력
  총 아홉개 줄에 1보다 크거나 같고 99보다 작거나 같은 자연수가 주어진다. 모든 숫자는 서로 다르다. 또, 항상 답이 유일한 경우만 입력으로 주어진다.

  - 출력
  일곱 난쟁이가 쓴 모자에 쓰여 있는 수를 한 줄에 하나씩 출력한다.
*/
public class B3040_221201 {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[9];
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(bf.readLine());
      sum += arr[i];
    }
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int temp1 = 0;
    int temp2 = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (sum - arr[i] - arr[j] == 100) {
          temp1 = i;
          temp2 = j;
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if (i != temp1 && i != temp2) bw.write(arr[i] + "\n");
    }
    bw.flush();   //남아있는 데이터를 모두 출력시킴
    bw.close();
  }
}

// ##브루트 포스(Brute Force)
// -> 모든 경우의 수를 탐색하면서 요구조건에 충족되는 결과만을 가져온다.
// 이 알고리즘의 가장 큰 특징은 모든 영역을 전체 탐색하는 방법이다.
//   1. 선형 구조를 전체적으로 탐색하는 순차 탐색
//   2. 비선형 구조를 전체적으로 탐색하는 깊이 우선 탐색(DFS)
//   3. 너비 우선 탐색(BFS)

// ### 조합
// -> n개의 숫자중에서 r개의 수를 순서 없이 뽑는 경우
// 예) [1,2,3] 배열에서 [1,2], [1,3], [2,3]
// nCr = n-1Cr-1 + n-1Cr (하나의 원소를 선택할 경우 + 하나의 원소를 선택하지 않을 경우)

// ### 순열
// -> 주어진 수열에서 순서에 따라 결과가 달라지는 경우