class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int l = 0;
        int h = 0;
        int[] f = dots[0];
        for (int i = 0; i < 4; i++) {
            if (f[0] == dots[i][0]) {
                h = Math.abs(f[1] - dots[i][1]);
            } else {
                l = Math.abs(f[0] - dots[i][0]);
            }
        }
        
        answer = h * l;
        
        return answer;
    }
}