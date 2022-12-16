import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    Queue<Integer> queue = new LinkedList<>();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int value = 0;
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      switch (st.nextToken()) {
        case "push" : value = Integer.parseInt(st.nextToken()); queue.offer(value); break;
        case "pop" : sb.append(queue.isEmpty() ? -1 : queue.poll()).append('\n'); break;
        case "size" : sb.append(queue.size()).append('\n'); break;
        case "empty" : sb.append(queue.isEmpty() ? 1 : 0).append('\n'); break;
        case "front" : sb.append(queue.isEmpty() ? -1 : queue.peek()).append('\n'); break;
        case "back" : sb.append(queue.isEmpty() ? -1 : value).append('\n'); break;
      }
    }
    System.out.println(sb);
  }
}