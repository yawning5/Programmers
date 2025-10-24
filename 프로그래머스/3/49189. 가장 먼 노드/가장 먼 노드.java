import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        List<Integer>[] adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }
        
        for (int[] e : edge) {
            int a = e[0], b = e[1];
            adj[a].add(b);
            adj[b].add(a);
        }
        
        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1);
    
    Deque<Integer> q = new ArrayDeque<>();
    q.offer(1); // 시작 노드
    dist[1] = 0; // 시작 거리는 0
    
    while(!q.isEmpty()) {
        int cur = q.poll();
        for (int next : adj[cur]) {
            if (dist[next] == -1) {
                dist[next] = dist[cur] + 1;
                q.offer(next);
            }
        }
    }
    
        int maxDist = 0;
        for (int i = 1; i <= n; i++) {
            maxDist = Math.max(maxDist, dist[i]);
        }
        for (int i = 1; i <= n; i++) {
            if (dist[i] == maxDist) answer++;
        }
    
    return answer;
}
}