package com.study.programmers.고득점kit.스택큐;

// 고득점kit - level2
// 스택/큐 - 기능 개발

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P42586_230115 {

  public static void main(String[] args) {
    int[] progresses = {93, 30, 55};
    int[] speeds = {1, 30, 5};
    solution(progresses, speeds);
  }

  public static int[] solution(int[] progresses, int[] speeds) {
    Queue<Integer> queue = new LinkedList<>();
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < progresses.length; i++) {
      int date = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
      if (!queue.isEmpty() && queue.peek() < date) {
        list.add(queue.size());
        queue.clear();
      }
      queue.offer(date); // 개발 걸리는 시간 저장
    }
    list.add(queue.size());

    return list.stream().mapToInt(i -> i).toArray();
  }
}
