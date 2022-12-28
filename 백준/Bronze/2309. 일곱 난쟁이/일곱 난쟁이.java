import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[9];
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(br.readLine());
      sum += arr[i];
    }
    Arrays.sort(arr);
    int a = 0;
    int b = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (sum - arr[i] - arr[j] == 100) {
          a = i;
          b = j;
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if (i != a && i != b) {
        System.out.println(arr[i]);
      }
    }
  }
}