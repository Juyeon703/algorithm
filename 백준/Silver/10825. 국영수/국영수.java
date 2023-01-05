import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
  static class Score {
    String name;
    int kor;
    int eng;
    int math;

    public Score(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    Score[] score = new Score[n];
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      score[i] = new Score(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
    }
    // 기본 오름차순
    // 국어 내림차순, 영어 오름차순, 수학 내림차순, 이름 오름차순
    Arrays.sort(score, new Comparator<Score>() {
      @Override
      public int compare(Score o1, Score o2) {
        if (o1.kor == o2.kor) {
          if (o1.eng == o2.eng) {
            if (o1.math == o2.math) {
              return o1.name.compareTo(o2.name);
            } else {
              return o2.math - o1.math;
            }
          } else {
            return o1.eng - o2.eng;
          }
        } else {
          return o2.kor - o1.kor;
        }
      }
    });

    for (Score s: score) {
      sb.append(s.name).append('\n');
    }
    System.out.println(sb);
  }
}