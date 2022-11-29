import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] arr = new int[8];
    String result = "";
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scanner.nextInt();
    }
    int[] arrA = {1, 2, 3, 4, 5, 6, 7, 8};
    int[] arrB = {8, 7, 6, 5, 4, 3, 2, 1};
    if (Arrays.equals(arr, arrA)) result = "ascending";
    else if (Arrays.equals(arr, arrB)) result = "descending";
    else result = "mixed";
    System.out.println(result);
    scanner.close();
  }
}