import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String[] str = new String[n];
    for (int i = 0; i < str.length; i++) {
      int sum = 0;
      str[i] = scanner.next();
      String[] arr = str[i].split("X");
      for (String s : arr) {
        int splitSum = 0;
        for (int j = 1; j < s.length() + 1; j++) {
          splitSum += j;
        }
        sum += splitSum;
      }
      System.out.println(sum);
    }
    scanner.close();
  }
}