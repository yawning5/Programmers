class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int ex = brown + yellow;
        int s = 0;
        for (int i = 1; i < ex; i++) {
            if (ex % i == 0) {
                s = ex / i;
                if (i <= s && (s - 2) * (i - 2) == yellow) {
                    answer[0] = s;
                    answer[1] = i;
                }
            }
        }
        return answer;
    }
}