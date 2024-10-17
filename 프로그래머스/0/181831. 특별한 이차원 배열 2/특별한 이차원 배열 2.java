class Solution {
    public int solution(int[][] arr) {
        int n = arr.length;
        int ok = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    ok = 0;
                }
            }
        }
        return ok;
    }
}