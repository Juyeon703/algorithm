import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    HashSet<Integer> set = new HashSet<>();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      switch (st.nextToken()) {
        case "add" : set.add(Integer.parseInt(st.nextToken())); break;
        case "remove" : set.remove(Integer.parseInt(st.nextToken())); break;
        case "check" : sb.append(set.contains(Integer.parseInt(st.nextToken())) ? 1 : 0).append('\n'); break;
        case "toggle" : int x = Integer.parseInt(st.nextToken());
          if(set.contains(x)) set.remove(x); else set.add(x);
          break;
        case "all" : for (int j = 1; j <=20; j++) {
            set.add(j);
          } break;
        case "empty" : set.clear(); break;
      }
    }
    System.out.println(sb);
  }
}