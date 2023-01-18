import java.util.Arrays;
class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] number = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
          number[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(number, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        if (number[0].equals("0")) {
            return "0";
        } else {
            for (String s: number) {
              answer.append(s);
            }
            return answer.toString();
        }
    }
}