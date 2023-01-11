package com.study.baekjoon;

/*
국영수
  -> 정렬
문제
  도현이네 반 학생 N명의 이름과 국어, 영어, 수학 점수가 주어진다. 이때, 다음과 같은 조건으로 학생의 성적을 정렬하는 프로그램을 작성하시오.

  국어 점수가 감소하는 순서로
  국어 점수가 같으면 영어 점수가 증가하는 순서로
  국어 점수와 영어 점수가 같으면 수학 점수가 감소하는 순서로
  모든 점수가 같으면 이름이 사전 순으로 증가하는 순서로 (단, 아스키 코드에서 대문자는 소문자보다 작으므로 사전순으로 앞에 온다.)

  입력
  첫째 줄에 도현이네 반의 학생의 수 N (1 ≤ N ≤ 100,000)이 주어진다.
  둘째 줄부터 한 줄에 하나씩 각 학생의 이름, 국어, 영어, 수학 점수가 공백으로 구분해 주어진다.
  점수는 1보다 크거나 같고, 100보다 작거나 같은 자연수이다. 이름은 알파벳 대소문자로 이루어진 문자열이고, 길이는 10자리를 넘지 않는다.

  출력
  문제에 나와있는 정렬 기준으로 정렬한 후 첫째 줄부터 N개의 줄에 걸쳐 각 학생의 이름을 출력한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B10825_230105 {

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
//          return (o1.kor - o2.kor) * (-1);
        }
      }
    });

    for (Score s : score) {
      sb.append(s.name).append('\n');
    }
    System.out.println(sb);
  }
}
