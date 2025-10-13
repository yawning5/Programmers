import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        int zeroCount = 0, matchCount = 0;
        
        Set<Integer> winSet = new HashSet<>();
        for (int w : win_nums) winSet.add(w);
        
        for (int l : lottos) {
            if (l == 0) zeroCount++;
            else if (winSet.contains(l)) matchCount++;
        }
        
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        return new int[]{ rank[matchCount + zeroCount], rank[matchCount] };
        
    }
}