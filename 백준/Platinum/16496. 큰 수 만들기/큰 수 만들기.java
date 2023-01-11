import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      arr[i] = st.nextToken();
    }
    Arrays.sort(arr, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
       return (o2 + o1).compareTo(o1 + o2);
      }
    });
    for (String s : arr) {
      sb.append(s);
    }
    System.out.println(sb.charAt(0) == '0' ? 0 : sb.toString());
  }
}