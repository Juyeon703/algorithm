import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int max = 0;
    double sum = 0;
    int[] score = new int[n];
    double[] newScore = new double[n];
    for (int i = 0; i < n; i++) {
      score[i] = Integer.parseInt(st.nextToken());
      if (score[i] > max) max = score[i];
    }
    for (int i = 0; i < n; i++) {
      newScore[i] = (double) score[i]/max * 100;
      sum += newScore[i];
    }
    System.out.println(sum/n);
  }
}