package com.study.programmers.고득점kit.정렬;
// 고득점kit level1
// 정렬 - k번째 수

import java.util.Arrays;

public class P42748_230109 {
  public static void main(String[] args) {
    int[] array = {1,5,2,6,3,7,4};
    int[][] commands = {{2,5,3,},{4,4,1},{1,7,3}};
    solution(array, commands);
  }

    public static int[] solution(int[] array, int[][] commands) {
      int[] answer = new int[commands.length];
      for (int i = 0; i < commands.length; i++) {
        int[] arr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
        Arrays.sort(arr);
        answer[i] = arr[commands[i][2] - 1];
//        for (int a :arr) {
//          System.out.print(a+" ");
//        }
//        System.out.println();
      }
//      for (int b : answer) {
//        System.out.print(b + " ");
//      }
      return answer;
    }
  }

