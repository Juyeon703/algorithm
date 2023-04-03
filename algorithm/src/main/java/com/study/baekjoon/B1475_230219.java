package com.study.baekjoon;

/*
방 번호
-> 구현

  문제
  다솜이는 은진이의 옆집에 새로 이사왔다. 다솜이는 자기 방 번호를 예쁜 플라스틱 숫자로 문에 붙이려고 한다.

  다솜이의 옆집에서는 플라스틱 숫자를 한 세트로 판다. 한 세트에는 0번부터 9번까지 숫자가 하나씩 들어있다.
  다솜이의 방 번호가 주어졌을 때, 필요한 세트의 개수의 최솟값을 출력하시오. (6은 9를 뒤집어서 이용할 수 있고, 9는 6을 뒤집어서 이용할 수 있다.)

  입력
  첫째 줄에 다솜이의 방 번호 N이 주어진다. N은 1,000,000보다 작거나 같은 자연수이다.

  출력
  첫째 줄에 필요한 세트의 개수를 출력한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1475_230219 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[10];
    String n = br.readLine();
    for (int i = 0; i < n.length(); i++) {
      int number = Character.getNumericValue(n.charAt(i));
      arr[number]++;
    }

    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      if (i == 6 || i == 9) continue;
      max = Math.max(max, arr[i]);
    }
    int sum = arr[6] + arr[9];
    max = Math.max(max, sum%2==0 ? sum/2 : sum/2 + 1);
    System.out.println(max);
  }
}
