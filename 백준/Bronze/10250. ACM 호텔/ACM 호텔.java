import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    for (int i = 0; i < t; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int h = Integer.parseInt(st.nextToken());
      int w = Integer.parseInt(st.nextToken());
      int n = Integer.parseInt(st.nextToken());
      int yy;
      int xx;
      if (n % h == 0) {
        yy = h;
        xx = n/h;
      } else {
        yy = n % h;
        xx = n/h + 1;
      }
      System.out.printf("%d%02d\n", yy, xx);
    }
  }
}