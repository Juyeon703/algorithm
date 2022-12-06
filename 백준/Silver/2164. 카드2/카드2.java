import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      Queue<Integer> queue = new LinkedList<>();
      for (int i = 0; i < n; i++) {
        queue.add(i + 1);
      }
      int size = queue.size();
      for (int i = 1; i < size; i++) {
        queue.poll();
        if (queue.size() == 1) break;
        queue.offer(queue.poll());
      }
      System.out.println(queue.peek());
    }
}