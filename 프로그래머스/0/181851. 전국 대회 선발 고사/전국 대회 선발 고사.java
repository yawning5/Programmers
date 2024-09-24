import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
            int answer = 0;
            Map<Integer, Integer> students = new HashMap<>();
            for (int i = 0; i < rank.length; i++) {
                if (!attendance[i]) {
                    rank[i] = 101;
                } else students.put(rank[i], i);
            }
            Arrays.sort(rank);

            return students.get(rank[0]) * 10000 + students.get(rank[1]) * 100 + students.get(rank[2]);
    }
}