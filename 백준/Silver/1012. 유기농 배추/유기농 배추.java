import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int[][] arr;
  static boolean[][] visited;
  
  static int[] xx = {0, 0, 1, -1};
  static int[] yy = {1, -1, 0, 0};
  
  static int m;
  static int n;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    // 테스트 케이스
    for (int i = 0; i < t; i++) {
      // 배추밭 크기
      StringTokenizer st = new StringTokenizer(br.readLine());
      m = Integer.parseInt(st.nextToken()); // 가로
      n = Integer.parseInt(st.nextToken()); // 세로
      int k = Integer.parseInt(st.nextToken()); // 배추 개수
      // 배추 심기
      arr = new int[n][m];
      visited = new boolean[n][m];
      int count = 0;
      for (int j = 0; j < k; j++) {
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        arr[y][x] = 1;
      }

      for (int j = 0; j < n; j++) {
        for (int l = 0; l < m; l++) {
          if (arr[j][l] == 1 && !visited[j][l]) {
            count++;
            dfs(j, l);
          }
        }
      }
      System.out.println(count);
    }
  }

  static void dfs(int y, int x) {
    visited[y][x] = true;

    for (int i = 0; i < 4; i++) {
      int tempX = x + xx[i];
      int tempY = y + yy[i];
      
      if (tempX >= 0 && tempY >= 0 && tempX < m && tempY < n) {
        if (arr[tempY][tempX] == 1 && !visited[tempY][tempX]) {
          dfs(tempY, tempX);
        }
      }
    }
  }
}