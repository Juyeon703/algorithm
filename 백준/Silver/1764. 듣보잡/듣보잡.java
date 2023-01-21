import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken()); // 듣도 못한 사람
    int m = Integer.parseInt(st.nextToken()); // 보도 못한 사람
    HashSet<String> set = new HashSet<>();
    List<String> result = new ArrayList<>();
    for (int i = 0; i < n + m; i++) {
      if (i < n) {
        set.add(br.readLine());
      } else {
        String str = br.readLine();
        if (set.contains(str)) {
          result.add(str);
        }
      }
    }
    StringBuilder sb = new StringBuilder();
    sb.append(result.size()).append('\n');
    Collections.sort(result);
    for (String s : result) {
      sb.append(s).append('\n');
    }
    System.out.println(sb);
  }
}