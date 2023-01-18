package com.study.baekjoon.쇼미더코드;

import java.util.Arrays;
import java.util.Scanner;

public class show2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }
    int max = 1;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j <= n; j++) {
//        System.out.println(i + ", " + j);
        int left = 0;
        int right = 0;
        if (arr[i] == arr[j - 1]) {
          int[] temp = Arrays.copyOfRange(arr, i, j);
          for (int k = 0; k < temp.length; k++) {
            if (temp[k] == 1) left++;
            else right++;
          }
        }
//        System.out.println("(left-right) = " + left +" / "+ right);
        max = Math.max(max, Math.abs(left - right));
      }
    }
    System.out.println(max);
    scanner.close();
  }
}