import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    String s = st.nextToken(); // 개강총회 시작시간
    String e = st.nextToken(); // 끝낸 시간
    String q = st.nextToken(); // 스트리밍 끝낸 시간

    Set<String> team = new HashSet<>();
    String temp;
    int count = 0;
    while ((temp = br.readLine()) != null) {
      st = new StringTokenizer(temp);
        String time = st.nextToken();
        String name = st.nextToken();
        if (time.compareTo(s) <= 0) team.add(name);

        if (time.compareTo(e) >= 0 && time.compareTo(q) <= 0 && team.contains(name)) {
          count++;
          team.remove(name);
        }
    }

    System.out.println(count);
  }
}