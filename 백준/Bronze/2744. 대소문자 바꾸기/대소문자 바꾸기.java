import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] arr = scanner.next().split("");
    for (String s : arr) {
      if (s.equals(s.toLowerCase())) System.out.print(s.toUpperCase());
      else System.out.print(s.toLowerCase());
    }
    scanner.close();
  }
}