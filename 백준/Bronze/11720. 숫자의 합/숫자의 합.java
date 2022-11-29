import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String str = scanner.next();
    int sum = 0;
    String[] arr = str.split("");
    for (String s: arr) {
      sum += Integer.parseInt(s);
    }
    System.out.println(sum);
  }
}