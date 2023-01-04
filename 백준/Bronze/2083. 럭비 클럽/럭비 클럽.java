import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String name = st.nextToken();
      int age = Integer.parseInt(st.nextToken());
      int weight = Integer.parseInt(st.nextToken());
      if (name.equals("#") && age == 0 && weight == 0) break;
      String tier;
      if (age > 17 || weight >= 80) {
        tier = "Senior";
      } else {
        tier = "Junior";
      }
      System.out.println(name + " " + tier);
    }
  }
}