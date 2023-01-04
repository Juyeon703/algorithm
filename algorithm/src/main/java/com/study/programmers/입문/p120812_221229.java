package com.study.programmers.입문;

import java.util.*;

// Day 3
// 최빈값 구하기
public class p120812_221229 {
  public static void main(String[] args) {
    int[] array = {1, 1, 2, 2, 4, 5};
    System.out.println(solution(array));
  }

  public static int solution(int[] array) {
    int answer = 0;

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int j : array) {
      map.put(j, map.getOrDefault(j, 0) + 1);
    }
    System.out.println();
    List<Integer> keyList = new ArrayList<>();
    for(Map.Entry<Integer, Integer> entry : map.entrySet()){
      if(entry.getValue().equals(Collections.max(map.values())) ){
        keyList.add(entry.getKey());
      }
    }
    if (keyList.size() > 1) return answer;
    else return keyList.get(0);
  }
}
