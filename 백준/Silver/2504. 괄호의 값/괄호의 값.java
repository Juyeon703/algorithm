import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    Stack<Character> stack = new Stack<>();
    int num = 1;
    int result = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '(') {
        stack.push(str.charAt(i));
        num *= 2;
      } else if (str.charAt(i) == '[') {
        stack.push(str.charAt(i));
        num *= 3;
      } else if (str.charAt(i) == ')') {
        if (stack.empty() || stack.peek() != '(') {
          result = 0;
          break;
        } else if (str.charAt(i - 1) == '(') {
          result += num;
        }
        num /= 2;
        stack.pop();
      } else if (str.charAt(i) == ']') {
        if (stack.empty() || stack.peek() != '[') {
          result = 0;
          break;
        } else if (str.charAt(i - 1) == '[') {
          result += num;
        }
        num /= 3;
        stack.pop();
      }
    }

    if (!stack.isEmpty()) System.out.println('0');
    else System.out.println(result);
  }
}