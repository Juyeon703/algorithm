import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int solution(int[] citations) {
       int answer = 0;
       Arrays.sort(citations);
       for (int i = citations.length; i > 0; i--) {
         int count = 0;
         for (int j = 0; j < citations.length; j++) {
           if (citations[j] >= i) count++;
          }
          if (count >= i) {
            answer = i;
            break;
           }
        }
        return answer;
    }
}