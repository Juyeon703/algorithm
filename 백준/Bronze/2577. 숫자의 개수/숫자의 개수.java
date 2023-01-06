import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());
    int num = a*b*c;
    int[] arr = new int[10];

    // 숫자 1자리씩
    while (num > 0) {
      arr[num % 10]++;
      num /= 10;
    }
    for (int i : arr) {
      System.out.println(i);
    }
  }
}