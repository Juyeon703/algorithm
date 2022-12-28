class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int denum = denum1*num2 + denum2*num1;
        int num = num1*num2;
        int gcd = 1;
        for(int i = 1; i <= num && i<= denum; i++) {
            if (num % i == 0 && denum % i == 0) {
                gcd = i;
            }
        }
        int[] answer = {denum/gcd, num/gcd};
        return answer;
    }
}