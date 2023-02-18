import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Map<String, Integer> tree = new TreeMap<>();
    String name;
    double total = 0;
    while ((name = br.readLine()) != null) {
      tree.put(name, tree.getOrDefault(name, 0) + 1);
      total++;
    }

    StringBuilder sb = new StringBuilder();
    for (Map.Entry<String, Integer> entry : tree.entrySet()) {
      sb.append(entry.getKey() + " " + String.format("%.4f", entry.getValue()/total * 100)).append('\n');
    }
    System.out.println(sb);
  }
}