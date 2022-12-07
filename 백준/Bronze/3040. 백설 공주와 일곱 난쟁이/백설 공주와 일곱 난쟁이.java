import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[9];
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(bf.readLine());
      sum += arr[i];
    }
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int temp1 = 0;
    int temp2 = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (sum - arr[i] - arr[j] == 100) {
          temp1 = i;
          temp2 = j;
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if (i != temp1 && i != temp2) bw.write(arr[i] + "\n");
    }
    bw.flush();
    bw.close();
  }
}