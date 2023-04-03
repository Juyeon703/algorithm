import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[26];
    String str;
    while ((str = br.readLine()) != null) {
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == ' ') continue;
        arr[str.charAt(i) - 'a']++;
      }
    }

    int max = 0;
    for (int a : arr) {
      max = Math.max(max, a);
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == max) System.out.print((char) (i + 'a'));
    }
  }
}