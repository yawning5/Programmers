class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        for (int i = 2; i <= a; i++){
            while(a % i == 0 && b % i == 0) {
                a = a / i;
                b = b / i;
                }
            }
        while (b % 5 == 0 || b % 2 == 0) {
            if (b % 5 == 0) {
                b = b / 5;
                } else b = b / 2;
            }
        answer = b == 1 ? 1 : 2;
        return answer;
    }
}