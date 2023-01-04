import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
  static String str1, str2, str3;
  static int[] abc;
  static List<Character> list;
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
      boolean[] visited = new boolean[10];
      permutation(visited, 0);
      if (result) System.out.println("YES");
      else System.out.println("NO");
    }
  }

  // 순열 구하기
  // n개 중에서 r개를 순서있게 뽑기
  static void permutation(boolean[] visited, int depth) {
    if (!result) { // result가 ture가 된 순간 멈춤
      if (depth == list.size()) {
//        for (int a: abc) {
//          System.out.print(a + " ");
//        }
//        System.out.println();
        if (calc(str1) + calc(str2) == calc(str3)) result = true;
//        System.out.println("result = " + result);
        return;
      }
      for (int i = 0; i < 10; i++) {
        if (!visited[i]) {
          visited[i] = true;
          abc[list.get(depth) - 'A'] = i;
          permutation(visited, depth + 1);
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
    list = new ArrayList<>();
    for (int i = 0; i < str1.length(); i++) {
      if (!list.contains(str1.charAt(i))) list.add(str1.charAt(i));
    }
    for (int i = 0; i < str2.length(); i++) {
      if (!list.contains(str2.charAt(i))) list.add(str2.charAt(i));
    }
    for (int i = 0; i < str3.length(); i++) {
      if (!list.contains(str3.charAt(i))) list.add(str3.charAt(i));
    }
    return list.size();
  }
}