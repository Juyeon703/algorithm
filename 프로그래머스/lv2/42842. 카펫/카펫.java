class Solution {
    public int[] solution(int brown, int yellow) {
      int sum = brown + yellow;
      int x = 0;
      int y = 0;
      for (int i = 1; i <= yellow; i++) {
        if (yellow % i == 0) {
          x = Math.max(i, yellow/i);
          y = Math.min(i, yellow/i);
          if ((x+2) * (y+2) == sum) break;
        }
      }
   
      return new int[] {x+2, y+2};
    }
}