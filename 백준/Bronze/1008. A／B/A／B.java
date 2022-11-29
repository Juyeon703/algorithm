import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Double a = scanner.nextDouble();
    Double b = scanner.nextDouble();
    System.out.println(a/b);
    scanner.close();
  }
}