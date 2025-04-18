class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long lx = (long) x;
        long d = x;
        for (int i = 0; i < n; i++) {
            answer[i] = lx;
            lx += d;
        }
        return answer;
    }
}