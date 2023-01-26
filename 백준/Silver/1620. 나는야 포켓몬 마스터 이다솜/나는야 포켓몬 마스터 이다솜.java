import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken()); // 포켓몬 개수
    int m = Integer.parseInt(st.nextToken()); // 문제 개수
    HashMap<String, Integer> pocketmon = new HashMap<>();
    String[] pocketmonArr = new String[n + 1];
    for (int i = 1; i <= n; i++) {
      String str = br.readLine();
      pocketmon.put(str, i);
      pocketmonArr[i] = str;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < m; i++) {
      String str = br.readLine();
      if (Character.isDigit(str.charAt(0))) {
        sb.append(pocketmonArr[Integer.parseInt(str)]).append('\n');
      } else {
        sb.append(pocketmon.get(str)).append('\n');
      }
    }
    System.out.println(sb);
  }
}