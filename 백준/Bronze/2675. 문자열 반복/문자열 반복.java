import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    for (int i = 0; i < t; i++) {
      int r = scanner.nextInt();
      String s = scanner.next();
      String[] str = s.split("");
      for (int j = 0; j < str.length; j++) {
        for (int k = 0; k < r; k++) {
          System.out.print(str[j]);
        }
      }
      System.out.println();
    }
    scanner.close();
  }
}