import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

  class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
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