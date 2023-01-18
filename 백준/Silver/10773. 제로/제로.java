import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int k = Integer.parseInt(br.readLine());
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < k; i++) {
      int value = Integer.parseInt(br.readLine());
      if (value != 0) stack.push(value);
      else stack.pop();
    }
    int sum = 0;
    for (int a : stack) {
      sum += a;
    }
    System.out.println(sum);
  }
}