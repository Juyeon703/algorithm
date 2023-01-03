
import java.io.*;
import java.util.StringTokenizer;

public class Main {
  static int n, z, m;
  static boolean[] tf;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken()); // 필드의 수
    z = Integer.parseInt(st.nextToken()); // 도착해야하는 필드
    m = Integer.parseInt(st.nextToken()); // 장애물 필드 개수

    tf = new boolean[n + 1];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < m; i++) {
      tf[Integer.parseInt(st.nextToken())] = true;
    }

    System.out.println(function());

  }

  static int function() {
    for (int k = 1; k < z; k++) {
      boolean[] visited = tf.clone();
      int start = 1;

      while (true) {
        if (start == z) return k;

        if (visited[start]) break;
        else visited[start] = true;
        start = (start + k) % n;
        if (start == 0) start = n;
      }
    }
    return -1;
  }
}
