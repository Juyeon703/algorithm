import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[10];
    String n = br.readLine();
    for (int i = 0; i < n.length(); i++) {
      int number = Character.getNumericValue(n.charAt(i));
      arr[number]++;
    }

    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      if (i == 6 || i == 9) continue;
      max = Math.max(max, arr[i]);
    }
    int sum = arr[6] + arr[9];
    max = Math.max(max, sum%2==0 ? sum/2 : sum/2 + 1);
    System.out.println(max);
  }
}