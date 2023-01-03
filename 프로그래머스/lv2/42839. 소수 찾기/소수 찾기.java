import java.util.HashSet;
import java.util.Iterator;
class Solution {
    static HashSet<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
      int count = 0;
      recursive("", numbers);
      Iterator<Integer> iterator = set.iterator();
      while (iterator.hasNext()) {
        int num = iterator.next();
        System.out.println(num);
        if (isPrime(num)) count++;
      }
      return count;
    }
    static void recursive(String comb, String others) {
      if (!comb.equals("")) set.add(Integer.parseInt(comb));
      for (int i = 0; i < others.length(); i++) {
        recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
      }
    }
    static boolean isPrime(int num) {
      if (num == 0 || num == 1) return false;
      int lim = (int) Math.sqrt(num);
      for (int i = 2; i <= lim; i++) {
        if (num % i == 0) return false;
      }
      return true;
    }
}
