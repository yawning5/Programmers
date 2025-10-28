import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(0);
        
        for (int i = 0; i < numbers.length; i++) {
            int size = q.size();
            for (int j = 0; j < size; j++) {
                int cur = q.poll();
                q.offer(cur + numbers[i]);
                q.offer(cur - numbers[i]);
            }
        }
        
        while(!q.isEmpty()) {
            if (q.poll() == target) answer++;
        }
        
        return answer;
    }
}