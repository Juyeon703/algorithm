package com.study.programmers.고득점kit.완전탐색;

import java.util.ArrayList;
import java.util.List;

// 고득점kit level1
// 완전탐색 - 모의고사
public class P42840_230102 {
  public static void main(String[] args) {
//    int[] answers = {1, 2, 3, 4, 5};
    int[] answers = {1, 3, 2, 4, 2};
    solution(answers);
  }

  public static int[] solution(int[] answers) {
    int[] student1 = {1,2,3,4,5};
    int[] student2 = {2,1,2,3,2,4,2,5};
    int[] student3 = {3,3,1,1,2,2,4,4,5,5};
    int count[] = new int[3];
    for (int i = 0; i < answers.length; i++) {
      if (student1[i%5] == answers[i]) count[0]++;
      if (student2[i%8] == answers[i]) count[1]++;
      if (student3[i%10] == answers[i]) count[2]++;
    }
    int max = 0;
    for (int i = 0; i < 3; i++) {
      if (count[i] > max) max = count[i];
    }
    List<Integer> list = new ArrayList<>();
    if (max == count[0]) list.add(1);
    if (max == count[1]) list.add(2);
    if (max == count[2]) list.add(3);
    int[] answer = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      answer[i] = list.get(i);
      System.out.println(answer[i]);
    }
    return answer;
  }
}
