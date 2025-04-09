import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int[] max = new int[2];
        int answer = 0;
        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
            max[0] = Math.max(max[0], sizes[i][0]);
            max[1] = Math.max(max[1], sizes[i][1]);
        }
        return max[0] * max[1];
    }
}