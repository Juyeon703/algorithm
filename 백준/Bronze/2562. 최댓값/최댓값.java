import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] arr = new int[9];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scanner.nextInt();
    }
    int max = arr[0];
    int maxIndex = 0;
    for (int i = 0; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
        maxIndex = i;
      }
    }
    System.out.println(max);
    System.out.println(maxIndex + 1);
    scanner.close();
  }
}