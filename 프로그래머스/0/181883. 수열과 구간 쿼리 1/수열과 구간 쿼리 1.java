class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            for (int r = queries[i][0]; r <= queries[i][1]; r++) {
                arr[r] += 1;
            }
        }
        return arr;
    }
}