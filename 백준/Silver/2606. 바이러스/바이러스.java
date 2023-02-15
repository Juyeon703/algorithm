import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static int[][] arr;
  static boolean[] visited;
  static int computer;
  static int count;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    computer = Integer.parseInt(br.readLine());
    int line = Integer.parseInt(br.readLine());
    arr = new int[computer+1][computer+1];
    visited = new boolean[computer+1];

    for (int i = 0; i < line; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      arr[a][b] = arr[b][a] = 1;
    }
    System.out.println(dfs(1));
  }

  public static int dfs(int i) {

    visited[i] = true;

    for(int j=1; j <= computer; j++) {
      if(arr[i][j] == 1 && visited[j] == false) {
        count++;
        dfs(j);
      }
    }
    return count;
  }
}