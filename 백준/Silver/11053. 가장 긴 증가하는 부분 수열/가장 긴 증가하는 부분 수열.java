import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int[] result = new int[n];
    result[0] = 1;
    for (int i = 1; i < n; i++) {
      result[i] = 1;
      for (int j = 0; j < i; j++) {
        if (arr[i] > arr[j])
          result[i] = Math.max(result[j] + 1, result[i]);
      }
    }
    int max = 0;
    for (int i = 0; i < n; i++) {
      if (result[i] > max) max = result[i];
    }
    System.out.println(max);
  }
}