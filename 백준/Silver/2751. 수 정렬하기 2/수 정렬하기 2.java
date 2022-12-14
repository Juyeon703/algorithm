import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int arr[] = new int[n];
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      list.add(Integer.parseInt(br.readLine()));
    }
    Collections.sort(list);
    for (int a : list) {
      sb.append(a).append('\n');
    }
    System.out.println(sb);
  }
}