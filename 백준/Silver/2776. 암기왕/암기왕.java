import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int t = Integer.parseInt(br.readLine()); // 테스트케이스
    for (int i = 0; i < t; i++) {
      int n = Integer.parseInt(br.readLine()); // 수첩1 정수 개수
      int[] arr = new int[n]; // 수첩1
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < n; j++) {
        arr[j] = Integer.parseInt(st.nextToken());
      }
      Arrays.sort(arr);
      int m = Integer.parseInt(br.readLine()); // 수첩2 정수 개수
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < m; j++) {
        if (Arrays.binarySearch(arr, Integer.parseInt(st.nextToken())) >= 0) sb.append(1).append('\n');
        else sb.append(0).append('\n');
      }
    }
    System.out.println(sb);
  }
}