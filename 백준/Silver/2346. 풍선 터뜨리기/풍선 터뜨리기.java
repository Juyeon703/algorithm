import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Deque<int[]> deque = new ArrayDeque<>();
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 1; i <= n; i++) {
      deque.offerLast(new int[] {i, Integer.parseInt(st.nextToken())});
    }
    StringBuilder sb = new StringBuilder();
    int[] data = deque.removeFirst();

    while (!deque.isEmpty()) {
      sb.append(data[0]).append(' ');
      if (data[1] > 0) {
        for (int i = 1; i < Math.abs(data[1]); i++) {
          deque.offerLast(deque.pollFirst());
        }
        data = deque.removeFirst();
      } else {
        for (int i = 1; i < Math.abs(data[1]); i++) {
          deque.offerFirst(deque.pollLast());
        }
        data = deque.removeLast();
      }
    }
    sb.append(data[0]).append(' ');
    System.out.println(sb);
  }
}