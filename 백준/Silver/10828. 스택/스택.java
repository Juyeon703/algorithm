import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    Stack<Integer> stack = new Stack<>();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      switch (st.nextToken()) {
        case "push" : stack.push(Integer.parseInt(st.nextToken())); break;
        case "pop" : sb.append(stack.empty() ? -1 : stack.pop()).append('\n'); break;
        case "size" : sb.append(stack.size()).append('\n'); break;
        case "empty" : sb.append(stack.empty() ? 1 : 0).append('\n'); break;
        case "top" : sb.append(stack.empty() ? -1 : stack.peek()).append('\n'); break;
      }
    }
    System.out.println(sb);
  }
}