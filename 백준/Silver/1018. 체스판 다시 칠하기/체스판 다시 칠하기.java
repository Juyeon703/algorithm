import java.io.*;
import java.util.StringTokenizer;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String str = bf.readLine();
    StringTokenizer st = new StringTokenizer(str);
    int n = Integer.parseInt(st.nextToken()); 
    int m = Integer.parseInt(st.nextToken()); 
    String[] arrN = new String[n];
    String[][] arr = new String[n][m];
    for (int i = 0; i < n; i++) {
      arrN[i] = bf.readLine();
      for (int j = 0; j < m; j++) {
        arr[i][j] = String.valueOf(arrN[i].charAt(j));
      }
    }
    bf.close();
    int startN = 0;
    int startM = 0;
    int min = 64;
    for (int i = 0; i < n - 7; i++) {
      for (int j = 0; j < m - 7; j++) {
        startN = i;
        startM = j;
        int count = Math.min(function(arr, startN, startM), 64 - function(arr, startN, startM));
        if (count < min) min = count;
      }
    }
    bw.write(min + "\n");
    bw.flush();  
    bw.close();
  }

  static int function(String[][] arr, int startN, int startM) {
    int count = 0;
    if (arr[startN][startM].equals("B")) {
      for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
          if((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0) ) {
            if (arr[startN + i][startM + j].equals("W")) count++;
          } else {
            if (arr[startN + i][startM + j].equals("B")) count++;
          }
        }
      }
    } else {
      for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
          if((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0) ) {
            if (arr[startN + i][startM + j].equals("B")) count++;
          } else {
            if (arr[startN + i][startM + j].equals("W")) count++;
          }
        }
      }
    }
    return count;
  }
}
