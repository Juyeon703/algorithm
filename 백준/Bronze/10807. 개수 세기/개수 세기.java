import java.util.Scanner;
public class Main {
  static int count = 0;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scanner.nextInt();
    }
    int v = scanner.nextInt();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == v) count++;
    }
    System.out.println(count);
  }
}