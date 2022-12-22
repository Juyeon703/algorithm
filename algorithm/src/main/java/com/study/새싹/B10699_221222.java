package com.study.새싹;

/*
  오늘 날짜
  -> 구현
  문제
  서울의 오늘 날짜를 출력하는 프로그램을 작성하시오.

  입력
  입력은 없다.

  출력
  서울의 오늘 날짜를 "YYYY-MM-DD" 형식으로 출력한다.
*/

import java.time.LocalDate;

public class B10699_221222 {
  public static void main(String[] args) {
    LocalDate now = LocalDate.now();
    System.out.println(now);
  }
}
