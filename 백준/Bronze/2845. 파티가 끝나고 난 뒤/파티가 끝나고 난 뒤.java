import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int party = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()); // 사람수 * 면적
    st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 5; i++) {
      sb.append(Integer.parseInt(st.nextToken()) - party).append(' ');
    }
    System.out.println(sb);
  }
}