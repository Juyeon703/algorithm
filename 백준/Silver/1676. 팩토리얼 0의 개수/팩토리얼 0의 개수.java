import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int two = 0;
    int five = 0;
    for (int i = 1; i <= n; i++) {
      int value = i;
      while (value % 2 == 0) {
        two++;
        value /= 2;
      }
      while (value % 5 == 0) {
        five++;
        value /= 5;
      }
    }
    System.out.println(Math.min(two, five));
  }
}