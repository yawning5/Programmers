class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i < 10; i++) {
            answer += (int) (n / Math.pow(10, i)) % 10;
        }
        return answer;
    }
}