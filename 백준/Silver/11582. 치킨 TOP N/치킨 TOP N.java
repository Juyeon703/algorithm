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
    int k = Integer.parseInt(br.readLine());

    int[] score = new int[n];
    for (int i = 0; i < n; i++) {
      score[i] = Integer.parseInt(st.nextToken());
    }
    for (int i = 0; i < n; i += n/k) {
      Arrays.sort(score, i, i + n/k);
    }
    for (int a : score) {
      sb.append(a).append(" ");
    }
    System.out.println(sb);
  }
}