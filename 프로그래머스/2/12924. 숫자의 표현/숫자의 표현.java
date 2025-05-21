class Solution {
    public int solution(int n) {
        int answer = 1;
        int s = 1;
        while(s < n) {
            int sum = 0;
            for (int i = s; sum < n; i++) {
                sum += i;
            }
            if (sum == n) {
                answer++;
            }
            s++;
        }
        return answer;
    }
}