import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    if (n == 1) System.out.println(1);
    else {
      int count = 1;
      int value = 1;
      while (value < n) {
        value += 6 * count;
        count++;
      }
      System.out.println(count);
    }
  }
}