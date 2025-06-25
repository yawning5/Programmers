import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> fashion = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            fashion.compute(clothes[i][1], (k, v) -> v == null ? 1 : v + 1);
        }
        answer = fashion.values().stream()
            .map(v -> v + 1)
            .reduce(1, (a, b) -> a * b) - 1;
        return answer;
    }
}