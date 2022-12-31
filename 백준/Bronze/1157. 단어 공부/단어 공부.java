import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int[] arr = new int[26];
    // 대문자 범위 65~90
    // 소문자 범위 97~122
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) <= 90) arr[str.charAt(i) - 'A']++;
      else arr[str.charAt(i) - 'a']++;
    }
    int max = 0;
    char result = '?';
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
        result = (char) (i + 65);
      }
      else if (arr[i] == max) result = '?';
    }
    System.out.println(result);
  }
}