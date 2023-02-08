import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken()); // 김밥 개수
    int k = Integer.parseInt(st.nextToken()); // 꼬다리 길이
    int m = Integer.parseInt(st.nextToken()); // 김밥조각 최소 개수
    List<Integer> list = new ArrayList<>();
    int max = 0;

    for (int i = 0; i < n; i++) {
      int value = Integer.parseInt(br.readLine());
        
      if (value > (2 * k)) {
        list.add(value - (2 * k));
        max = Math.max(max, value - (2*k));
      }
      if(2*k > value && value>k) {
        list.add(value - k);
        max = Math.max(max, value - k);
      }
    }

    int start = 1;
    int end = max;
    int result = -1;

    while (end - start >= 0) {
      int mid = (end + start) / 2;

      int sum = 0;
      for (int a : list) {
        sum += a / mid;
      }
      if (sum >= m) {
        result = mid;
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    System.out.println(result);
  }
}