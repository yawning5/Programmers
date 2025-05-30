import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>(); 
        
        for (int i = 0; i < tangerine.length; i++) {
            map.compute(tangerine[i], 
                        (key, value) -> value == null ? 1 : value + 1);
        }
        
        List<Map.Entry<Integer, Integer>> list = 
            new ArrayList<>(map.entrySet());
        
        list.sort((a, b) -> b.getValue() - a.getValue());
            
        for (int i = 0; k > 0; i++) {
             k -= list.get(i).getValue();
            answer++;
        }
        
        
            
        return answer;
    }
}