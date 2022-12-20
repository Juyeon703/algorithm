import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    Queue<Integer> queue = new LinkedList<>();
    for (int i = 1; i <= n; i++) {
      queue.offer(i);
    }
    StringBuilder sb = new StringBuilder();
    sb.append('<');
    while (queue.size() > 1) {
      for (int i = 1; i < k; i++) {
        queue.offer(queue.poll());
      }
      sb.append(queue.poll()).append(", ");
    }
    sb.append(queue.poll()).append(">");
    System.out.println(sb);
  }
}