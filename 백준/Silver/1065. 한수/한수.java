import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int count = 99;

    if (n < 100) System.out.println(n);
    else {
      for (int i = 100; i <= n; i++) {
        if (i == 1000) break;
        int[] arr = new int[3];
        int j = 0;
        int temp = i;
        while (temp > 0) {
          arr[j] = temp % 10;
          temp /= 10;
          j++;
        }
        if (arr[0] - arr[1] == arr[1] - arr[2]) count++;
      }
      System.out.println(count);
    }
  }
}