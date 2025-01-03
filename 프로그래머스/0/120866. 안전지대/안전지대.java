class Solution {
    public int solution(int[][] board) {
        int n = board.length;

        int[][] tempBoard = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    markDangerZone(tempBoard, i, j, n);
                }
            }
        }

        int safeCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (tempBoard[i][j] == 0) {
                    safeCount++;
                }
            }
        }

        return safeCount;
    }

    public void markDangerZone(int[][] board, int y, int x, int n) {
        for (int i = y - 1; i <= y + 1; i++) {
            for (int j = x - 1; j <= x + 1; j++) {
                if (i >= 0 && i < n && j >= 0 && j < n) {
                    board[i][j] = 1;
                }
            }
        }
    }
}