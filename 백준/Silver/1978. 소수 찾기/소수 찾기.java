
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int count = 0;
  static int[] arr;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    prime();
    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(st.nextToken());
      if (arr[num] != 0) count++;
    }
    System.out.println(count);
    br.close();
  }

  static void prime() {
    int number = 1000;
    arr = new int[number + 1];
    for (int i = 2; i < number + 1 ; i++) {
      arr[i] = i;
    }

    for (int i = 2; i < number + 1; i++) {
      if (arr[i] == 0) continue;
      for (int j = i * 2 ; j < number + 1 ; j += i) {
        arr[j] = 0;
      }
    }
  }
}