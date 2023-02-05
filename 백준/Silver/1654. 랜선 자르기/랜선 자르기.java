import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int k = Integer.parseInt(st.nextToken()); // 가지고 있는 랜선 개수
    int n = Integer.parseInt(st.nextToken()); // 필요한 랜선 개수
    long[] arr = new long[k];
    long max = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(br.readLine());
      max = Math.max(max, arr[i]);
    }

    long min = 1;

    while (min <= max) {
      long mid = (max + min) / 2;

      long count = 0;
      for (int i = 0; i < arr.length; i++) {
        count += (arr[i] / mid);
      }

      if(count < n) {
        max = mid - 1;
      }
      else {
        min = mid + 1;
      }
    }
    System.out.println(max);
  }
}