package com.study.programmers.고득점kit.스택큐;

// 고득점kit - level2
// 스택/큐 - 프린터

import java.util.LinkedList;
import java.util.Queue;

public class P42587_230116 {

  public static void main(String[] args) {
    int[] priorities = {2, 1, 3, 2};
    int location = 2;
    solution(priorities, location);
  }

  public static int solution(int[] priorities, int location) {
    int answer = 0;
    Queue<int[]> queue = new LinkedList<>();
    for (int i = 0; i < priorities.length; i++) {
      queue.offer(new int[]{i, priorities[i]});
    }

    int count = 0;
    while (!queue.isEmpty()) {
      int[] data = queue.peek();
      if (max(queue) == data[1]) {
        queue.poll();
        count++;
        if (data[0] == location) {
          answer = count;
          break;
        }
      } else {
        queue.offer(queue.poll());
      }

    }
    System.out.println(answer);
    return answer;
  }

  static int max(Queue<int[]> queue) {
    int max = 0;
    for (int[] temp : queue) {
      max = Math.max(max, temp[1]);
    }
    return max;
  }
}
