import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] origin = new int[] {1, 1, 2, 2, 2, 8};
    for (int i = 0; i < origin.length; i++) {
      System.out.print(origin[i] - scanner.nextInt() + " ");
    }
  }
}