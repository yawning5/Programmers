import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        int n = maps.length; // 세로(y)
        int m = maps[0].length; // 가로(x)
        boolean[][] visited = new boolean[n][m];
        int[][] dist = new int[n][m];
        Queue<int[]> q = new ArrayDeque<>();
        
        q.offer(new int[]{0, 0});
        visited[0][0] = true;
        dist[0][0] = 1;
        
        int[] dy = {-1, 1, 0, 0};
        int[] dx = {0, 0, -1, 1};
        
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int cy = cur[0];
            int cx = cur[1];
            
            for (int i = 0; i < 4; i++) {
                int ny = cy + dy[i];
                int nx = cx + dx[i];
                
                if (ny < 0 || nx < 0 || ny >= n || nx >= m) continue;
                if (visited[ny][nx]) continue;
                if (maps[ny][nx] == 0) continue;
                
                visited[ny][nx] = true;
                dist[ny][nx] = dist[cy][cx] + 1;
                q.offer(new int[]{ny, nx});
            }
        }
        answer = dist[n - 1][m - 1];
        return answer == 0 ? -1 : answer;
    }
}