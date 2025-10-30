import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        Queue<String> q = new ArrayDeque<>();
        q.offer(begin);
        int[] visited = new int[words.length];
        
        while(!q.isEmpty()) {
            int size = q.size();
            
            for (int s = 0; s < size; s++) {
                String cur = q.poll();
                if (cur.equals(target)) {return answer;}
                for(int i = 0; i < words.length; i++) {
                    if(canChange(cur, words[i]) && visited[i] == 0) {
                        q.offer(words[i]);
                        visited[i] = 1;
                    }
                }
            }
            answer++;
        }
        
        return 0;
    }
    
    private Boolean canChange(String cur, String word) {
        int diff = 0;
        for (int i = 0; i < cur.length(); i++) {
            if (cur.charAt(i) != word.charAt(i)) diff++;
            if (diff > 1) return false;
        }
        return diff == 1;
    }
}