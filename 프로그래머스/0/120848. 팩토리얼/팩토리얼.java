class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 1;
        while (sum * (answer + 1) <= n) {
            int i = answer + 1;
            sum *= i;
            answer++;

        }
        return answer;
    }
}