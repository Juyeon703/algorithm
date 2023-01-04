import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
  static String str1, str2, str3;
  static int[] abc;
  static HashSet<Character> set;
  static boolean result = false;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    str1 = st.nextToken();
    str2 = st.nextToken();
    str3 = st.nextToken();
    if (distinct() > 10) System.out.println("NO");
    else {
      abc = new int[26];
      Arrays.fill(abc, -1);
      int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
      int[] output = new int[set.size()];
      boolean[] visited = new boolean[10];
      permutation(arr, output, visited, 0, set.size());
      if (result) System.out.println("YES");
      else System.out.println("NO");
    }
  }

  static void verification(int[] output) {
    Iterator<Character> iterator = set.iterator();
    for (int i = 0; i < set.size(); i++) {
      abc[iterator.next() - 'A'] = output[i];
    }
    if (calc(str1) + calc(str2) == calc(str3)) result = true;
//    System.out.println("result = " + result);
  }

  // 순열 구하기
  // n개 중에서 r개를 순서있게 뽑기
  static void permutation(int[] arr, int[] output, boolean[] visited, int depth, int r) {
    if (!result) { // result가 ture가 된 순간 멈춤
      if (depth == r) {
//        for (int a : output) {
//          System.out.print(a);
//        }
//        System.out.println();
        verification(output);
        return;
      }
      for (int i = 0; i < 10; i++) {
        if (!visited[i]) {
          visited[i] = true;
          output[depth] = arr[i];
          permutation(arr, output, visited, depth + 1, r);
          visited[i] = false;
        }
      }
    }
  }

  static int calc(String str) {
    int sum = 0;
    int j = 1;
    for (int i = str.length() - 1; i >= 0; i--) {
      sum += (abc[str.charAt(i) - 'A'] * j);
      j *= 10;
    }
//    System.out.println(str + ": " + sum);
    return sum;
  }

  static int distinct() {
    set = new HashSet<>();
    for (int i = 0; i < str1.length(); i++) {
      set.add(str1.charAt(i));
    }
    for (int i = 0; i < str2.length(); i++) {
      set.add(str2.charAt(i));
    }
    for (int i = 0; i < str3.length(); i++) {
      set.add(str3.charAt(i));
    }
    return set.size();
  }
}