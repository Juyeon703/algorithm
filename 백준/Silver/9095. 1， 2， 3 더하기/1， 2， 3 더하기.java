import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    int[] arr = new int[11];
    arr[1] = 1;
    arr[2] = 2;
    arr[3] = 4;
    for (int i = 4; i < 11; i++) {
      arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < t; i++) {
      sb.append(arr[Integer.parseInt(br.readLine())]).append('\n');
    }
    System.out.println(sb);
  }
}