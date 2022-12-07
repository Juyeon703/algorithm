import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arrN = new int[n];
    for (int i = 0; i < n; i++) {
      arrN[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arrN);
    int m = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    int[] arrM = new int[m];
    for (int i = 0; i < m; i++) {
      arrM[i] = Integer.parseInt(st.nextToken());
     if (Arrays.binarySearch(arrN, arrM[i]) < 0) sb.append(0).append('\n');
     else sb.append(1).append('\n');
    }
    System.out.println(sb.toString());
  }
}