import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken()); // 여학생 수
    int m = Integer.parseInt(st.nextToken()); // 남학생 수
    int k = Integer.parseInt(st.nextToken()); // 인턴쉽 참여 인원

    int max = Math.min(n/2, m);
    for (int i = max; i >= 0 ; i--) {
      if (n + m - 3 * i - k >= 0) {
        System.out.println(i);
        break;
      }
    }
  }
}