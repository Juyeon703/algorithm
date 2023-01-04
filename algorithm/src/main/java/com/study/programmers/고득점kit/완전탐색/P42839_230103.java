package com.study.programmers.고득점kit.완전탐색;

import java.util.HashSet;
import java.util.Iterator;

// 고득점kit - level2
// 완전탐색 - 소수 찾기
public class P42839_230103 {
  public static void main(String[] args) {
    String numbers = "1231";
    solution(numbers);
  }

  static HashSet<Integer> set = new HashSet<>(); // 중복 제거를 위함

  public static int solution(String numbers) {
    int count = 0;
    recursive("", numbers); // 숫자 조합하기
    Iterator<Integer> iterator = set.iterator();
    while (iterator.hasNext()) {
      int num = iterator.next();
      System.out.println(num);
      if (isPrime(num)) count++;
    }
    return count;
  }

  static void recursive(String comb, String others) {
    // 현재 조합을 set에 추가한다.
    if (!comb.equals("")) set.add(Integer.parseInt(comb));
    // 남은 숫자 중 한개를 더 해 새로운 조합을 만든다.
    for (int i = 0; i < others.length(); i++) {
      recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
    }
  }

  static boolean isPrime(int num) {
    if (num == 0 || num == 1) return false;
    // 에라토스테네스의 체의 limit을 계산한다.
    int lim = (int) Math.sqrt(num);
    for (int i = 2; i <= lim; i++) {
      if (num % i == 0) return false;
    }
    return true;
  }
}
