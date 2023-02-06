import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken()); // 세로
    int m = Integer.parseInt(st.nextToken()); // 가로
    int b = Integer.parseInt(st.nextToken()); // 인벤토리 블록 개수

    int max = 0;
    int min = 256;

    int[][] arr = new int[n][m];
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < m; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
        max = Math.max(max, arr[i][j]);
        min = Math.min(min, arr[i][j]);
      }
    }

    int rTime = Integer.MAX_VALUE;
    int rHeight = Integer.MIN_VALUE;
    for (int i = max; i >= min; i--) {
      int time = 0;
      int inventory = b;

      for (int j = 0; j < n; j++) {
        for (int k = 0; k < m; k++) {
          if (arr[j][k] == i) continue;
          else {
            int diff = i - arr[j][k];
            if (diff > 0) {
              inventory -= diff;
              time += diff;
            } else {
              inventory -= diff;
              time -= (2 * diff);
            }
          }
        }
      }
      if (inventory >= 0 && rTime > time) {
        rTime = time;
        rHeight = i;
      } else if (inventory >= 0 && rTime == time && rHeight < i) {
        rHeight = i;
      }
    }
    System.out.println(rTime + " " + rHeight);
  }
}