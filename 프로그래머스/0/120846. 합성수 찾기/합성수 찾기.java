class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 0;
        while (i <= n) {
            for (int j = 2; j < i; j++) {
                if (j != i && i % j == 0) {
                    answer++;
                    break;
                }
            }
               i++;
        }
        return answer;
    }
}