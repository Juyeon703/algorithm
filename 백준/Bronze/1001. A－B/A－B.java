import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner keyboardInput = new Scanner(System.in);
    int a = keyboardInput.nextInt();
    int b = keyboardInput.nextInt();
    System.out.println(a - b);
    keyboardInput.close();
  }
}