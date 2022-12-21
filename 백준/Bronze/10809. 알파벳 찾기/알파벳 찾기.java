import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int[] alphabet = new int[26];
    Arrays.fill(alphabet, -1);
    String input = scanner.next();
    for (int i = 0; i < input.length(); i++) {
      if (alphabet[input.charAt(i) - 97] == -1) alphabet[input.charAt(i) - 97] = i;
    }
    for (int num : alphabet) {
      System.out.print(num + " ");
    }
    scanner.close();
  }
}