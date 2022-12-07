import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    StringTokenizer st2 = new StringTokenizer(str);
    System.out.println(st2.countTokens());
    scanner.close();
  }
}