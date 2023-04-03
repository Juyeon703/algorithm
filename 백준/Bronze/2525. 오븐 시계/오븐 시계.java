import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int h = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int runningTime = Integer.parseInt(br.readLine());

    m += runningTime;

    while (m >= 60) {
      h++;
      m -= 60;
      if (h == 24) h = 0;
    }

    System.out.println(h + " " + m);
  }
}