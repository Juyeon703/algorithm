package com.study;

import java.io.*;
import java.util.*;

/*
  단어 정렬
    문자열, 정렬
    
  - 문제
  알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

  길이가 짧은 것부터
  길이가 같으면 사전 순으로
  
  - 입력
  첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.

  - 출력
  조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.
*/
public class B1181_221202 {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(bf.readLine());
    HashSet<String> list = new HashSet<>(); // 중복제거를 위함
    for (int i = 0; i < n; i++) {
      list.add(bf.readLine());
    }
    String[] arr = new String[list.size()];
    list.toArray(arr);
    Arrays.sort(arr, Comparator.comparing(String::length)); // 길이로 정렬
//    Arrays.sort(arr, new Comparator<String>(){
//      public int compare(String s1, String s2){
//        return Integer.compare(s1.length(), s2.length());
//      }
//    });
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i].length() == arr[j].length()) {
          Arrays.sort(arr, i, j + 1);
//          System.out.println("i = " + i);
//          System.out.println("j = " + j);
        }
      }
    }
    for (String s : arr) {
//      System.out.println("s = " + s);
      sb.append(s).append("\n");
    }
    System.out.println(sb.toString());
    bf.close();
  }
}

// 리스트에서 중복 제거하기
// 1) Set
//    : HashSet, TreeSet 등, Set은 중복 요소를 허용하지 않는 자료 구조임
//        -> 리스트를 set으로 변환 후 다시 리스트로 변환하여 사용
// HashSet : 중복데이터 안됨, 순서 없음, 성능 좋음
// LinkedHashSet : 중복데이터 안됨, 입력된 순서대로 저장, 성능 제일 낮음
// TreeSet : 중복데이터 안됨, 오름차순으로 데이터 정렬, 성능 조금 떨어짐
// ** 중복 요소가 있는지 확인하기 위해서는 리스트들의 크기를 비교하면 됨
// 2) Stream.distinct()
//    -> list.stream().distinct().toList();
// ** list 수정시 주의사항
// new로 생성하지 않는 List의 값을 변경하려 한다면 UnsupportedOperationException 에러가 발생한다.
