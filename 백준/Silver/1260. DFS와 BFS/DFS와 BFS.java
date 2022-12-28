import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

  static int[][] arr;
  static boolean[] check;
  static int n, m, v;
  static StringBuilder sb;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken()); // 정점의 개수
    m = Integer.parseInt(st.nextToken()); // 간선의 개수
    v = Integer.parseInt(st.nextToken()); // 탐색 시작

    arr = new int[n + 1][n + 1];

    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      arr[a][b] = arr[b][a] = 1;
    }

    sb = new StringBuilder();

    check = new boolean[n + 1];
    dfs(v);

    sb.append('\n');

    check = new boolean[n + 1];
    bfs(v);
    System.out.println(sb);
  }


  static void dfs(int start) {
    check[start] = true;
    sb.append(start).append(' ');

    for (int i = 0; i <= n; i++) {
      if (arr[start][i] == 1 && !check[i])
        dfs(i);
    }
  }

  static void bfs(int start) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(start);
    check[start] = true;

    while (!queue.isEmpty()) {
      start = queue.poll();
      sb.append(start).append(' ');

      for (int i = 1; i <= n; i++) {
        if (arr[start][i] == 1 && !check[i]) {
          queue.add(i);
          check[i] = true;
        }
      }
    }
  }
}