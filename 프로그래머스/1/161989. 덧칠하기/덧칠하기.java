import java.util.Arrays;


class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] wall = new int[n];
        
        for (int i : section) {
            wall[i - 1] = 1;
        }
        
        for (int i = 0; i < n; i++) {
            if ( wall[i] == 1) {
                answer++;
                int end = Math.min(i + m, n);
                Arrays.fill(wall , i, end, 0);
            }
        }
        
        
        return answer;
    }
}