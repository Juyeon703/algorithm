import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int t = Integer.parseInt(br.readLine());
    int[][] fibonacci = new int[41][2];
    fibonacci[0][0] = 1;
    fibonacci[0][1] = 0;
    fibonacci[1][0] = 0;
    fibonacci[1][1] = 1;
    for (int i = 2; i < 41; i++) {
    fibonacci[i][0] = fibonacci[i - 1][0] + fibonacci[i - 2][0];
    fibonacci[i][1] = fibonacci[i - 1][1] + fibonacci[i - 2][1];
    }
    for (int i = 0; i < t; i++) {
      int n = Integer.parseInt(br.readLine());
      sb.append(fibonacci[n][0]).append(' ').append(fibonacci[n][1]).append('\n');
    }
    System.out.println(sb);
  }
}