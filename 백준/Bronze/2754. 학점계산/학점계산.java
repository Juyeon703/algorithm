import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.next();
    if (str.equals("F")) {
      System.out.println(0.0);
    } else {
      double score = 69 - str.charAt(0);
      switch (str.charAt(1)) {
        case '+':
          score += 0.3;
          break;
        case '-':
          score -= 0.3;
          break;
      }
      System.out.println(score);
    }
  }
}